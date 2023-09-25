
public class TestQuickSort {
  public TestQuickSort() {
//    int[] a = IntArrays.randomInts(50,100);
    int[] a = IntArrays.randomInts(5, 100);

//    IntArrays.print(a);
   // System.out.println("sorted: " + IntArrays.isSorted(a));
    Quicksort(a, 0, a.length);
//    IntArrays.print(a);
    //System.out.println("sorted: " + IntArrays.isSorted(a));
  }

  void Quicksort(int[] a, int p, int q) {
    //  PRECONDITION: 0 <= p <= q <= a.length
    //  POSTCONDITION: a[p] <= a[p+1] <= ... <= a[q-1]
    if (q-p < 2) return;
    int j = partition(a, p, q-1);
    Quicksort(a, p, j);
    Quicksort(a, j+1, q);
  }

  int partition(int[] a, int p, int r) {
	int pivot = a[r], i = p-1;

	 for (int j = p; j < r; j++)
		if (a[j] <= pivot)
				IntArrays.swap(a, ++i, j);
		IntArrays.swap(a, i+1, r);
		return i+1;
	}
	
    int partition2(int[] a, int p, int q) {
    // RETURNS: index j of pivot element a[j];
    // POSTCONDITION: a[i] <= a[j] <= a[k] for p <= i <= j <= k < q;
    int pivot=a[p], i = p, j = q;
    while (i < j) {
      while (j > i && a[--j] >= pivot)
        ;  // empty loop
      if (j > i) a[i] = a[j];
      while (i < j && a[++i] <= pivot)
        ;  // empty loop
      if (i < j) a[j] = a[i];
    } // end of while
    a[j] = pivot;
    return j;
  } // end of partition2 

 }

/*  Output:
{39,2,47,29,88,14,56,10,14,85,85,17,66,65,70,91,73,95,42,33}
sorted: false
{2,10,14,14,17,29,33,39,42,47,56,65,66,70,73,85,85,88,91,95}
sorted: true
*/
