package app34;

class WithFinals {
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	private void g() {
		System.out.println("WithFinals.g()");
	}

	public void fg() {

		f();
		g();
	}
}

@SuppressWarnings("unused")
class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivatr.f()");
	}

	private void g() {
		System.out.println("OverridingPrivate.g()");
	}

}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivatr2.f()");
	}

	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}

}

public class Main {

	public static void main(String[] args) {

		OverridingPrivate2 op2 = new OverridingPrivate2();
		
		op2.f();
		op2.g();
		op2.fg();
		System.out.println();
		

		OverridingPrivate op1 = new OverridingPrivate();
		
		op1.fg();
	}

}
