
class TestSelectionSort {
  public TestSelectionSort() {
//	  	int[] a = IntArrays.randomInts(20,100);
	  	int[] a = IntArrays.randomInts(10000000,100);
	  	
//	    IntArrays.print(a);
	    //System.out.println("sorted: " + IntArrays.isSorted(a));
	    Selectionsort(a);
//	    IntArrays.print(a);
	   // System.out.println("sorted: " + IntArrays.isSorted(a));
 }


  /*
  // 큰 수부터 작은 수로 차례로 정리하는 예
  void Selectionsort(int[] a) {
    for (int i = a.length-1; i > 0; i--) {
      int m=0;
      for (int j = 1; j <= i; j++)
        if (a[j] > a[m]) m = j;
      IntArrays.swap(a, i, m);
    }
  }
  */
  // 작은 수부터 큰 수로 차례로 정리하는 예
   void Selectionsort(int[] a) {
	    for (int i = 0; i <= a.length-1; i++) {
	      int min=i;
	      for (int j = i+1; j <= a.length-1; j++)
	        if (a[j] < a[min]) min = j;
	      IntArrays.swap(a, i, min);
	    }
	  }
  
}