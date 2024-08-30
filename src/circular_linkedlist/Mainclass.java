package circular_linkedlist;

public class Mainclass {
	public static void main(String[] args) {

		Circular_LinkedList l=new Circular_LinkedList();
		l.add_end(10);
		l.add_end(20);
		l.add_end(30);

		l.display();
		System.out.println("----------------");

		//		l.add_begin(1);
		//		l.add_begin(2);
		//		l.add_begin(3);

		//l.delete_begin();

		//		l.delete_end();

		//		l.add_at_index(1,1);

		//		l.delete_at_index(1);

		l.display();



	}
}
