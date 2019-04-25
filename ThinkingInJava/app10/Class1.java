package app10;

public class Class1 {

	int i;

	public Class1(int i) {
		this.i = i;
		System.out.println("конструктор: Class1(int i)");
	}

	public Class1() {
		System.out.println("конструктор по замовчуванню: Class1()");
	}
	
	public void class1(int i) {
		System.out.println("не конструктор: class1()");
	}

}
