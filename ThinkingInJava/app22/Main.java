package app22;

public class Main extends B {

	public Main() {
		System.out.println("Конструктор Main");
	}

	public static void main(String[] args) {

		Main x = new Main();

		System.out.println(x);

	}

	@Override
	public String toString() {
		return super.toString() + " Main";
	}

}
