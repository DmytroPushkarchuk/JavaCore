package app17;

public class Main {

	public static void main(String... args) {

		int i = 4;

		Integer[] arr = new Integer[] { 1, 2, 3, 4 };

		print(arr);

		print(new A(), 2, "c", i);

	}

	public static void print(Integer... arr) {

		for (Integer arg : arr)
			System.out.print(arg + " ");

		System.out.println();

	}

	public static void print(Object... objects) {

		for (Object obj : objects)
			System.out.print(obj + " ");
		
		System.out.println();

	}

}

class A {

	static private int a;

	int a1;

	public A() {
		a++;
		a1 = a;
	}

	@Override
	public String toString() {
		return "Class A" + a1;
	}

}
