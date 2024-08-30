package stack;

public class Mainclass {
	public static void main(String[] args) {

		MyStack s=new MyStack(5);

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		s.display();
		System.out.println("-------------");

		s.pop();
		s.pop();
		s.pop();
		s.pop();

		System.out.println("peek :"+s.peek());
		s.display();




	}
}
