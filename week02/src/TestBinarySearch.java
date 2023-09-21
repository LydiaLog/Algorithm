

public class TestBinarySearch {
    
  public static void main(String[] args) {
    int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
    System.out.println("search(a," + 55 + "): " + search(a, 55));
    System.out.println("search(a," + 50 + "): " + search(a, 50));
  }

  static int search(int[] a, int key) {
    int left = 0, right = a.length-1;
    //
    //
    //  ºóÄ­À» Ã¤¿ì½Ã¿À 
    //
    //
    //
    return -1;               // not found 
  }
}

/*  Output:
search(a,55): 3
search(a,50): -4
*/
