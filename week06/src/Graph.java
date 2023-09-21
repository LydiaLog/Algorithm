import java.util.Stack;

class Graph {
	Node header[] = new Node[10];
	boolean visited[] = new boolean[10];
	static int NumberOfNodes = 10;

	public void Graph() {
		for (int i = 0; i < 10; i++) {
			visited[i] = false; // 방문 했는지 안했는지
		} // end of for
	} // end of contructor

	public int build() {
		/*
		 * // header[0] = new Node(0, new Node(1, new Node(3))); header[1] = new Node(1,
		 * new Node(0, new Node(2, new Node(3)))); header[2] = new Node(2, new Node(1,
		 * new Node(3))); header[3] = new Node(3, new Node(0, new Node(1, new
		 * Node(2)))); //책363페이지 그래프G1의 인접 리스트 표현 //
		 * 
		 *  
		 // 책 356페이지 그래프 G3의 인접 리스트를 만드시오. 
		header[0] = new Node(0, new Node(1));// 빈칸을 채우시오1. 
		header[1] = new Node(1, new Node(0, new Node(2)));// 빈칸을 채우시오2.
		header[2] = new Node(2, new Node(0, new Node(1)));// 빈칸을 채우시오3. 
		header[3] = new Node(3, new Node(4));// 빈칸을 채우시오4. 
		header[4] = new Node(4, new Node(3));// 빈칸을 채우시오5. // 책356페이지 그래프G3의 인접 리스트 표현 //
		NumberOfNodes = 5;
		return NumberOfNodes;
		*/
		
		// 책 368페이지 그래프 G의 인접 리스트를 만드시오.
		
		 header[0] = new Node(0, new Node(1, new Node(2, new Node(3))));// 빈칸을 채우시오1.
		 header[1] = new Node(1, new Node(0, new Node(4)));// 빈칸을 채우시오2. 
		 header[2] = new Node(2, new Node(0, new Node(4, new Node(5))));// 빈칸을 채우시오3. 
		 header[3] = new Node(3, new Node(4, new Node(5)));// 빈칸을 채우시오4. 
		 header[4] = new Node(4, new Node(1, new Node(2, new Node(6))));// 빈칸을 채우시오5. 
		 header[5] = new Node(5, new Node(2, new Node(3, new Node(6))));// 빈칸을 채우시오6 
		 header[6] = new Node(6, new Node(4, new Node(5))); 
		 NumberOfNodes = 7; return NumberOfNodes;
	
		
		//책368페이지 그래프G의 인접 리스트 표현
		

	}

	public void display(int n) {
		Node m = header[n];
		while (m != null) {
			System.out.print(m.data + " ");// 빈칸을 채우시오 : 데이터 출력
			m = m.link;// 빈칸을 채우시오 : 다음 노드로 이동
		} // end of while
	} // end of display

	public void DFS(int m) {	      
	      int j;
	
	      boolean visited[] = new boolean[NumberOfNodes];
	      // 우선, 방문을 하지 않은 상태로 만들어줍니다.
	      for (j = 0; j < NumberOfNodes; j++) {
	         visited[j] = false;
	      }
	      
	      Stack<Integer> a = new Stack(); //스택을 하나 생성합니다.    
	      a.push(m);   // n을 push 해줍니다.
	      while(!a.isEmpty())   //   스택 a가 빌때까지 실행해줍니다.
	      {
	         j = a.pop();   //   우선, 스택 a의 pop해준 값을 j에 넣어줍니다.
	         //   그 노드를 출력해줍니다.
	         Node node = header[j];   // header[j]를 가진 노드를 하나 선언해줍니다.	         	         
	         if( visited[j] == false)   //   노드를 방문했는데 false로 되어있으면
	         {                  
	            System.out.print(node.data + " ");// 빈칸 1             // visit j
	            visited[j] = true;// 빈칸 2  출력해준 노드는 방문을 했으니, true인 상태로 바꿔줍니다.
	            for(; node != null; node = node.link)
	            {
	            		a.push(node.data);
	            }// 빈칸 3   노드가 null일때까지 노드의 데이터를 push해줍니다.
	            // 빈칸 4  스택에 노드를 저장함. 
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
		q.enqueue(n); // m 정점을 인큐한다.

		while (!q.isEmpty()) {
			Node p = (Node) q.dequeue(); // 디큐하고 순회 포인터 가르킨다.
			if (visited[p.data] == false) // 디큐한 정점을 방문하지 않았다면 방문하고 기록
			{
				System.out.print(p.data + " ");// 빈칸을 채우시오. visit j;
				visited[p.data] = true;// 빈칸을 채우시오. visited[j] <- true;
			}
			while (p.link != null) // 제일 가까운(바로 옆) 정점으로 이동하고 방문하지 않았다면 인큐한다.
			{
				p = p.link;
				if(visited[p.data] == false){// 빈칸을 채우시오. if (visited[k] = false) then enqueue(queue,k);
					q.enqueue(header[p.data]);
				}
				// 빈칸을 채우시오
			} // end of while
		} // end of outer while
	} // end of BFS
}; // end of class Graph

