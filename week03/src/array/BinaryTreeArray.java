package array;

class BinaryTreeArray {
	public static void main(String args[]) {
		int left;
		int right;
		int bt = 1;
		int current;

		String[] stock = new String[30];
		BinaryTree t = new BinaryTree();

		stock[bt] = "A";
		left = t.leftSubTree(bt);
		right = t.rightSubTree(bt);
		stock[left] = "B";
		stock[right] = "C";
		
		// "D", "E" �߰�
		//
		//
		// "G", "H" �߰�	
		//
		//
		// "F", �߰�	
		//

		for (int i = 0; i < stock.length; i++) {
			System.out.println("bt[" + i + "]    " + stock[i]);
		}
	}
}
