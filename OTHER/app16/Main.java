package app16;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {

		HashSet<Class1> set1 = new LinkedHashSet<Class1>();

		set1 = Class1.getClass1(10);

		System.out.println(set1);

	}

}

class Class1 {

	private int x;

	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "" + x;
	}

	public Class1(int x) {
		this.x = x;
	}

	static HashSet<Class1> getClass1(int i) {

		HashSet<Class1> result = new LinkedHashSet<Class1>();

		for (int j = 0; j < i; j++) {
			result.add(new Class1(j));
		}

		return result;

	}

}
