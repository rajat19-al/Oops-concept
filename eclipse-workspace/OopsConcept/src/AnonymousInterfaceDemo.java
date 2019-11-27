interface dad
{
	 void show();
	
	
	}



public class AnonymousInterfaceDemo {

	public static void main(String[] args)
	{
		dad objdad = new dad()
		{
			
			public void show()
			{
				System.out.println(" This overwrites Pad ");
				
			}
			
			
		};
		
		objdad.show();
		
	}
	}


