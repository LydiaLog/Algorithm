
public class TestMergeSort {
	public TestMergeSort() {
		int[] a = IntArrays.randomInts(20, 100);
		IntArrays.print(a);
		System.out.println("sorted : " + IntArrays.isSorted(a));
	    long start = System.currentTimeMillis();
		Mergesort(a, 0, a.length);
	    long end = System.currentTimeMillis();
		IntArrays.print(a);
		System.out.println("sorted : " + IntArrays.isSorted(a));
		
	    System.out.println("���� �� �ɸ��� �ð� " + (end-start));
	    
	}

	void Mergesort(int[] a, int p, int q) {

		if (q - p < 2) 	return;
		int m = (p + q) / 2;
		Mergesort(a, p, m);
		Mergesort(a, m, q);
		merge(a, p, m, q);
	}

	void merge(int[] a, int p, int m, int q) {

		if (a[m - 1] <= a[m])
			return;
		int i = p, j = m, k = 0;//���� ��������Ʈ p, ������ ��������Ʈ m���� �ʱ�ȭ
		int[] aa = new int[q - p]; //tem�迭 ����
		while (i < m && j < q) //���ؼ� �������� aa�� �ְ� �̵���Ŵ
			if(a[i] < a[j] ) {//
				aa[k++] = a[i++];//
			}else {// ��ĭ�� ä��ÿ�
				aa[k++] =a[j++];//
			}//
		if (i < m) System.arraycopy(a, i, a, p + k, m - i);
		System.arraycopy(aa, 0, a, p, k);
	}
}
