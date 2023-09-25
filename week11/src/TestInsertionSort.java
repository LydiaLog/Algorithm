
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
    
    System.out.println("정렬 시 걸리는 시간 " + (end-start));
  }

  void Insertionsort(int[] a) {
    for (int i=1; i<a.length; i++) {
      int ai = a[i]; //
      int j = i;//
      for(j = i; j > 0 && a[j - 1] > ai; j--){// 빈칸을 채우시오. 피벗원소보다 a[j - 1] 원소가 더 클 때
    	  a[j] = a[j - 1];//앞 원소 뒤로 뺌
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