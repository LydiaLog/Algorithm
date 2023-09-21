import java.util.*;

class TestListgraph {
	public static void main(String[] args) {
		Graph g = new Graph(); // Graph ��ü ����
		g.build(); // GraphŬ������ �ִ� build �Լ� ����
		System.out.println("�׷����� ���� ����Ʈ ǥ��");

		//
		for (int i = 0; i < 7; i++) {
			System.out.print(i + "= ");
			g.display(i);
			System.out.println();
		} // end of for loop


		System.out.println("DFS()"); // DFS ���
		g.DFS(0);
		System.out.println();

		
		System.out.println("BFS()"); // BFS ���
		g.BFS(0);

			
		/*	*/
		// DFS�� �̿��Ͽ� ���� ��Ҹ� ã��
		System.out.println();
		System.out.println("New Component using DFS ");
		// Compute Connected Component uisng DFS
		for (int i = 0; i < 7; i++) {
			g.visited[i] = false;
		} // end of for

		for (int i = 0; i < 7; i++) {
			if (g.visited[i] == false) {
				System.out.println("new Component including the node " + i);// ��ĭ�� ä��ÿ�.
				g.DFS(i);// ��ĭ�� ä��ÿ�.
				System.out.println();
			}
		} // end of for

		
		
		// BFS�� �̿��Ͽ� ���� ��Ҹ� ã��
		System.out.println();
		System.out.println("New Component using BFS ");
		// Compute Connected Component uisng BFS
		for (int i = 0; i < 5; i++) {
			g.visited[i] = false;
		} // end of for

		for (int i = 0; i < 5; i++) {
			if (g.visited[i] == false) {
				System.out.println("new Component including the node " + i);// ��ĭ�� ä��ÿ�.
				g.BFS(i);// ��ĭ�� ä��ÿ�.
				System.out.println();
			}
		} // end of for
		
	} // end of main
} // end of TestListgraph

