package app25;

@SuppressWarnings("all")
public class Main extends X {
	
	private int i;
	private A1 a1;
	private B1 b1;

	public Main(int i) {
		super(i);
		this.i = ++i;
		a1 = new A1(++i);
		b1 = new B1(++i);
		System.out.println("Конструктор Main " + ++i);
	}

	public static void main(String[] args) {
		Main app = new Main(1);
	}
}

class A {
	public A(int a) {
		System.out.println("Конструктор A " + a);
	}
}

class A1 extends A {
	public A1(int a) {
		super(a);
		System.out.println("Конструктор A1 " + a);
	}
}

class B {
	public B(int b) {
		System.out.println("Конструктор B " + b);
	}
}

class B1 extends B {
	public B1(int b) {
		super(b);
		System.out.println("Конструктор B1 " + b);
	}
}

class X {
	public X(int x) {
		System.out.println("Конструктор X " + x);
	}
}