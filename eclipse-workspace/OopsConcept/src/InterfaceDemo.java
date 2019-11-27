
interface company
{
	void write ();
} 

interface hello
{
	 void read ();
	
		
	
	
}
class shoe implements company, hello
{
	
	public void write()
	 {
		 System.out.println(" This is shoe 1 ");
	 }
	 public void read()
	 {
		 System.out.println(" This is shoe 2 ");
	 }
}

class lace extends shoe
{
	public void write()
	{
		System.out.println(" This is lace 1 ");
		
	}
	
}

class duo 
{
	public void dosomething (company k)
	{
		k.write();
		
	}
}
class trio
{
	public void any (hello j)
	{
		j.read();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
	
		
		lace objlace = new lace ();
		
		shoe objshoe = new shoe();
		
		
		
		
		
		duo objduo = new duo ();
		
		trio objtrio = new trio ();
		
		
		
		
		objduo.dosomething(objlace);
		objtrio.any(objlace);
		objduo.dosomething(objshoe);
		
	
	
		
	}

	}

