
class A
{
	public A()
{
	System.out.println("in A");
}


public A(int i)
{	
	
	System.out.println("int A");
	}
}


class B extends A
{
	public B()
	{
		super();
		System.out.println("in B");
	}


public B(int j)
	{
	super (j);
	System.out.println("int B");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		B obj = new B();
		
		
				
	}
}


