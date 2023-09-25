

public class TestWeightedGraph {
	public static void main(String[] args) {

		String[] vertices = { "0", "1", "2", "3", "4" };
		WeightedGraph g = new WeightedGraph(vertices);
		System.out.println("The given weighted graph");
		//System.out.println("(From vertex: weight1 -> To vertex1, weight2 -> To vertex2, ...)");
		
		g.addEdge("0", "1", 2);
		g.addEdge("0", "2", 5);
		g.addEdge("0", "4", 3);
		g.addEdge("2", "3", 6);//
		g.addEdge("2", "4", 2);//
		g.addEdge("1", "3", 4);//  
		g.addEdge("1", "4", 10);// 빈칸을 채우시오: 오른쪽 그래프를 만드시오 
		g.addEdge("4", "3", 2);
		g.addEdge("4", "2", 1);
		System.out.print(g);
		
		System.out.println();
		System.out.println("The list of the shortest paths from vertex 0 in given weighted graph");
		System.out.println("Source vertex -> .. -> Tovertex(Shortest path length)");
		g.findShortestPaths();
		g.printPaths();
		//
		/*
		String[] vertices = { "A", "B", "C", "D", "E", "F", "G", "H" };
		WeightedGraph g = new WeightedGraph(vertices);
	  
		//
		// 빈칸을 채우시오: 오른쪽 그래프를 만드시오 
		//
		
		System.out.print(g);
		g.findShortestPaths();
		g.printPaths();
		*/
		
	}  // end of main

} // end of TestWeightedGraph()
