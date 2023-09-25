


public class TestShellSort {
    
    public TestShellSort() {
        int[] a = IntArrays.randomInts(20,100);
        IntArrays.print(a);
        System.out.println("sorted: " + IntArrays.isSorted(a));
        Shellsort(a);
        IntArrays.print(a);
        System.out.println("sorted: " + IntArrays.isSorted(a));
    }
    
    void iSort(int[] a, int c, int d) {
        for (int i = c+d; i < a.length; i+=d) {
            int ai = a[i], j = i;
            while (j > c && a[j-d] > ai) {
                a[j] = a[j-d];
                j -= d;
            } // end of while
            a[j] = ai;
        } // end of for      
    } // end of iSort()

    void Shellsort(int[] a) {
        for (int d = a.length/2; d > 0; d /= 2)
            for (int c = 0; c < d; c++)
                iSort(a, c, d);  // applies Insertion Sort to the skip sequence
    } // end of Shellsort()

  
}

/*  Output:
{77,37,89,63,55,46,60,72,29,79,48,86,2,70,85,28,70,8,29,93}
sorted: false
{2,8,28,29,29,37,46,48,55,60,63,70,70,72,77,79,85,86,89,93}
sorted: true
*/
