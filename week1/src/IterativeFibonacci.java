
public class IterativeFibonacci {
  public static void main(String[] args) {
    for (int n=30; n<=1000; n++) {
       long m=f(n);
      System.out.println("f(" + n + ") = " + m );
    }
  }
  public static long f(int n) {
    if (n<=1) return n;
    long f0=0, f1=1, f2=1;
    for(int i = 2; i < n; i++){//
    	f0 = f1;//
    	f1 = f2;//
    	f2 = f0 + f1;//
    }//
    return f2;
  }
}