package q17_within_package;

public class Main {
	public int a=1;
	private int b=2;
	protected int c=3;
	int d=4;
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.a);
		System.out.println(main.b);
		System.out.println(main.c);
		System.out.println(main.d);
	}
}
