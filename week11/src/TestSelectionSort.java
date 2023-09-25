
class TestSelectionSort {
  public TestSelectionSort() {
	  	int[] a = IntArrays.randomInts(20,100);
	    IntArrays.print(a);
	    System.out.println("sorted : " + IntArrays.isSorted(a));
	    Selectionsort(a);
	    IntArrays.print(a);
	    System.out.println("sorted : " + IntArrays.isSorted(a));
 }

  void Selectionsort(int[] a) {
    for (int i = a.length-1; i > 0; i--) {//
    	int max = 0;//
        for(int j = 1; j <= i; j++){//  ºóÄ­À» Ã¤¿ì½Ã¿À
    	  if(a[j] > a[max]) max = j;//
    	  IntArrays.swap(a,  i,  max);//
      }//	
    }
  }
}