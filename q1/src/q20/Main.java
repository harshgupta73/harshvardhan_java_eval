package q20;

import java.io.IOException;

class A extends IOException{
	void methA() throws IOException {
		// TODO Auto-generated method stub
		IOException exception = new IOException();
		throw exception;
	}
	
}

class B extends IOException{
	void methB() throws IOException {
		// TODO Auto-generated method stub
		A a = new A();
		a.methA();
	}
}
public class Main {
	public static void main(String[] args) {
		try {
			B b = new B();
			b.methB();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
