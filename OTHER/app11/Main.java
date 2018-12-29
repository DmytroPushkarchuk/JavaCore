package app11;

public class Main {

	public static void main(String[] args) {

		Class1 class1 = new Class1();

		class1.leaf().leaf().leaf().leaf().leaf().leaf().leaf().leaf().print();

	}

}

class Class1 {
	int i = 0;

	public Class1 leaf() {
		i++;
		return this;
	}

	void print() {
		System.out.println(i);
	}

}