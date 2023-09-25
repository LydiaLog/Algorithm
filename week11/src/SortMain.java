public class SortMain {
	public static void main(String[] args) {
		System.out.println("The Selection Sort");	
		new TestSelectionSort();
        System.out.println("");
        
        System.out.println("The Bubble Sort");	
		new TestBubbleSort();
        System.out.println("");

		System.out.println("The Insertion Sort");	
		new TestInsertionSort();
        System.out.println("");

		
		//
		System.out.println("The Merge Sort");	
        new TestMergeSort();
        System.out.println("");
		//
		/*
        //
		System.out.println("The Quick Sort");	
        new TestQuickSort();
        System.out.println("");
        //
*/	}
}
