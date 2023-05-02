package day1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	int id;
	transient String  empName;
	int sal;
	

	public Employee(int id, String empName, int sal) {
		super();
		this.id = id;
		this.empName = empName;
		this.sal = sal;
	}


	public static void main(String[] args) throws Exception{
		Employee emp =  new Employee(12, "abc", 200);
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Deeksha\\Desktop\\abc.txt");
		
		ObjectOutputStream ob = new ObjectOutputStream(fo);
		ob.writeObject(emp);

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}

}
