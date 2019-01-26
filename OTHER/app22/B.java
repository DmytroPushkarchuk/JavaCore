package app22;

public class B extends A {
	B() {
		System.out.println("Конструктор B");
	}

	@Override
	public String toString() {
		return super.toString() + " B";
	}
}
