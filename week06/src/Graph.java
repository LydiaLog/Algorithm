import java.util.Stack;

class Graph {
	Node header[] = new Node[10];
	boolean visited[] = new boolean[10];
	static int NumberOfNodes = 10;

	public void Graph() {
		for (int i = 0; i < 10; i++) {
			visited[i] = false; // �湮 �ߴ��� ���ߴ���
		} // end of for
	} // end of contructor

	public int build() {
		/*
		 * // header[0] = new Node(0, new Node(1, new Node(3))); header[1] = new Node(1,
		 * new Node(0, new Node(2, new Node(3)))); header[2] = new Node(2, new Node(1,
		 * new Node(3))); header[3] = new Node(3, new Node(0, new Node(1, new
		 * Node(2)))); //å363������ �׷���G1�� ���� ����Ʈ ǥ�� //
		 * 
		 *  
		 // å 356������ �׷��� G3�� ���� ����Ʈ�� ����ÿ�. 
		header[0] = new Node(0, new Node(1));// ��ĭ�� ä��ÿ�1. 
		header[1] = new Node(1, new Node(0, new Node(2)));// ��ĭ�� ä��ÿ�2.
		header[2] = new Node(2, new Node(0, new Node(1)));// ��ĭ�� ä��ÿ�3. 
		header[3] = new Node(3, new Node(4));// ��ĭ�� ä��ÿ�4. 
		header[4] = new Node(4, new Node(3));// ��ĭ�� ä��ÿ�5. // å356������ �׷���G3�� ���� ����Ʈ ǥ�� //
		NumberOfNodes = 5;
		return NumberOfNodes;
		*/
		
		// å 368������ �׷��� G�� ���� ����Ʈ�� ����ÿ�.
		
		 header[0] = new Node(0, new Node(1, new Node(2, new Node(3))));// ��ĭ�� ä��ÿ�1.
		 header[1] = new Node(1, new Node(0, new Node(4)));// ��ĭ�� ä��ÿ�2. 
		 header[2] = new Node(2, new Node(0, new Node(4, new Node(5))));// ��ĭ�� ä��ÿ�3. 
		 header[3] = new Node(3, new Node(4, new Node(5)));// ��ĭ�� ä��ÿ�4. 
		 header[4] = new Node(4, new Node(1, new Node(2, new Node(6))));// ��ĭ�� ä��ÿ�5. 
		 header[5] = new Node(5, new Node(2, new Node(3, new Node(6))));// ��ĭ�� ä��ÿ�6 
		 header[6] = new Node(6, new Node(4, new Node(5))); 
		 NumberOfNodes = 7; return NumberOfNodes;
	
		
		//å368������ �׷���G�� ���� ����Ʈ ǥ��
		

	}

	public void display(int n) {
		Node m = header[n];
		while (m != null) {
			System.out.print(m.data + " ");// ��ĭ�� ä��ÿ� : ������ ���
			m = m.link;// ��ĭ�� ä��ÿ� : ���� ���� �̵�
		} // end of while
	} // end of display

	public void DFS(int m) {	      
	      int j;
	
	      boolean visited[] = new boolean[NumberOfNodes];
	      // �켱, �湮�� ���� ���� ���·� ������ݴϴ�.
	      for (j = 0; j < NumberOfNodes; j++) {
	         visited[j] = false;
	      }
	      
	      Stack<Integer> a = new Stack(); //������ �ϳ� �����մϴ�.    
	      a.push(m);   // n�� push ���ݴϴ�.
	      while(!a.isEmpty())   //   ���� a�� �������� �������ݴϴ�.
	      {
	         j = a.pop();   //   �켱, ���� a�� pop���� ���� j�� �־��ݴϴ�.
	         //   �� ��带 ������ݴϴ�.
	         Node node = header[j];   // header[j]�� ���� ��带 �ϳ� �������ݴϴ�.	         	         
	         if( visited[j] == false)   //   ��带 �湮�ߴµ� false�� �Ǿ�������
	         {                  
	            System.out.print(node.data + " ");// ��ĭ 1             // visit j
	            visited[j] = true;// ��ĭ 2  ������� ���� �湮�� ������, true�� ���·� �ٲ��ݴϴ�.
	            for(; node != null; node = node.link)
	            {
	            		a.push(node.data);
	            }// ��ĭ 3   ��尡 null�϶����� ����� �����͸� push���ݴϴ�.
	            // ��ĭ 4  ���ÿ� ��带 ������. 
	          } // end of if
	      } // end of while
	   } // end of DFS()


	public void BFS(int m) {
		boolean visited[] = new boolean[10];

		for (int i = 0; i < 10; i++) {
			visited[i] = false;
		} // end of for

		ListQueue q = new ListQueue();
		Node n = header[m];
		q.enqueue(n); // m ������ ��ť�Ѵ�.

		while (!q.isEmpty()) {
			Node p = (Node) q.dequeue(); // ��ť�ϰ� ��ȸ ������ ����Ų��.
			if (visited[p.data] == false) // ��ť�� ������ �湮���� �ʾҴٸ� �湮�ϰ� ���
			{
				System.out.print(p.data + " ");// ��ĭ�� ä��ÿ�. visit j;
				visited[p.data] = true;// ��ĭ�� ä��ÿ�. visited[j] <- true;
			}
			while (p.link != null) // ���� �����(�ٷ� ��) �������� �̵��ϰ� �湮���� �ʾҴٸ� ��ť�Ѵ�.
			{
				p = p.link;
				if(visited[p.data] == false){// ��ĭ�� ä��ÿ�. if (visited[k] = false) then enqueue(queue,k);
					q.enqueue(header[p.data]);
				}
				// ��ĭ�� ä��ÿ�
			} // end of while
		} // end of outer while
	} // end of BFS
}; // end of class Graph

