class Node {
	int data;
	Node link;

	Node(int n) { //정수만
		data = n;
		link = null;
	}

	Node(int n, Node m) {//정수랑 링크값
		data = n;
		link = m;
	}
}; // end of class Node
