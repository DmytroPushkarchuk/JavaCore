package app19;

public class Main {

	public static void main(String[] args) {
		X a = new A();
		X b = new B();

		System.out.println(a + " " + b);

		System.out.println(a.equals(b));

		b = a;

		System.out.println(a.equals(b));
	}

}

interface X {

	public void x1();
}

class A implements X {

	A() {
		x1();
	}

	@Override
	public void x1() {
		System.out.println("class A implements X");
	}

	@Override
	public String toString() {
		return "A";
	}

}

class B implements X {

	B() {
		x1();
	}

	@Override
	public void x1() {
		System.out.println("class B implements X");
	}

	@Override
	public String toString() {
		return "B";
	}

}
