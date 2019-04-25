package app30;

class A {
	static void z(A a) {
		System.out.println("static");
	}

	void x(A a) {
		System.out.println("A.x(A a)");
	}
}

public class Main extends A {

	public static void main(String[] args) {

		Main e = new Main();

		A a = new A();
		a.x(e);
		e.x(e);

		A.z(e);
		Main.z(e);
	}

	void x(A a) {
		System.out.println("Main.x(A a)");
	}
}
