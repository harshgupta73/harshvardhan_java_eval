package q14;

class Emp{
	String name;
	double sal;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setName("harsh");
		emp.setSal(60000);
		emp.setId(1);
		
		System.out.println(emp.getName());
		System.out.println(emp.getSal());
		System.out.println(emp.getId());
		
		
		System.out.println(emp);
		
	}
}
