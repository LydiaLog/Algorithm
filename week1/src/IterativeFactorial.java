
public class IterativeFactorial {
  public static void main(String[] args) {
    for (int i=0; i<20; i++) // if iÀÇ ¹üÀ§°¡ Ä¿Áö¸é ¿À¹öÇÃ·Î¿ì ¹ß»ý
      System.out.println(i + "\t" + factorial(i));
  }
  static long factorial(int n) {
    if (n <= 1) return 1;
    long fact = 1;//  ºóÄ­À» Ã¤¿ì½Ã¿À
    for (int i = 1; i <= n; i++)//  ºóÄ­À» Ã¤¿ì½Ã¿À
    	fact *= i;//  ºóÄ­À» Ã¤¿ì½Ã¿À   
    return fact;//  ºóÄ­À» Ã¤¿ì½Ã¿À
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
