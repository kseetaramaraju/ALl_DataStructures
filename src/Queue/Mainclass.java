package Queue;

public class Mainclass {
	public static void main(String[] args) {

		MyQueue q=new MyQueue(5);

		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);

		q.display();
		System.out.println("||||");
		System.out.println(q.peek());
		
		q.deque();
		q.deque();
		q.deque();
		q.deque();
		
		
		q.display();
		System.out.println("||||");
		System.out.println(q.peek());
	
		
		


	}
}
