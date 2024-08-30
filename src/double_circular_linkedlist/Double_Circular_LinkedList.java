package double_circular_linkedlist;

public class Double_Circular_LinkedList {

	Node front=null;
	Node rear=null;

	public void add_begin(int data)
	{
		Node newNode=new Node(data);
		if(front==null)
		{
			newNode.next=newNode;
			front=rear=newNode;
		}
		else
		{
			newNode.next=front;
			front.prev=newNode;
			front=newNode;
			rear.next=front;
		}
	}

	public void add_end(int data)
	{
		Node newNode=new Node(data);
		if(front==null)
		{
			newNode.next=newNode;
			front=rear=newNode;
		}
		else
		{
			rear.next=newNode;
			newNode.prev=rear;
			rear=newNode;
			rear.next=front;
		}
	}

	public void add_at_index(int data,int index)
	{
		Node newNode=new Node(data);
		int size = size();
		if(index<0 || index>size)
		{
			System.out.println(" out of bound,please enter valid index !!");
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
			Node curr=front;
			int count=0;
			while(count!=index-1)
			{
				count++;
				curr=curr.next;
			}
			Node temp=curr.next;
			curr.next=newNode;
			newNode.next=temp;
			newNode.prev=curr;
			temp.prev=newNode;
		}
	}

	public void delete_at_index(int index)
	{
		int size = size();
		if(index<0 || index>=size)
		{
			System.out.println(" out of bound,please enter valid index !!");
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
			Node curr=front;
			int count=0;
			while(count!=index-1)
			{
				count++;
				curr=curr.next;
			}
			Node temp=curr.next.next;
			Node t2=curr.next;
			t2.prev=null;
			t2.next=null;
			curr.next=temp;
			temp.prev=curr;
		}
	}


	public int size()
	{
		Node curr=front;
		int count=0;
		do {
			if(curr==null)
			{
				return count;
			}
			count++;
			curr=curr.next;
		}	
		while(curr!=front);
		return count;
	}
	public void forward_display()
	{
		Node curr=front;
		do {
			if(curr==null)
			{
				break;
			}
			System.out.println(curr.data);
			curr=curr.next;
		}	
		while(curr!=front);
	}

	public void backward_display()
	{
		Node curr=rear;
		do {
			if(curr==null)
			{
				break;
			}
			System.out.println(curr.data);
			curr=curr.prev;
		}	
		while(curr!=null);
	}

	public void delete_begin()
	{
		if(front==null)
		{
			System.out.println("Double Circular LinkedList is empty !!");
		}
		else
		{
			if(front==rear)
			{
				front=rear=null;
			}
			else
			{
				Node temp=front.next;
				front.next=null;
				temp.prev=null;
				front=temp;
				rear.next=front;
			}
		}
	}

	public void delete_end()
	{
		if(front==null)
		{
			System.out.println("Double Circular LinkedList is empty !!");
		}
		else
		{
			if(front==rear)
			{
				front=rear=null;
			}
			else
			{
				Node temp=rear.prev;
				rear.prev=null;
				rear.next=null;
				rear=temp;
				rear.next=front;
			}
		}
	}



}
