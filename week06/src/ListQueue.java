interface Queue {
	boolean isEmpty(); // 큐가 공백인가를 검사
	void enqueue(Object x); // 원소 x를 삽입
	Object dequeue(); // 원소를 삭제하고 반환
	void remove(); // 원소를 삭제
	Object peek(); // 원소값만 반환
} // Queue interface

class ListNode {
	Object data;
	ListNode link;
} // end of class ListNode

class ListQueue implements Queue // p244 in textbook
{
	private ListNode front;
	private ListNode rear;
	private int count;

	public ListQueue() // 공백 큐
	{
		front = null;
		rear = null;
		count = 0;
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public void enqueue(Object x) { // 큐에 원소 x를 삽입
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = null;

		if (count == 0) { // 큐(리스트)가 공백인 경우
			front = rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		count++;
	} // end enqueue()

	public Object dequeue() {
		// 큐에서 원소를 삭제하고 반환
		if (count == 0)
			return null;
		Object item = front.data;
		front = front.link;
		if (front == null) // 리스트의 노드를 삭제 후 공백이 된 경우
		{
			rear = null;
		}
		count--;
		return item;
	} // end dequeue()

	public void remove() { // 큐에서 원소를 삭제
		if (count == 0)
			return;
		else
			front = front.link;
		if ((front == null)) {
			rear = null;
		}
		count--;
	} // end remove()

	public Object peek() { // 큐에서 원소 검색
		if (count == 0)
			return null;
		else
			return front.data;
	} // end peek()

} // end ListQueue class
