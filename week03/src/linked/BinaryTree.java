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
		// ������
	}

	public BinaryTree(BinaryTree ltree, Object data, BinaryTree rtree) {
		this.ltree = ltree;
		this.data = data;
		this.rtree = rtree;
		// ������
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null)
			return true;
		else
			return false;
		// ��������˻�
	} // End of isEmpty

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (// ��ĭ 1 //)
			return null;
		else
			return //��ĭ 2;
		// ���� ���� ��ȯ
	} // End of leftSubTree

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (// ��ĭ 3)
			return null;
		else
			return // ��ĭ 4;
		// ������ ���� ��ȯ
	} // End of rightSubTree

	public Object rootData(BinaryTree btree) {
		if (// ��ĭ 5)
			return null;
		else
			return //��ĭ 6;
		// ��Ʈ ����Ÿ ��ȯ
	} // End of rootData

	public void inorder(BinaryTree btree) {
		if (btree.data == null)
			return;

	     // ��ĭ 7
		 // ��ĭ 8
		 // ��ĭ 9
	} // End of inorder

	public void preorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		 // ��ĭ 10
		 // ��ĭ 11
		 // ��ĭ 12
	} // End of Preorder

	public void postorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		 // ��ĭ 13
		 // ��ĭ 14
		 // ��ĭ 15
	} // End of PostOrder
} // End of Class BinaryTree
