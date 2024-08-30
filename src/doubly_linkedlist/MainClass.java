package doubly_linkedlist;

public class MainClass {
	public static void main(String[] args) {


		Double_LinkedList l=new Double_LinkedList();

		l.add_end(10);
		l.add_end(20);
		l.add_end(30);
		l.add_end(40);


		//		l.add_begin(1);
		//		l.add_begin(2);
		//		l.add_begin(3);

		l.forward_display();
		System.out.println("-------------");
		//		l.backward_display();

		//		l.delete_begin();
		//		l.delete_end();

		//		l.add_At_index(5,4);
		//l.delete_At_index(2);

		//		l.delete_by_element(40);
		l.forward_display();




	}
}
