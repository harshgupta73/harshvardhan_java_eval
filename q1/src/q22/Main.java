package q22;

class Emp{
	int id;
	String name;
	int age;
	public Emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp1 = new Emp(1, "harsh", 22);
		Emp emp2 = new Emp(2, "sara", 23);
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
