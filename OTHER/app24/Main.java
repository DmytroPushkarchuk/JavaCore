package app24;

public class Main {

	private String str;

	private A a = new A();

	public Main(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "str = " + str;
	}

	public void a(int i) {
		a.a(i);
	}

	public void b(int i) {
		a.b(i);
	}

	public static void main(String[] args) {

		Main class1 = new Main("Name");
		
		System.out.println(class1);
		
		System.out.println(new Main("x"));
		System.out.println(class1);
		
		class1.a(1);
		class1.b(2);

	}

}

class A {

	void a(int i) {
		System.out.println("" + i);
	}

	void b(int i) {
		System.out.println("" + i);
	}
}