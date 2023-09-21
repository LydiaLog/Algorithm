

public class TestBinarySearch {
    
  public static void main(String[] args) {
    int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
    System.out.println("search(a," + 55 + "): " + search(a, 55));
    System.out.println("search(a," + 50 + "): " + search(a, 50));
  }

  static int search(int[] a, int key) {
    int left = 0, right = a.length-1;
    int mid;//
    while(left <= right){//
    	mid = (left + right)/2;//  ºóÄ­À» Ã¤¿ì½Ã¿À 
    	if(key == a[mid]) return mid;//
    	if(key < a[mid]) right = mid - 1;
    	else left = mid + 1;
    }
    
    
    //
    //
    return - left -1;               // not found 
  }
}

/*  Output:
search(a,55): 3
search(a,50): -4
*/
