package doubly_linkedlist;

public class Double_LinkedList {

	Node front=null;
	Node rear=null;

	public void add_end(int data)
	{
		Node newNode=new Node(data);
		if(front==null)
		{
			front=rear=newNode;
		}
		else 
		{
			rear.next=newNode;
			newNode.prev=rear;
			rear=newNode;
		}
	}

	public void add_begin(int data)
	{
		Node newNode=new Node(data);
		if(front==null)
		{
			front=rear=newNode;
		}
		else 
		{
			newNode.next=front;
			front.prev=newNode;
			front=newNode;
		}
	}

	public void add_At_index(int data,int index)
	{

		Node newNode=new Node(data);

		int size = size();
		if(index<0 || index>size)
		{
			System.out.println(" index out of bound,Please enter valid index !!");
		}
		else if(index==0)
		{
			add_begin(data);
		}
		else if(index==size)
		{
			add_end(data);
		}
		else
		{
			int c=0;
			Node curr=front;
			while(c!=index-1)
			{
				c++;
				curr=curr.next;
			}
			Node temp=curr.next;
			curr.next=newNode;
			temp.prev=newNode;
			newNode.prev=curr;
			newNode.next=temp;
		}
	}

	public int size()
	{
		int count=0;
		Node curr=front;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		return count;
	}

	public void delete_begin()
	{
		if(front==null)
		{
			System.out.println(" Double LinkedList is Empty !!");
		}
		else if(front==rear)
		{
			front=rear=null;
		}
		else
		{
			Node temp=front.next;
			front.next=null;
			temp.prev=null;
			front=temp;
		}
	}

	public void delete_end()
	{
		if(front==null)
		{
			System.out.println(" Double LinkedList is Empty !!");
		}
		else if(front==rear)
		{
			front=rear=null;
		}
		else
		{

			//			Node curr=front;
			//			while(curr.next!=rear)
			//			{
			//				curr=curr.next;
			//			}
			//			Node temp=curr.next;
			//			curr.next=null;
			//			temp.prev=null;
			//			rear=curr;

			Node prev=rear.prev;
			prev.next=null;
			rear.prev=null;
			rear=prev;
		}
	}

	public void delete_At_index(int index)
	{
		int size = size();
		if(index<0 || index>=size)
		{
			System.out.println(" index out of bound,Please enter valid index !!");
		}
		else if(index==0)
		{
			delete_begin();
		}
		else if(index==size-1)
		{
			delete_end();
		}
		else
		{
			int c=0;
			Node curr=front;
			while(c!=index-1)
			{
				c++;
				curr=curr.next;
			}
			Node temp=curr.next.next;
			Node t2=curr.next;
			curr.next=temp;
			temp.prev=curr;

			t2.prev=null;
			t2.next=null;
		}
	}

	public void delete_by_element(int data)
	{
		int index = getIndex(data);
		delete_At_index(index);
	}

	private int getIndex(int data)
	{
		int count=0;
		Node curr=front;
		while(curr!=null)
		{
			if(curr.data==data)
			{
				return count;
			}
			count++;
			curr=curr.next;
		}
		return -1;
	}

	public void forward_display()
	{
		Node curr=front;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

	public void backward_display()
	{
		Node curr=rear;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.prev;
		}
	}


}
