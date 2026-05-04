package q9;

class Emp{
	String name;
	int id;
	double sal;
	String address;
	public Emp(String name, int id, double sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	
	void displayEmpInfo() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+id+" "+sal+" "+address);
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("harsh", 1, 12000, "Bov");
		System.out.println(emp);
		emp.displayEmpInfo();
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(emp.sal);
		System.out.println(emp.address);
		
	}
}
