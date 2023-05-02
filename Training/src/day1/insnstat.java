package day1;

public class insnstat {
	int a = 10;
	static int b = 40;
	
	 public static void main(String args[]){
		 insnstat obj = new insnstat();
	      
	      System.out.println("instance variable: "+obj.a);
	      System.out.println("static variable: "+insnstat.b);
	   }

}
