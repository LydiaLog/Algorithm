
// import list01.IntArrays;

public class TestBubbleSort {
  public TestBubbleSort() {
    int[] a = IntArrays.randomInts(20,100);
    IntArrays.print(a);
    System.out.println("sorted : " + IntArrays.isSorted(a));
    Bubblesort(a);
    IntArrays.print(a);
    System.out.println("sorted : " + IntArrays.isSorted(a));
  }

  void Bubblesort(int[] a) {
    for (int i = a.length-1; i > 0; i--) {
    	for(int j = 0; j < i; j++){//
    		if(a[j] > a[j + 1])// ºóÄ­À» Ã¤¿ì½Ã¿À  
    			IntArrays.swap(a, j, j+1); // 
    	}
    }          	
  }

 }

/*  Output:
{43,82,58,15,12,71,39,5,44,20,65,82,8,31,3,84,77,88,97,40}
sorted: false
{3,5,8,12,15,20,31,39,40,43,44,58,65,71,77,82,82,84,88,97}
sorted: true
*/
