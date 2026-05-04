package q19;

class A{
	A methA() {
		// TODO Auto-generated method stub
		System.out.println("methA");
		return this;
	}
}

class B extends A {
	@Override
	B methA() {
		// TODO Auto-generated method stub
		System.out.println("methB");
		return this;
	}
	
	void methB() {
		// TODO Auto-generated method stub
		System.out.println("methB via methA");
	}
}

public class Main {
	public static void main(String[] args) {
		B b= new B();
		b.methA().methB();
	}
}
