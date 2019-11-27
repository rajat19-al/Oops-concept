class Ab
{
	public  void show ()
	{
		System.out.println(" in A show ");
		
	}
	
}
class Bc extends Ab
{
	public void show ()
	{
		System.out.println(" in B show ");
	}
	
}

class C extends Bc
{
	public void show ()
	{
		System.out.println(" in C show ");
	}
}

public class FinalKeyboardDemo {

	public static void main(String[] args) {
		
		Ab obj = new Bc();
		obj.show();
	}

}
