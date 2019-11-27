
class Student
{
	private String Name;
	private int rollno;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
		
}



public class EncapsulationDemo {

	
	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.setName("Anish");
		s1.setRollno(4);
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
		
	}

}
