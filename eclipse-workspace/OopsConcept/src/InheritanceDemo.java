
class Calc // Super
{
	public int add(int i, int j)
	{
		return i+j;
	}
}
	class CalcAdv extends Calc //Sub
	{
		
		public int sub (int i, int j)
		{
			return i-j;
			
		}
	}
class CalcVeryAdv extends CalcAdv
{
	public int mul (int i, int j)
	{
		return i*j;
		
	}
}

class CalcSuperVeryAdv extends CalcVeryAdv
{
	public int div (int i, int j)
	{
		return i/j;
		
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		CalcSuperVeryAdv c1= new CalcSuperVeryAdv();
		int result1 = c1.add(8, 24);
		int result2 = c1.sub(8, 4);
		int result3 = c1.mul(4, 2);
		int result4 = c1.div(20,2);
	
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
