package app13;

public class Main {

	public static void main(String[] args) {

		new Class1(10, 20);

	}

}

class Class1 {

	static int i, j;

	int f = 5;
	int x, y;

	static {
		System.out.println("статична ініціалізація");
		System.out.println(i + " " + j);
		i = 3;
		j = 4;
		System.out.println(i + " " + j);
	}

	{
		System.out.println("нестатична ініціалізація");
		System.out.println(this.x + " " + this.y);
		this.x = 1;
		this.y = 2;
		System.out.println(this.x + " " + this.y);
		System.out.println(f);
	}
 
	public Class1() {
		System.out.println("конструктор без переметрів");
	}

	public Class1(int x, int y) {
		this();
		System.out.println("конструктор");
		System.out.println(this.x + " " + this.y);
		this.x = x;
		this.y = y;
		System.out.println(this.x + " " + this.y);

	}

}