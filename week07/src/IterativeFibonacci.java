
public class IterativeFibonacci {
  public static void main(String[] args) {
    for (int n=30; n<=100; n++) {
        System.out.println(n + "\t" + f(n));
    }
  }
  public static long f(int n) {
    if (n<2) return n;
    long f0=0, f1=1, f2=1;
    for (int i=2; i<n; i++) {
      f0 = f1;
      f1 = f2;
      f2 = f1 + f0;
    }
    return f2;
  }
}