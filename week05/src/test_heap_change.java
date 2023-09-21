
import java.util.Scanner;
import java.util.Random;

class Heap
{
	static int heap[];
	static int heapsize;
	static int n;
	static int num;
	
	Heap(){
		n = 0;
		heapsize = 100;
		heap = new int[heapsize];
		num = 0;
	}
	
	void insertHeap(int heap[],int k){
		int i;
		n++;

		for(i = n; ; ){
			if(i == 1) break;
			if(k <= heap[i / 2]) break;// 빈칸 1
			heap[i] = heap[i / 2];// 빈칸 2
			i = i / 2;// 빈칸 3 
		}    
		heap[i] = k;// 빈칸 4
	}
	
	int delete(int heap[]){
		int temp = heap[n];
		int del = heap[1];
		int i = 1;
		int j = 2;
		heap[n] = 0;
		n--;

		while(j <= n){
			if(j < n){
			  if(heap[j] < heap[j+1])
				  j = j + 1;// 빈칸 5
			}
			if(temp > heap[j]) break;
			heap[i] = heap[j];// 빈칸 6
			i = j;// 빈칸 7
			j = j*2;// 빈칸 8
		}
		heap[i] = temp;// 빈칸 9 
		return del;
	}

//
   void print_Heap_BT(int heap[]){
		for (int i = 1 ; i <= n ; i *= 2){
			for(int j = i;j <= i * 2 - 1 && j <= n; j++){
				System.out.print(heap[j] + "\t");
			} // inner for
			System.out.println();
		} // outer for 	
	}
 } // end of heap

//
 class Heap1
 {
	static int tree[];
	static int stree[]; 
	static int heapsize;
	static int n;
	
	Heap1(){
		n = 0;
		heapsize = 100;
		tree = new int[heapsize];
		stree = new int[heapsize];
	}
	
	void make_Tree_Heap(int stree[])
	{
		//완전이진트리를 히프로 변환
		int num = stree.length-1;
		for(int i = num/2; i >= 1; i--)
		{
			int p = i;
			for(int j = 2 * p; j <= num; j = 2 * j)// 빈칸 10
			{
				if (j < num) {
				   if (stree[j] < stree[j+1]) j=j+1;   		
				}
				if(stree[p] >= stree[j]) break;// 빈칸 11 
				int temp = stree[p];// 빈칸 12
				stree[p] = stree[j];// 빈칸 13
				stree[j] = temp;// 빈칸 14 
				p = j;
				
			} // end of for
		} // end of outer for 
	} // end of makeTreeHeap
//	
//
	void print_Heap_array(int stree[]){
		for (int i = 1 ; i <= stree.length ; i *= 2){
			for(int j = i; j <= i * 2 - 1; j++){
				if ( j < stree.length) 
					System.out.print(stree[j] + "\t");
			} // inner for
			System.out.println();
		} // outer for	
	System.out.println();
	} // end of print_Heap_array
//
}

class test_heap_change
{
	public static void main(String[] args) 
	{
//
		Heap H = new Heap();
		H.insertHeap(H.heap,4);
		H.insertHeap(H.heap,7);
		H.insertHeap(H.heap,8);
		H.insertHeap(H.heap,9);
		H.insertHeap(H.heap,3);
		H.insertHeap(H.heap,5);
		H.insertHeap(H.heap,15);
		H.insertHeap(H.heap,2);   
		
		H.insertHeap(H.heap,19);
		H.insertHeap(H.heap,13);
		H.insertHeap(H.heap,18);
		H.insertHeap(H.heap,12);
		H.insertHeap(H.heap,8);
		H.insertHeap(H.heap,5);
  	
		// 힢의 구성
		H.print_Heap_BT(H.heap);
		// 2개의 원소가 삭제됨. (가장 큰 2개의 원소가 식제됨)		
		H.delete(H.heap);H.delete(H.heap);
		// 삭제된 후의 힙
		System.out.println("The Binary Tree after 2 elements");
		H.print_Heap_BT(H.heap);	

// 2번째 실습 : 다양한 크기의 무순위 배열을 초기 힢으로 만드는 과정
		// 배열의 크기 n을 정하기 
		Heap1 H1 = new Heap1();
		System.out.println("두 번째 예: 이미 n개의 데이타가 배열에 저장되어 있다고 가정할 때");	
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
			
        //원소의 갯수가 n개인 이진트리(tree) 생성, 원소의 값은 random하게 삽입한다.
		int[] tree = IntArrays.randomInts(n, 100);
	    int[] stree = new int[n+1];
        
	    // tree[]의 원소값을 index를 0대신에 1부터 시작하는 stree에 복사함. 
	    System.out.println( " 난수 "+ n + "개로 구성된 배열의 내용들");
		for(int i = 0; i < n; i++) {
			stree[i+1] = tree[i];
			System.out.println(i+1 + "번째 stree[i] = " + stree[i+1]); 
	    }
		// 랜덤하게 숫자가 들어 있는 초기 배열 stree(힢이 아님)
		H1.print_Heap_array(stree);	
		
		// stree를 초기 힢(heap)으로 변환함. 
		H1.make_Tree_Heap(stree);// 빈칸 15
		
		// 초기 힢, stree를 만든 후에 출력함. 
		System.out.println( " After making an initial heap ");	
		H1.print_Heap_array(stree);	

	}
}



