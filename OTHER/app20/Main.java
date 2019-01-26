package app20;

public class Main {

	public static void main(String... args) {
		Class2 class2 = new Class2();
		System.out.println(class2);

	}
}

class Class1 {
	private String str;

	public Class1() {
		this.str = "Class1.str";
	}

	@Override
	public String toString() {
		return str;
	}

}

class Class2 {
	private String s1 = "s1", s2, s3;
	private Class1 class1;
	private int i;
	private float f;

	public Class2() {
		this.s2 = "s2";
		this.f = 0.1f;
		class1 = new Class1();
	}

	@Override
	public String toString() {
		if (s3 == null)
			s3 = "s3";
		return 		"s1 = " + s1 + "\n" +
					"s2 = " + s2 + "\n" +
					"s3 = " + s3 + "\n" +
					"i = " + i + "\n" +
					"f = " + f + "\n" +
					"class1 = " + class1;
	}

}