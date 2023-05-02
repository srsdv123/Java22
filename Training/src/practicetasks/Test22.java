package practicetasks;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test33 ab = new Test33() {
			
			@Override
			public void mul(int a, int b, int c) {
				System.out.println(a*b*c);
				
			}
		};
		
		Test33 cd = ( a,  b,  c) -> {
			System.out.println(a*b+c);	
			
		};

	}

}
@FunctionalInterface
interface Test33 {
 public void mul(int a, int b, int c);
}