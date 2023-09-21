
public class RecursiveFibonacci {
  public static void main(String[] args) {
    for (int i=0; i<12; i++)
      System.out.println(i + "\t" + f(i));
  }
  
  public static long f(int n) {
	    if (n<1) return 0;       // base
	    // ºóÄ­À» Ã¤¿ì½Ã¿À              // base
	    // ºóÄ­À» Ã¤¿ì½Ã¿À            // recursion
 }
}
/* Output:
0       0
1       1
2       1
3       2
4       3
5       5
6       8
7       13
8       21
9       34
10      55
11      89
12      144
*/
