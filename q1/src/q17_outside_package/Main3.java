package q17_outside_package;

import q17_within_package.Main;

public class Main3 extends Main{
	public static void main(String[] args) {
		Main3 main3 = new Main3();
		System.out.println(main3.a);
		System.out.println(main3.c);
		//default not accessible outside the package
		//protected within package anywhere and outside package only with extends or child class
	}
}
