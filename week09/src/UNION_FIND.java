
public class UNION_FIND {
	private char[] VALUE;	// 집합의 값
	private int[] PARENT;	// 집합의 부모의 값
	private int[] HEIGHT;	// 집합의 높이값

	// 집합을 초기화시키기 위한 생성자
	public UNION_FIND(char[] v) {
		VALUE = new char[v.length];
		PARENT = new int[VALUE.length];
		HEIGHT = new int[VALUE.length];
		for (int i = 0 ; i < VALUE.length ; i++) {
			VALUE[i] = v[i];
			PARENT[i] = -1;
			HEIGHT[i] = 1;
		}
	}

	// 집합의 Union 연산 메소드 (v와 u중에서 큰쪽에 작은 쪽의 트리를 합친다.)
	public void union(int vNum, int uNum) {

		// 두 트리의 높이가 똑같다면
		if ( HEIGHT[vNum] == HEIGHT[uNum] )
			HEIGHT[vNum] += 1;// 빈칸을 채우세요 

		// 두 트리의 높이가 다르다면 큰쪽에 작은쪽을 붙인다.
		if ( HEIGHT[uNum] > HEIGHT[vNum] ) {
			int temp = uNum;
			uNum = vNum;// 빈칸을 채우세요 
			vNum = temp;// 빈칸을 채우세요 
		}
		PARENT[uNum] = vNum;// 빈칸을 채우세요 
		 
	}

	// 집합의 Find 연산 메소드 (v 가 속한 집합과 u 가 속한 집합이 다른가를 검색, 같으면 false 다르면 true)
	// 같은 집합에 속하지 않는다면 Union 연산을 하도록 한다. 즉, true 조건에서만 Union()을 하게 된다.
	public boolean find(char v, char u) {
		int vNum = -1, uNum = -1;
		// System.out.println("v:" + v + " u:" +u);
		// v와 u의 index값인 vNum 과 uNum 을 찾는다.
		for (int i = 0 ; i < VALUE.length ; i++) {
			if ( VALUE[i] == v ) vNum = i;
			else if ( VALUE[i] == u ) uNum = i;

			if ( vNum != -1 && uNum != -1 ) break;
		}

		while(PARENT[vNum] > -1) vNum = PARENT[vNum];// v의 root 를 찾는다.
		// 빈칸을 채우시오. v를 root를 찾는다

		while(PARENT[uNum] > -1) uNum = PARENT[uNum];// u의 root 를 찾는다.
		// 빈칸을 채우시오.  u를 root를 찾는다 

		// 두개가 같은 집합이 아니면 즉 사이클이 아니라면 union 을 해준다.
		if ( vNum != uNum ) {
			union(vNum, uNum);
			// System.out.println("vNum: " + vNum + " uNum: " + uNum);
			return true;
		}
		return false;
	}

	public String toString() {
		String str = "";
		for (int i = 0 ; i < VALUE.length ;i++) {

			String k = "Root";
			if ( PARENT[i] != -1 )
				k = String.valueOf(VALUE[PARENT[i]]);

			str += VALUE[i] + " " + k + " " + HEIGHT[i] +"\n";
		}
		return str;
	}
}