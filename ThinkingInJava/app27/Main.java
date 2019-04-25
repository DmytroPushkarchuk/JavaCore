package app27;

class A {
	char app(char c) {
		System.out.println("char ch " + c);
		return c;
	}

	float app(float c) {
		System.out.println("float f " + c);
		return c;
	}

}

class B {

	@Override
	public String toString() {
		return "B []";
	}

}

class C extends A {
	void app(B b) {
		System.out.println("app " + b);
	}

}

public class Main {

	public static void main(String[] args) {

		C c = new C();
		c.app('a');
		c.app(1.0F);
		c.app(new B());
	}

}
