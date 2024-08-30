package double_circular_linkedlist;

public class Mainclass {
	public static void main(String[] args) {

		Double_Circular_LinkedList l=new Double_Circular_LinkedList();

		l.add_end(10);
		l.add_end(20);
		l.add_end(30);

		l.forward_display();
		System.out.println("----------");
		//l.backward_display();

		//		l.add_begin(1);
		//		l.add_begin(2);
		//		l.add_begin(3);

		//		l.delete_begin();
		//		l.delete_begin();
		//		l.delete_begin();

		//		l.delete_end();
		//		l.forward_display();
		//		System.out.println("----------");
		//		l.backward_display();



		//l.add_at_index(1,1);

		//l.delete_at_index(1);

		l.forward_display();
		System.out.println("----------");
		l.backward_display();


	}
}
