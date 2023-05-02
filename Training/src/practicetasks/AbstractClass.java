package practicetasks;

public class AbstractClass extends AbstractExample {

	@Override
	public void pow(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("power of "+a+" and "+b+ " is :"+ (2*5));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass abs =new AbstractClass();
		abs.hello();
		abs.pow(2, 5);

	}

	

}
