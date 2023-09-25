
public class SortMain {
	 	
	    public static void main(String[] args) {

/*
	    	System.out.println("The Quick Sort");	
	        new TestQuickSort();
	        System.out.println("");
	        
	    	System.out.println("The Heap Sort");	
	        new TestHeapSort();
	        System.out.println("");
	        
	    	
	    	System.out.println("The Shell Sort");	
	        new TestShellSort();
	        System.out.println("");
	        
	    	System.out.println("The Counting Sort");	
	        new TestCountingSort();
*/
	    	
// 
// 시간 측정 
//	        
			long start, end;
			
			
			System.out.println("The Heap Sort");	
			start = System.currentTimeMillis();
			new TestHeapSort();
	        end = System.currentTimeMillis();
			System.out.println("정렬시 걸리는 시간 : " + (end-start) + "(mill Second)");
			System.out.println();
			

//			System.out.println("The Quick Sort");
//			start = System.currentTimeMillis();
//			new TestQuickSort();
//			end = System.currentTimeMillis();
//			System.out.println("정렬시 걸리는 시간 : " + (end-start) + "(mill Second)");
//			System.out.println();
			
			System.out.println("The Selection Sort");	
			start = System.currentTimeMillis();
			new TestSelectionSort();
	        end = System.currentTimeMillis();
			System.out.println("정렬시 걸리는 시간 : " + (end-start) + "(mill Second)");
			System.out.println();
			
	    }
}
