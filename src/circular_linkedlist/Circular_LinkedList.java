package circular_linkedlist;

public class Circular_LinkedList 
{
	Node front=null;
	Node rear=null;

	public void add_begin(int data)
	{
		Node temp=new Node(data);

		if(front==null)
		{
			temp.next=temp;
			front=rear=temp;
		}
		else
		{
			temp.next=front;
			front=temp;
			rear.next=front;
		}
	}

	public void add_end(int data)
	{
		Node temp=new Node(data);

		if(front==null)
		{
			temp.next=temp;
			front=rear=temp;
		}
		else
		{
			rear.next=temp;
			rear=temp;
			rear.next=front;
		}
	}

	public int size()
	{
		Node curr=front;
		int count=0;
		if(curr==null)
		{
			return 0;
		}
		else
		{
			do {
				count++;
				curr=curr.next;
			} while (curr!=front);	
		}
		return count;
	}

	public void add_at_index(int data,int index)
	{
		int size=size();
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
			Node temp=new Node(data);
			Node curr=front;
			int count=0;
			while(count!=index-1)
			{
				count++;
				curr=curr.next;
			}
			Node t2=curr.next;
			curr.next=temp;
			temp.next=t2;
		}
	}


	public void delete_begin()
	{
		if(front==null)
		{
			System.out.println(" Circular LinkedList is empty !!");
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
				front=temp;
				rear.next=front;
			}
		}
	}

	public void delete_end()
	{
		if(front==null)
		{
			System.out.println(" Circular LinkedList is empty !!");
		}
		else
		{
			if(front==rear)
			{
				front=rear=null;
			}
			else
			{
				Node curr=front;
				while(curr.next!=rear)
				{
					curr=curr.next;
				}
				curr.next=null;
				rear.next=null;
				rear=curr;
				rear.next=front;
			}
		}
	}

	public void delete_at_index(int index)
	{
		int size=size();
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
			Node curr=front;
			int count=0;
			while(count!=index-1)
			{
				count++;
				curr=curr.next;
			}
			Node temp=curr.next.next;
			Node t2=curr.next;
			t2.next=null;
			curr.next=temp;
		}
	}


	public void display()
	{
		Node curr=front;
		do {
			if(curr==null)
			{
				break;
			}
			System.out.println(curr.data);
			curr=curr.next;
		} while (curr!=front);
	}




}
