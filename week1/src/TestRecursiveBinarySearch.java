
public class TestRecursiveBinarySearch {

	  public static void main(String[] args) {
		    int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
		    int left = 0, right = a.length-1;
		    System.out.println("search(a," + 55 + "): " + binsearch(a, 55, left, right));
		    System.out.println("search(a," + 50 + "): " + binsearch(a, 50, left, right));
		  }

		  static int binsearch(int[] a, int key, int left, int right) {
	        
		    int mid;//
			if(left <= right){
				mid = (left + right) / 2;
				if(key == a[mid]) return mid;
				else if(key < a[mid]) return binsearch(a, key, left, mid-1);
				else return binsearch(a, key, mid + 1, right );
			}//
			//
			//
			//
			//  
		    return -1;               // not found 
		  } // end of binsearch
} // end of TestRecursiveBinarySearch
