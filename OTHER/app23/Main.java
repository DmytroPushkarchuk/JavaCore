package app23;

public class Main extends B {

	private int i;

	public Main(int i) {
		super(i);
		this.i = i;
	}

	@Override
	public String toString() {
		return super.toString() + "Main 	i=" + i + "\n";
	}

	public static void main(String[] args) {

		Main x = new Main(1);
		System.out.println(x);

	}

}

class A {
	private int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "A 	i=" + i + "\n";
	}

}

class B extends A {
	private int i;

	public B(int i) {
		super(i);
		this.i = i;
	}

	@Override
	public String toString() {
		return super.toString() + "B 	i=" + i + "\n";
	}

}