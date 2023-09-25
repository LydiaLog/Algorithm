
public class WeightedGraph {
	private Vertex start;

	private static class Vertex {
		Object object;
		Edge edges;
		Vertex nextVertex;
		boolean done;
		int dist;
		Vertex back;

		Vertex(Object object) {
			this.object = object;
		}

		public String toString() {
			return "(" + object + ":" + edges + "\n";
		}

		void printPath() {
			if (back == null)
				return;
			back.printPath();
			System.out.print("->" + object + "(" + dist + ")");
		}
	}

	private static class Edge {
		Vertex to;
		int weight;
		Edge nextEdge;

		Edge(Vertex to, int weight, Edge nextEdge) {
			this.to = to;
			this.weight = weight;
			this.nextEdge = nextEdge;
		}

		public String toString() {
			return weight + "->" + to.object + (nextEdge == null ? ")" : "," + nextEdge); // 빈칸2 을 채우시오 
		}
	}

	// 각각의 Edge와 Vertex를 초기화
	public WeightedGraph(String[] args) {
		Vertex v = start = new Vertex(args[0]);
		for (int i = 1; i < args.length; i++) {
			v = v.nextVertex = new Vertex(args[i]);
			v.dist = Integer.MAX_VALUE; // infinity
		}
	}

	// 두 개의 Vertex를 받아 연결
	public void addEdge(String vString, String wString, int weight) {
		Vertex v = find(vString);
		Vertex w = find(wString);//빈칸 3 빈칸을 채우시오: vertex 타입의 w변수를 선언하고 find 함수를 사용하여 정점 w String이있다면 w에 저장 
 		v.edges = new Edge(w, weight, v.edges);
 		//w.edges = new Edge(v, weight, w.edges);
 
	}

	public void findShortestPaths() {
		// implements Dijkstra Algorithm:
		for (Vertex v = start; v != null; v = closestVertex()) {
			v.done = true;
			for (Edge e = v.edges; e != null; e = e.nextEdge) {
				Vertex w = e.to;
				if (!w.done && v.dist + e.weight < w.dist)// 빈칸4을 채우시오: 
				{
					w.dist = v.dist + e.weight;// 빈칸4을 채우시오
					w.back = v;
				}
			}
		}
	}

	// 출력
	public void printPaths() {
		for (Vertex v = start.nextVertex; v != null; v = v.nextVertex) {
			System.out.print("\n" + start.object);
			v.printPath();
		}
		System.out.println();
	}

	// 출력
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (Vertex v = start; v != null; v = v.nextVertex)
			buf.append(v.toString());
		return buf + "";
	}

	// 입력받은(매개변수로 받은) Vertex가 v에 있는지 찾음 
	private Vertex find(Object object) {
		// returns the vertex that contains the specified object:
		for (Vertex v = start; v != null; v = v.nextVertex)
			if (v.object.equals(object))
				return v;
		return null;
	}

	private Vertex closestVertex() {
		// returns the undone vertex with smallest dist field:
		Vertex v = null;
		int minDist = Integer.MAX_VALUE;
		for (Vertex w = start; w != null; w = w.nextVertex)
			if (!w.done  &&  w.dist < minDist) {
			v = w;//	 빈칸을 채우시오 mindist를 현재 값으로 바꿔줌..?
			minDist = w.dist;//	 빈칸을 채우시오
			}
		return v;
	}
}
