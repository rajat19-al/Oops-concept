class system
{
	private int height;

	
	public void setHeight(int height) {
		this.height = height;
		if (height <8) {
			System.out.println(" The height is ok ");
		}
		else 
			System.out.println(" Please enter below 8 ");
			
	}
	
	public int getHeight() {
		return height;
		
		
	}
	class system2
	
	{
		
			private int height;

			
			public void setHeight(int height) {
				this.height = height;
				if (height <8) {
					System.out.println(" The height is ok ");
				}
				else 
					System.out.println(" Please enter below 8 ");
					
			}
			
			public int getHeight() {
				return height;
				
				
			}
	}
	
	
}

public class EncapsulationDemo2 {

	public static void main(String[] args) {
		
		system h1 = new system();
		h1.setHeight(6);
		System.out.println(h1.getHeight());
		
		
		 
		system h2 = new system();
		h2.setHeight(9);
		System.out.println(h2.getHeight());
		

	}

}
