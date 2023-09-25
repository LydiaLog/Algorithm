
public class UNION_FIND {
	private char[] VALUE;	// ������ ��
	private int[] PARENT;	// ������ �θ��� ��
	private int[] HEIGHT;	// ������ ���̰�

	// ������ �ʱ�ȭ��Ű�� ���� ������
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

	// ������ Union ���� �޼ҵ� (v�� u�߿��� ū�ʿ� ���� ���� Ʈ���� ��ģ��.)
	public void union(int vNum, int uNum) {

		// �� Ʈ���� ���̰� �Ȱ��ٸ�
		if ( HEIGHT[vNum] == HEIGHT[uNum] )
			HEIGHT[vNum] += 1;// ��ĭ�� ä�켼�� 

		// �� Ʈ���� ���̰� �ٸ��ٸ� ū�ʿ� �������� ���δ�.
		if ( HEIGHT[uNum] > HEIGHT[vNum] ) {
			int temp = uNum;
			uNum = vNum;// ��ĭ�� ä�켼�� 
			vNum = temp;// ��ĭ�� ä�켼�� 
		}
		PARENT[uNum] = vNum;// ��ĭ�� ä�켼�� 
		 
	}

	// ������ Find ���� �޼ҵ� (v �� ���� ���հ� u �� ���� ������ �ٸ����� �˻�, ������ false �ٸ��� true)
	// ���� ���տ� ������ �ʴ´ٸ� Union ������ �ϵ��� �Ѵ�. ��, true ���ǿ����� Union()�� �ϰ� �ȴ�.
	public boolean find(char v, char u) {
		int vNum = -1, uNum = -1;
		// System.out.println("v:" + v + " u:" +u);
		// v�� u�� index���� vNum �� uNum �� ã�´�.
		for (int i = 0 ; i < VALUE.length ; i++) {
			if ( VALUE[i] == v ) vNum = i;
			else if ( VALUE[i] == u ) uNum = i;

			if ( vNum != -1 && uNum != -1 ) break;
		}

		while(PARENT[vNum] > -1) vNum = PARENT[vNum];// v�� root �� ã�´�.
		// ��ĭ�� ä��ÿ�. v�� root�� ã�´�

		while(PARENT[uNum] > -1) uNum = PARENT[uNum];// u�� root �� ã�´�.
		// ��ĭ�� ä��ÿ�.  u�� root�� ã�´� 

		// �ΰ��� ���� ������ �ƴϸ� �� ����Ŭ�� �ƴ϶�� union �� ���ش�.
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