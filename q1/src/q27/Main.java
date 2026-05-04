package q27;

class Emp{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize called");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(1, "harsh");
		Emp emp2 = new Emp(2, "omkars");
		emp2=emp;
		System.gc();
		
	}
}
