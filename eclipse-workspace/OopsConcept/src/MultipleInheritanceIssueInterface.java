@FunctionalInterface
interface Demo
{
	void abc();
	default  void show()
	{
		System.out.println(" This is Demo 1 ");
	}
}

interface Demo2
{
	default void show()
	{
		System.out.println(" This is Demo 2 ");
		
	}
}

class DemoReact implements Demo, Demo2
{
	public void abc()
	{
		System.out.println(" This is Final Demo ");
	}

	
@Override
	public void show() {
		// TODO Auto-generated method stub
		Demo.super.show();
	}
}

public class MultipleInheritanceIssueInterface 
{

	public static void main(String[] args)
	{
		Demo objDemo = new DemoReact();
		objDemo.abc();
		objDemo.show();
				
	
	}
}

