package single_linkedlist;

public class Single_LinkedList {

	Node head=null;

	public void add_end(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
		}
		else 
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=temp;
		}
	}

	public void add_begin(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}


	public void add_At_Index(int data,int index)
	{
		Node newnode =new Node(data);
		int size=size();
		if(index<0 || index>size)
		{
			System.out.println(" index out of bound,Please enter valid index !! ");
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
			Node curr=head;
			int count=0;
			while(count!=index-1)
			{
				count++;
				curr=curr.next;
			}
			Node temp=curr.next;
			curr.next=newnode;
			newnode.next=temp;
		}
	}


	public void delete_end()
	{
		if(head==null)
		{
			System.out.println(" single linked list is empty !! ");
		}
		else if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node curr=head;
			while(curr.next.next!=null)
			{
				curr=curr.next;
			}
			curr.next=null;
		}
	}

	public void delete_begin()
	{
		if(head==null)
		{
			System.out.println(" single linked list is empty !! ");
		}
		else if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node temp=head.next;
			head.next=null;
			head=temp;
		}
	}

	public void delete_At_index(int index)
	{
		int size = size();
		if(index<0 || index>=size)
		{
			System.out.println(" index out of bound,Please enter valid index  !! ");
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
			Node curr=head;
			int count=0;
			while(count!=index-1)
			{
				count++;
				curr=curr.next;
			}
			Node temp=curr.next.next;
			curr.next.next=null;
			curr.next=temp;
		}
	}

	public void delete_By_element(int data)
	{
		int index = getIndex(data);
		delete_At_index(index);
	}


	private int getIndex(int data)
	{
		Node curr=head;
		int count=0;
		while(curr!=null)
		{
			if(data==curr.data)
			{
				return count;
			}
			count++;
			curr=curr.next;
		}
		return -1;
	}

	public void display()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

	public int size()
	{
		int c=0;
		Node curr=head;
		while(curr!=null)
		{
			c++;
			curr=curr.next;
		}
		return c;
	}

	public void add_All_Begin(int arr[])
	{
		for(int e:arr)
		{
			add_begin(e); 
		}
	}

	public void add_All_End(int arr[])
	{
		for(int e:arr)
		{
			add_end(e); 
		}
	}

	public void reverse()
	{
		if(head==null)
		{
			System.out.println(" Linked list is empty !! ");
		}
		else if(head.next==null)
		{
			display();
		}
		else
		{
			Node curr=head;
			Node prev=null;

			while(curr.next!=null)
			{
				Node nextNode=curr.next;
				curr.next=prev;
				prev=curr;
				curr=nextNode;
			}
			curr.next=prev;
			head=curr;
		}
	}



}
