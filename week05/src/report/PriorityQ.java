package report;

class PriorityQueue{
    private int count;            	  // �켱���� ť�� ���� ���Ҽ�
    private int size;              	  // �迭�� ũ��
    private int increment;         	  // �迭 Ȯ�� ����
    private int[] itemArray;  // �켱���� ť ���Ҹ� �����ϴ� �迭


    public PriorityQueue(){
        count = 0;                  // itemArray[0]�� ������ ������� ����
        size = 16;                  //���� �ִ� ���� ���� size - 1
        increment = 8;			
        itemArray = new int[size];
    }

    public int currentSize(){		   // �켱���� ť�� ���� ���Ҽ�
        return count;
    }

    public void insert(int newKey){ 
                                    // �켱���� ť�� ���� ����
        if (count == size-1) PQFull();
        count++;                   // ���� ������ Ȯ���ϰ� ������ ���� ��ġ�� �ؿ������� ã�� �ö�
        int childLoc = count;
        int parentLoc = childLoc/2;
        while (parentLoc != 0) {
            if (newKey <= itemArray[parentLoc]) { 
                                    // ��ġ�� �ùٸ� ���
                itemArray[childLoc] = newKey;             // ���� ����
                return;
            } else {                // �� ���� ���� ��ġ�� �̵�
                itemArray[childLoc] = itemArray[parentLoc];
                childLoc = parentLoc;
                parentLoc = childLoc/2 ;
            }
        }
        itemArray[childLoc] = newKey;       // ���� ��ġ�� ���� ����
    } // end insert()

    public void PQFull() {          
                               // itemArray�� �����̸� 
       size += increment;      // increment��ŭ �� ũ�� Ȯ��
       int[] tempArray = new int[size];
       for (int i = 1; i < count; i++) {
                tempArray[i] = itemArray[i];
       }
       itemArray= tempArray;
    } // end PQFull()

    public int delete() {      
                                        // �켱���� ť�κ��� ���� ����
       if (count == 0) {                // �켱���� ť�� ������ ���
            return 0;
       } 
       else {
                // ���� ����
            int currentLoc;
            int childLoc;
            int itemToMove;   // �̵���ų ����
            int deletedItem;    // ������ ����
            deletedItem = itemArray[1];	// �����Ͽ� ��ȯ�� ����

            itemToMove = itemArray[count];   // �̵���ų ����
			itemArray[count--] = 0;
            currentLoc = 1;
            childLoc = 2*currentLoc;
            while (childLoc <= count) {            // �̵���ų ������ Ž��
                if (childLoc < count) {
                    if (itemArray[childLoc+1] > itemArray[childLoc])
                        childLoc ++;
                }
                if (itemArray[childLoc] > itemToMove) {
                    itemArray[currentLoc]=itemArray[childLoc]; // ���Ҹ� �� ����
                    currentLoc = childLoc;                  // ���� �̵�
                    childLoc = 2*currentLoc;
                } else {
                    itemArray[currentLoc]=itemToMove;  // �̵���ų ���� ����
                    return deletedItem;
                }
            } // end while
            itemArray[currentLoc] = itemToMove;     // ���� ��ġ�� ���� ����
            return deletedItem;
        } // end if
    } // end delete()


	void print_Heap(){
		int i, j;
		for ( i = 1 ; i <= size/2 ; i *= 2){
			for( j = i;j <= i * 2 - 1; j++){
				System.out.print(itemArray[j] + "\t");
			} // inner for
			System.out.println();
		}	// outer for
	} // end of print_Heap


} // end PriorityQueue class 

class PriorityQ
{
	public static void main(String[] args) 
	{

		PriorityQueue PQ = new PriorityQueue();
        PQ.insert(4);// 8���� ����Ÿ { 4,7,8,9,3,5,15,2}�� �켱 ����ť���� �̿��Ͽ� ������ �Ͽ�����.
        PQ.insert(7);
        PQ.insert(8);
        PQ.insert(9);
        PQ.insert(3);
        PQ.insert(5);
        PQ.insert(15);
        PQ.insert(2);
        PQ.print_Heap();
        
	}
} // end of Heap
