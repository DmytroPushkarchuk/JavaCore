package app29;

class A {
	static int i = 0;

	void a1() {
		System.out.println("a1");
	}

	A a2() {
		++i;
		return new A();
	}

	@Override
	public String toString() {
		return "" + i;
	}
}

public class Main {

	public static void main(String[] args) {

		A a = new A();
		a.a2().a2().a2().a2();
		System.out.println(a);
		A.i = 0;
		a.a2().a2().a2().a2();
		System.out.println(a);

	}

}