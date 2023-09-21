public class TimeIterativeFibonacci {
  public static void main(String[] args) {
    for (int n=30; n<=1000; n++) {
      long t0=System.currentTimeMillis();
      long m=f(n);
      long t1=System.currentTimeMillis();
      System.out.println("f(" + n + ") = " + m + "  \ttime: " +(t1-t0));
    }
  }
  public static long f(int n) {
    if (n<2) return n;
    long f0=0, f1=1, f2=1;
    //
    //
    //
    //
    return f2;
  }
}

/* Output:
f(30) = 832040          time: 0
f(31) = 1346269         time: 0
f(32) = 2178309         time: 0
f(33) = 3524578         time: 0
f(34) = 5702887         time: 0
f(35) = 9227465         time: 0
f(36) = 14930352        time: 0
f(37) = 24157817        time: 0
f(38) = 39088169        time: 0
f(39) = 63245986        time: 0
f(40) = 102334155       time: 0
*/
