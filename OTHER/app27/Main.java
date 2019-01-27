package app27;

class A {
	char app(char c) {
		System.out.println("char ch(char c)");
		return c;
	}

	float app(float c) {
		System.out.println("float f(float c)");
		return c;
	}

}

class B {

}

class C extends A {
	void app(B b) {
		System.out.println("app(B b)");
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
