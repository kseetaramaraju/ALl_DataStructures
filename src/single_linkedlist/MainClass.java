package single_linkedlist;

public class MainClass {
	public static void main(String[] args) {


		Single_LinkedList l=new Single_LinkedList();
		//		l.add_end(10);
		//		l.add_end(20);
		//		l.add_end(30);
		//		l.add_end(40);
		//		l.add_end(50);
		//
		//		l.add_begin(50);
		//		l.add_begin(40);
		//		l.add_begin(30);
		//
		//		l.display();
		//		System.out.println(l.size());
		//		System.out.println("----------------");
		//		
		//		l.delete_end();
		//		l.display();
		//		System.out.println(l.size());
		//		System.out.println("----------------");	
		//		
		//		l.delete_begin();
		//		l.display();
		//		System.out.println(l.size());
		//		System.out.println("----------------");
		//
		//		l.delete_begin();
		//		l.display();
		//		System.out.println(l.size());
		//		System.out.println("----------------");


		l.add_end(10);
		l.add_end(20);
		l.add_end(30);
		l.add_end(40);
		l.add_end(50);

		l.display();

		System.out.println("---------");
		//		l.add_At_Index(35,3);
		//
		//		l.display();

		//		l.delete_At_index(1);
		//		l.display();

		//		l.delete_By_element(10);
		//		l.display();

		//		int arr[]= {1,2,3};
		//
		//		l.add_All_Begin(arr);
		//		l.add_All_End(arr);
		//
		//		l.display();


		l.reverse();

		l.display();


	}
}
