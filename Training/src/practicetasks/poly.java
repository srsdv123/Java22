package practicetasks;

public class poly extends poly2{
	
	public void mul(int a, int b) {
		System.out.println("multiplication of two numbers:"+a*b);
	}
	@Override
	public void mul(int p)
	{
		System.out.println("multiplication of number:"+p*p);
	}
	public static void main(String[] args) {
		poly2 m =new poly();
		poly m2 = new poly();
		m2.mul(9,9);
		m.mul(8);
	}
	

}
