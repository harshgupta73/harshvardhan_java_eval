package q17_outside_package;

import q17_within_package.Main;

public class Main4 {
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.a);
		//only  public accessible
	}
}
