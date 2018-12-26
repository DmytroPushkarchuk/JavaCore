package app7;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random(47);
		int i, y;
		float x, z;
		i = random.nextInt(100) + 1;
		y = random.nextInt(100) + 1;
		x = random.nextFloat();
		z = random.nextFloat();
		System.out.println(i + " " + y);
		System.out.println(x + " " + z);

		int y1 = 8;
		int y2 = 8;
		System.out.println(y1 == y2);

		Integer i1 = new Integer(8);
		Integer i2 = new Integer(8);

		System.out.println(i1.equals(i2));

		System.out.println(i1 == i2);

		i1 = i2;
		System.out.println(i1 == i2);
		
		i2 = 1;
		System.out.println(i1 == i2);
		
		Class1 class1 = new Class1(5);
		Class1 class2 = new Class1(6);
		
		System.out.println(class1.equals(class2));
		
		class1 = class2;
		
		System.out.println(class1.equals(class2));
		
		class1.setI(1);
		
		System.out.println(class1.getI()+" "+class2.getI());
		
	}

}
