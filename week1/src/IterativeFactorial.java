
public class IterativeFactorial {
  public static void main(String[] args) {
    for (int i=0; i<20; i++) // if i�� ������ Ŀ���� �����÷ο� �߻�
      System.out.println(i + "\t" + factorial(i));
  }
  static long factorial(int n) {
    if (n <= 1) return 1;
    long fact = 1;//  ��ĭ�� ä��ÿ�
    for (int i = 1; i <= n; i++)//  ��ĭ�� ä��ÿ�
    	fact *= i;//  ��ĭ�� ä��ÿ�   
    return fact;//  ��ĭ�� ä��ÿ�
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
