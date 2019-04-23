package app31;

import java.util.*;

class Value {
	int i;

	public Value(int i) {
		this.i = i;
	}

}

@SuppressWarnings("unused")
public class Main {

	private static Random rand = new Random(47);

	private String id;

	public Main(String id) {
		this.id = id;
	}

	static void print(String str) {
		System.out.println(str);
	}

	static void print(Object fd1) {
		System.out.println(fd1);
	}

	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 999;
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);

	private static Value v0;
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);

	private final int[] a = { 1, 2, 3, 4, 5, 6 };

	@Override
	public String toString() {
		return id + ": i4 = " + i4 + ", INT_5 = " + INT_5;
	}

	public static void main(String[] args) {

		Main fd1 = new Main("id1");

//		fd1.valueOne++;

		fd1.v2.i++;

		fd1.v1 = new Value(9);
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++;
//		fd1.v2 = new Value (0);
//		fd1.VAL_3 = new Value(1);
//		fd1.a = new int[3];
		print(fd1);
		print("Создадаем FinalData");
		Main fd2 = new Main("id2");
		print(fd1);
		print(fd2);

		print("" + fd1.valueOne);
		
		
		v0 = new Value(2);
		
		print(""+ v0.i);
		
	}

}
