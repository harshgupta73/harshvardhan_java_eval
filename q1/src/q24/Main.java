package q24;

class Emp{
	double calSal(double sal) {
		return sal;
	}
	double calSal(double sal,double bonus) {
		return sal+bonus;
	}
	
	double calSal(double sal,double bonus,double tax) {
		return sal+bonus-tax;
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.calSal(12));
		System.out.println(emp.calSal(12,2));
		System.out.println(emp.calSal(12,12,2));
		
	}
}
