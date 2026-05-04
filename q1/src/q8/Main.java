package q8;

class Accountant{
	double calSal(double sal,double bonus) {
		// TODO Auto-generated method stub
		System.out.println("Accountant Sal:");
		return sal+bonus;
	}
}

class Emp extends Accountant{
	@Override
	double calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		System.out.println("Emp Sal:");
		return sal+bonus;
	}
}

public class Main {
	public static void main(String[] args) {
		
		Accountant accountant = new Accountant();
		System.out.println(accountant.calSal(1100, 12));
		Emp emp = new Emp();
		System.out.println(emp.calSal(1200, 12));
	}
}
