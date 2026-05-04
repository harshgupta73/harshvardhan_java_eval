package q12;

class Tasks{
	String t1="mails";
	String t2="frontend";
	
	public Tasks() {
		// TODO Auto-generated constructor stub
		System.out.println("Tasks...");
		
	}
	
	void getTaskInfo() {
		// TODO Auto-generated method stub
		System.out.println("Tasks:");
		System.out.println(t1+" "+t2);
	}
}

class Emp extends Tasks{
	String name;

	public Emp(String name) {
		super();
		this.name = name;
	}
	
	void getWorkDone() {
		// TODO Auto-generated method stub
		System.out.println(name);
		super.getTaskInfo();
		System.out.println(super.t1);
		System.out.println(super.t2);
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("harsh");
		emp.getWorkDone();
	}
}
