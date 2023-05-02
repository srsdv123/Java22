package day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test2 implements Serializable{

	public static void main(String[] args) throws Exception {
	FileInputStream fo = new FileInputStream("C:\\Users\\Deeksha\\Desktop\\abc.txt");
		
		ObjectInputStream ob = new ObjectInputStream(fo);
		Employee e = (Employee) ob.readObject();
		System.out.println(e.getEmpName());
		System.out.println(e.getId());

	}

}
