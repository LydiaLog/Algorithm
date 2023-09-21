package linked;

class BinaryTree {
	BinaryTree ltree;
	// BinaryTree btree;
	Object data;
	BinaryTree rtree;

	public BinaryTree() {
		ltree = null;
		data = null;
		rtree = null;
		// 积己磊
	}

	public BinaryTree(BinaryTree ltree, Object data, BinaryTree rtree) {
		this.ltree = ltree;
		this.data = data;
		this.rtree = rtree;
		// 积己磊
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null)
			return true;
		else
			return false;
		// 厚菌绰瘤八荤
	} // End of isEmpty

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (// 后沫 1 //)
			return null;
		else
			return //后沫 2;
		// 哭率 辑宏 馆券
	} // End of leftSubTree

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (// 后沫 3)
			return null;
		else
			return // 后沫 4;
		// 坷弗率 辑宏 馆券
	} // End of rightSubTree

	public Object rootData(BinaryTree btree) {
		if (// 后沫 5)
			return null;
		else
			return //后沫 6;
		// 风飘 单捞鸥 馆券
	} // End of rootData

	public void inorder(BinaryTree btree) {
		if (btree.data == null)
			return;

	     // 后沫 7
		 // 后沫 8
		 // 后沫 9
	} // End of inorder

	public void preorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		 // 后沫 10
		 // 后沫 11
		 // 后沫 12
	} // End of Preorder

	public void postorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		 // 后沫 13
		 // 后沫 14
		 // 后沫 15
	} // End of PostOrder
} // End of Class BinaryTree
