package practicetasks;

public class Employee {
	int id;
    String name;
    int salary;
    
    public Employee()
    {
    	
    }
    public Employee(int i, String n)
    {
    	this.id= i;
    	this.name = n;
    }
    public Employee(int i, String n, int s)
    {
    	this.id= i;
    	this.name = n;
    	this.salary = s;
    }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(220);
		emp.setName("Radha");
		emp.setSalary(90000);
		System.out.println("Employee ID :" +emp.getId());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Salary:"+emp.getSalary());
		
	}

}
