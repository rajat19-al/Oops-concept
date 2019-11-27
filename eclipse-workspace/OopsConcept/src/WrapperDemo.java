

public class WrapperDemo {

	public static void main(String[] args) {
		
//String str = "123";
//int n = Integer.parseInt(str);
//System.out.println(n);
		int i=5; // Primitative datatype
		Integer a = new Integer (i); // Wrapping
		int j = a.intValue(); // unwrapping
		Integer value = i; //Auto wrapping
		int k = value; // auto unwrapping 
	}

}
