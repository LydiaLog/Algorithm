
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
			return weight + "->" + to.object + (nextEdge == null ? ")" : "," + nextEdge); // ��ĭ2 �� ä��ÿ� 
		}
	}

	// ������ Edge�� Vertex�� �ʱ�ȭ
	public WeightedGraph(String[] args) {
		Vertex v = start = new Vertex(args[0]);
		for (int i = 1; i < args.length; i++) {
			v = v.nextVertex = new Vertex(args[i]);
			v.dist = Integer.MAX_VALUE; // infinity
		}
	}

	// �� ���� Vertex�� �޾� ����
	public void addEdge(String vString, String wString, int weight) {
		Vertex v = find(vString);
		Vertex w = find(wString);//��ĭ 3 ��ĭ�� ä��ÿ�: vertex Ÿ���� w������ �����ϰ� find �Լ��� ����Ͽ� ���� w String���ִٸ� w�� ���� 
 		v.edges = new Edge(w, weight, v.edges);
 		//w.edges = new Edge(v, weight, w.edges);
 
	}

	public void findShortestPaths() {
		// implements Dijkstra Algorithm:
		for (Vertex v = start; v != null; v = closestVertex()) {
			v.done = true;
			for (Edge e = v.edges; e != null; e = e.nextEdge) {
				Vertex w = e.to;
				if (!w.done && v.dist + e.weight < w.dist)// ��ĭ4�� ä��ÿ�: 
				{
					w.dist = v.dist + e.weight;// ��ĭ4�� ä��ÿ�
					w.back = v;
				}
			}
		}
	}

	// ���
	public void printPaths() {
		for (Vertex v = start.nextVertex; v != null; v = v.nextVertex) {
			System.out.print("\n" + start.object);
			v.printPath();
		}
		System.out.println();
	}

	// ���
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (Vertex v = start; v != null; v = v.nextVertex)
			buf.append(v.toString());
		return buf + "";
	}

	// �Է¹���(�Ű������� ����) Vertex�� v�� �ִ��� ã�� 
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
			v = w;//	 ��ĭ�� ä��ÿ� mindist�� ���� ������ �ٲ���..?
			minDist = w.dist;//	 ��ĭ�� ä��ÿ�
			}
		return v;
	}
}
