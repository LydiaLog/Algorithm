package linked;

class BinaryTreeTest {
	public static void main(String args[]) {
		BinaryTree btree;
		BinaryTree ltree;
		BinaryTree rtree;
		BinaryTree current;

		// "A(B, C)" ����� 
		ltree = new BinaryTree(new BinaryTree(), "B", new BinaryTree());
		rtree = new BinaryTree(new BinaryTree(), "C", new BinaryTree());
		btree = new BinaryTree(ltree, "A", rtree);	
		// "G(null, H)" ����� 
		rtree = new BinaryTree(new BinaryTree(), "H", new BinaryTree());
		btree = new BinaryTree(new BinaryTree(), "G", rtree);
        //  ��ĭ�� ä���� ���� Ʈ���� �ϼ��϶�. (ppt�� ������ ����Ʈ��)     
		// "E(G(null, H), null)" ����� 
		//	
		// "B(D, E(G(null, H), null))" �����  
		//
		// "C(F, null)" �����
		//		
		// "A( B(D, E(G(null, H), null)), C(F, null) )" ����� 
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
