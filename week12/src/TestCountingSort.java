

public class TestCountingSort {
    
    public TestCountingSort() {
        int[] a = IntArrays.randomInts(20,10);
        IntArrays.print(a);
        System.out.println("sorted: " + IntArrays.isSorted(a));
        Countingsort(a);
        IntArrays.print(a);
        System.out.println("sorted: " + IntArrays.isSorted(a));
    }
    
    void Countingsort(int[] a) {
        int n = a.length;
        int m = 10;                     // the number of distinct values of a[]
        int[] c = new int[m];           // step 1
        for (int i = 0; i < n; i++)     // step 2
            ++c[ a[i] ];
        
        for (int k = 1; k < m; k++)     // step 3
            c[k] += c[k-1];
        
        int[] b = new int[n];           // step 4
        for (int i = n-1; i >= 0; i--)  // step 5
            b[ --c[ a[i] ] ] = a[i];
        
        System.arraycopy(b, 0, a, 0, n); // step 6
    }
      
}

/*  Output:
{7,5,5,7,1,1,6,6,0,7,0,5,1,8,9,4,6,8,0,5}
sorted: false
{0,0,0,1,1,1,4,5,5,5,5,6,6,6,7,7,7,8,8,9}
*/
