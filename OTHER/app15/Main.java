package app15;

public class Main {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 10, 20, 30, 40 };

		print((Object[]) arr);

		System.out.println();
		print(1, 2, "c", 4, 5);

		System.out.println();
		print(new A(1), new A(2), new A(3), new B(), new B(), new B());

	}

	static void print(Object... args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
	}

}

class A {

	private int a;

	public A(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "A" + this.a;
	}

}

class B {

	private static int b;
	private int b1;

	public B() {
		b1 = ++b;
	}

	@Override
	public String toString() {
		return "B" + b1;
	}

}