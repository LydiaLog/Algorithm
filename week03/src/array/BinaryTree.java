package array;

class BinaryTree {
	int left;
	int right;

	public int leftSubTree(int bt) {
		left = 2 * bt;// ��ĭ 
		return left;//
	}
	public int rightSubTree(int bt) {
		right = 2*bt+1;// ��ĭ 
		return right;//		
	}
}
