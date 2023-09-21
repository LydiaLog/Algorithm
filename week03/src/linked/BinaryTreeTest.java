package linked;

class BinaryTreeTest {
	public static void main(String args[]) {
		BinaryTree btree;
		BinaryTree ltree;
		BinaryTree rtree;
		BinaryTree current;

		// "A(B, C)" 만들기 
		ltree = new BinaryTree(new BinaryTree(), "B", new BinaryTree());
		rtree = new BinaryTree(new BinaryTree(), "C", new BinaryTree());
		btree = new BinaryTree(ltree, "A", rtree);	
		// "G(null, H)" 만들기 
		rtree = new BinaryTree(new BinaryTree(), "H", new BinaryTree());
		btree = new BinaryTree(new BinaryTree(), "G", rtree);
        //  빈칸을 채워서 이진 트리를 완성하라. (ppt에 주이진 이진트리)     
		// "E(G(null, H), null)" 만들기 
		//	
		// "B(D, E(G(null, H), null))" 만들기  
		//
		// "C(F, null)" 만들기
		//		
		// "A( B(D, E(G(null, H), null)), C(F, null) )" 만들기 
		//
		// inorder traversing
		System.out.println("The order of inorder traversing");
		btree.inorder(btree);
		System.out.println();

		// preorder traversing
		System.out.println("The order of preorder traversing");
		btree.preorder(btree);
		System.out.println();

		// postorder traversing
		System.out.println("The order of postorder traversing");
		btree.postorder(btree);
	}
}
