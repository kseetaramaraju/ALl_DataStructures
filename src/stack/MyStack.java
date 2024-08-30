package stack;

public class MyStack {

	int size=0;
	int top=-1;
	int arr[];

	public MyStack(int size) {
		super();
		this.size = size;
		arr=new int[size];
	}

	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else 
			return false;
	}

	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else 
			return false;
	}

	public void push(int ele)
	{
		if(isFull())
		{
			System.out.println(" stack is full !!");
		}
		else
		{
			arr[++top]=ele;
		}
	}

	public void pop()
	{
		if(isEmpty())
		{
			System.out.println(" stack is empty !!");
		}
		else
		{
			System.out.println(arr[top]+" is deleted ");
			top--;
		}
	}

	public void display()
	{
		if(isEmpty())
		{
			System.out.println(" stack is empty !!");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}

	public int peek()
	{
		if(isEmpty())
		{
			System.out.println(" stack is empty !!");
			return -1;
		}
		else
		{
			return arr[top];
		}
	}





}
