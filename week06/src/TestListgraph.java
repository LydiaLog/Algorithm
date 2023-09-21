import java.util.*;

class TestListgraph {
	public static void main(String[] args) {
		Graph g = new Graph(); // Graph 객체 생성
		g.build(); // Graph클래스에 있는 build 함수 실행
		System.out.println("그래프의 인접 리스트 표현");

		//
		for (int i = 0; i < 7; i++) {
			System.out.print(i + "= ");
			g.display(i);
			System.out.println();
		} // end of for loop


		System.out.println("DFS()"); // DFS 출력
		g.DFS(0);
		System.out.println();

		
		System.out.println("BFS()"); // BFS 출력
		g.BFS(0);

			
		/*	*/
		// DFS를 이용하여 연결 요소를 찾음
		System.out.println();
		System.out.println("New Component using DFS ");
		// Compute Connected Component uisng DFS
		for (int i = 0; i < 7; i++) {
			g.visited[i] = false;
		} // end of for

		for (int i = 0; i < 7; i++) {
			if (g.visited[i] == false) {
				System.out.println("new Component including the node " + i);// 빈칸을 채우시오.
				g.DFS(i);// 빈칸을 채우시오.
				System.out.println();
			}
		} // end of for

		
		
		// BFS를 이용하여 연결 요소를 찾음
		System.out.println();
		System.out.println("New Component using BFS ");
		// Compute Connected Component uisng BFS
		for (int i = 0; i < 5; i++) {
			g.visited[i] = false;
		} // end of for

		for (int i = 0; i < 5; i++) {
			if (g.visited[i] == false) {
				System.out.println("new Component including the node " + i);// 빈칸을 채우시오.
				g.BFS(i);// 빈칸을 채우시오.
				System.out.println();
			}
		} // end of for
		
	} // end of main
} // end of TestListgraph

