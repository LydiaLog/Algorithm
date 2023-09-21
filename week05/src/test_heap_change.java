
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
			if(k <= heap[i / 2]) break;// ��ĭ 1
			heap[i] = heap[i / 2];// ��ĭ 2
			i = i / 2;// ��ĭ 3 
		}    
		heap[i] = k;// ��ĭ 4
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
				  j = j + 1;// ��ĭ 5
			}
			if(temp > heap[j]) break;
			heap[i] = heap[j];// ��ĭ 6
			i = j;// ��ĭ 7
			j = j*2;// ��ĭ 8
		}
		heap[i] = temp;// ��ĭ 9 
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
		//��������Ʈ���� ������ ��ȯ
		int num = stree.length-1;
		for(int i = num/2; i >= 1; i--)
		{
			int p = i;
			for(int j = 2 * p; j <= num; j = 2 * j)// ��ĭ 10
			{
				if (j < num) {
				   if (stree[j] < stree[j+1]) j=j+1;   		
				}
				if(stree[p] >= stree[j]) break;// ��ĭ 11 
				int temp = stree[p];// ��ĭ 12
				stree[p] = stree[j];// ��ĭ 13
				stree[j] = temp;// ��ĭ 14 
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
  	
		// �Q�� ����
		H.print_Heap_BT(H.heap);
		// 2���� ���Ұ� ������. (���� ū 2���� ���Ұ� ������)		
		H.delete(H.heap);H.delete(H.heap);
		// ������ ���� ��
		System.out.println("The Binary Tree after 2 elements");
		H.print_Heap_BT(H.heap);	

// 2��° �ǽ� : �پ��� ũ���� ������ �迭�� �ʱ� �Q���� ����� ����
		// �迭�� ũ�� n�� ���ϱ� 
		Heap1 H1 = new Heap1();
		System.out.println("�� ��° ��: �̹� n���� ����Ÿ�� �迭�� ����Ǿ� �ִٰ� ������ ��");	
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
			
        //������ ������ n���� ����Ʈ��(tree) ����, ������ ���� random�ϰ� �����Ѵ�.
		int[] tree = IntArrays.randomInts(n, 100);
	    int[] stree = new int[n+1];
        
	    // tree[]�� ���Ұ��� index�� 0��ſ� 1���� �����ϴ� stree�� ������. 
	    System.out.println( " ���� "+ n + "���� ������ �迭�� �����");
		for(int i = 0; i < n; i++) {
			stree[i+1] = tree[i];
			System.out.println(i+1 + "��° stree[i] = " + stree[i+1]); 
	    }
		// �����ϰ� ���ڰ� ��� �ִ� �ʱ� �迭 stree(�Q�� �ƴ�)
		H1.print_Heap_array(stree);	
		
		// stree�� �ʱ� �Q(heap)���� ��ȯ��. 
		H1.make_Tree_Heap(stree);// ��ĭ 15
		
		// �ʱ� �Q, stree�� ���� �Ŀ� �����. 
		System.out.println( " After making an initial heap ");	
		H1.print_Heap_array(stree);	

	}
}



