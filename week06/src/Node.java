class Node {
	int data;
	Node link;

	Node(int n) { //������
		data = n;
		link = null;
	}

	Node(int n, Node m) {//������ ��ũ��
		data = n;
		link = m;
	}
}; // end of class Node
