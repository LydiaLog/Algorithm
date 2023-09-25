
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
		
	    System.out.println("정렬 시 걸리는 시간 " + (end-start));
	    
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
		int i = p, j = m, k = 0;//왼쪽 무빙포인트 p, 오른쪽 무빙포인트 m으로 초기화
		int[] aa = new int[q - p]; //tem배열 선언
		while (i < m && j < q) //비교해서 작은쪽을 aa에 넣고 이동시킴
			if(a[i] < a[j] ) {//
				aa[k++] = a[i++];//
			}else {// 빈칸을 채우시오
				aa[k++] =a[j++];//
			}//
		if (i < m) System.arraycopy(a, i, a, p + k, m - i);
		System.arraycopy(aa, 0, a, p, k);
	}
}
