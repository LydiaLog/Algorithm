
// import list01.IntArrays;

public class TestHeapSort {
  public TestHeapSort() {
//	int[] a = IntArrays.randomInts(20,100);  
    int[] a = IntArrays.randomInts(10000000,100);
//    IntArrays.print(a);
   // System.out.println("sorted: " + IntArrays.isSorted(a));
    Heapsort(a);
//    IntArrays.print(a);
    //System.out.println("sorted: " + IntArrays.isSorted(a));
  }

  void Heapsort(int[] a) {
    //  PRECONDITION: 0 <= p <= q <= a.length
    //  POSTCONDITION: a[p] <= a[p+1] <= ... <= a[q-1]
    for (int i = (a.length-1)/2; i >= 0; i--)
      heapify(a, i, a.length);
    for (int j = a.length-1; j > 0; j--) {
      IntArrays.swap(a, 0, j);
      heapify(a, 0, j);
    }
  } // end of Heapsort()

  void heapify(int[] a, int i, int n) {
    int ai = a[i];
    while (i < n/2) {                     // a[i] is not a leaf
      int j = 2*i+1;                      // a[j] 는 ai의 left child
      if (j+1 < n && a[j+1] > a[j]) ++j;  // a[j] 는 ai의 larger child
      if (a[j] <= ai) break;              // a[j] is not out of order
      a[i] = a[j];                        // promote a[j]
      i = j;                              // move down to the next level
    } // end of while
    a[i] = ai;
  } // end of heapify()

 }

/*  Output:
{85,64,77,37,65,39,26,44,32,99,78,69,77,45,19,93,79,96,69,63}
sorted: false
{19,26,32,37,39,44,45,63,64,65,69,69,77,77,78,79,85,93,96,99}
sorted: true
*/
