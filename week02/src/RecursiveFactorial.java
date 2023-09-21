public class RecursiveFactorial {
  public static void main(String[] args) {
    for (int i=0; i<20; i++)
      System.out.println(i + "\t" + factorial(i));
  }
  static long factorial(int n) {
    if (n<2) return 1;        // base
    return n*factorial(n-1);  // recursion
  }    
}

/* Output
0       1
1       1
2       2
3       6
4       24
5       120
6       720
7       5040
8       40320
9       362880
*/
