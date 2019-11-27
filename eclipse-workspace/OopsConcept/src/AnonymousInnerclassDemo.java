
class pad
{
	public void show()
	{
		System.out.println(" This is pad ");
	}
}


public class AnonymousInnerclassDemo 

{

	public static void main(String[] args)
	{
		
		pad objpad = new pad()
		{
			
			public void show()
			{
				System.out.println(" This overwrites Pad ");
				
			}
			
			
		};
		
		objpad.show();
	}

}
