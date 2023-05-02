package day1;

public class exmethod {
	
	public int square(int n) {
		return n*n;	
	}
	
	 public static void main(String[] args) {
		    exmethod meth = new exmethod();
		    int r;
		    r = meth.square(10);
		    System.out.println("Squared value of " + r);
		  }

}
