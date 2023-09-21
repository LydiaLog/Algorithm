

public class TimeRecursiveFibonacci {
  public static void main(String[] args) {
    for (int n=30; n <= 100; n++) {
      long t0=System.currentTimeMillis();
      long m = RecursiveFibonacci.f(n);
      long t1=System.currentTimeMillis();
      System.out.println("f(" + n + ") = " + m + "  \ttime: " +(t1-t0));
    }
  }
}

/* Output:
f(30) = 832040          time: 31
f(31) = 1346269         time: 31
f(32) = 2178309         time: 47
f(33) = 3524578         time: 78
f(34) = 5702887         time: 125
f(35) = 9227465         time: 204
f(36) = 14930352        time: 312
f(37) = 24157817        time: 531
f(38) = 39088169        time: 875
f(39) = 63245986        time: 1391
f(40) = 102334155       time: 2187
*/
