package composite.app2;

public class Main {

	public static void main(String[] args) {

		Composite composite = new Composite();

		composite.add(new Class1(), new Class2(), new Class3());

		composite.print();

	}

}
