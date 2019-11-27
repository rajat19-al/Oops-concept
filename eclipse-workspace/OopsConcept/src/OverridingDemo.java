
class Ov
{
	
	public void show()
	{
		
		System.out.println(" in A ");
		
	}
	
}
	
	class Rajat extends Ov
	{
		
	@Override
	public void show()
	{
		System.out.println(" in B ");
	}
}


	
	
	public class OverridingDemo
{

	public static void main(String[] args) 
	{
		
		Rajat obj1 = new Rajat();
		obj1.show();

	}

}

