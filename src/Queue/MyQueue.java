package Queue;

import java.util.Queue;

public class MyQueue {

	int size=0;
	int first=0;
	int last=0;
	int arr[];

	public MyQueue(int size) {
		super();
		this.size = size;
		arr=new int[size];
	}

	public boolean isFull()
	{
		if(last==size)
			return true;
		else
			return false;
	}

	public boolean isEmpty()
	{
		if(first==last)
			return true;
		else
			return false;
	}

	public void enque(int ele)
	{
		if(isFull())
		{
			System.out.println(" queue is full !!");
		}
		else
		{
			arr[last++]=ele;
		}
	}

	public void deque()
	{
		if(isEmpty())
		{
			System.out.println(" queue is empty !!");
		}
		else
		{
			for(int i=0;i<last-1;i++)
			{
				arr[i]=arr[i+1];
			}
			last--;
		}
	}

	public void display()
	{
		if(isEmpty())
		{
			System.out.println(" queue is empty !!");
		}
		else
		{
			for(int i=0;i<last;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

	public int peek()
	{
		if(isEmpty())
		{
			System.out.println(" queue is empty !!");
			return -1;
		}
		else
		{
			return arr[first];
		}
	}



}
