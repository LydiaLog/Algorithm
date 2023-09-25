//  Data Structures with Java
//  by John R. Hubbard and Anita Huray
//  Copyright 2004 by Prentice Hall
//  chap15\list08\TestSelectionSort.java


public class TestSelectionSort {
  public TestSelectionSort() {
    int[] a = IntArrays.randomInts(20,100);
    IntArrays.print(a);
    System.out.println("sorted: " + IntArrays.isSorted(a));
    sort(a);
    IntArrays.print(a);
    System.out.println("sorted: " + IntArrays.isSorted(a));
  }

  void sort(int[] a) {
	int temp; 
    for (int i = 0; i < a.length; i++) {
    	for(int j = i + 1; j < a.length; j++) {//后沫
    		if(a[i] > a[j]) {//后沫
    			temp = a[i];//后沫
    			a[i] = a[j];//后沫
    			a[j] = temp;//后沫
    		}
    	}
    }
  }

  public static void main(String[] args) {
    new TestSelectionSort();
  }
}

/*  Output:
{98,2,36,19,64,4,62,37,21,10,94,96,15,47,53,5,79,62,1,31}
sorted: false
{1,2,4,5,10,15,19,21,31,36,37,47,53,62,62,64,79,94,96,98}
sorted: true
*/
