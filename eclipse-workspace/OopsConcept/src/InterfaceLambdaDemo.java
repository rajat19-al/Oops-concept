
// Types of interface
// 1. Normal
// 2. Single abstract method - Functional Interface (java 8) - Lambda Expression
// 3. Marker interface 


interface mom
{
	 void show();
	
	
	}



public class InterfaceLambdaDemo {

	public static void main(String[] args)
	{
		mom obj1 = () -> System.out.println(" This is new ");
				obj1.show();
	}
	
}

	