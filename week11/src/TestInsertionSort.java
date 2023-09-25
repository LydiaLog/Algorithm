
public class TestInsertionSort {
  public TestInsertionSort() {
    int[] a = IntArrays.randomInts(20,100);
    IntArrays.print(a);
    System.out.println("sorted : " + IntArrays.isSorted(a));
    long start = System.currentTimeMillis();
    Insertionsort(a);
    long end = System.currentTimeMillis();
    IntArrays.print(a);
    System.out.println("sorted : " + IntArrays.isSorted(a));
    
    System.out.println("���� �� �ɸ��� �ð� " + (end-start));
  }

  void Insertionsort(int[] a) {
    for (int i=1; i<a.length; i++) {
      int ai = a[i]; //
      int j = i;//
      for(j = i; j > 0 && a[j - 1] > ai; j--){// ��ĭ�� ä��ÿ�. �ǹ����Һ��� a[j - 1] ���Ұ� �� Ŭ ��
    	  a[j] = a[j - 1];//�� ���� �ڷ� ��
      }//
      a[j] = ai;//
    }
  }
  /*void Insertionsort(int[] a){
   * 	for(int i = 1; i < a.length; i ++){
   * 	int k = a[j];
   * 	int j = i;
   * 	boolean move;
   * 	if(a[j-1] > k){
   * 		move = true;
   * 	}else{
   * 		move = false;
   * 	}
   * 	while(move){
   * 		a[j] = a[j -1];
   * 		j = j - 1;
   * 		if(j > 0 && a[j -1] > k){
   * 			move = true;
   * 		}else{
   * 			move = false;
   * 		} 
   * 	}
   * 	a[j] = k;
   * 	}
   * }*/
}