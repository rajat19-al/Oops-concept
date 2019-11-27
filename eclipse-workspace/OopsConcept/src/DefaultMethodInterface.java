
interface sprite
{
	 void show ();
	default void coke()
	{
		System.out.println(" Its the main product ");
	}
	
	
}

class cococola implements sprite
{
	public void show()
	{
		System.out.println(" It's a Coke company ");
	}
}

interface fanta
{
	void show();
}
public class DefaultMethodInterface {

	public static void main(String[] args)
	{
		
		sprite objsprite = new cococola ()
		
		{
			public void show()
			{
				System.out.println(" Its a product of coke company ");
			}
		};
		objsprite.show();
		objsprite.coke();
		

	}

}
