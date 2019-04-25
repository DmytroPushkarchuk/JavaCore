package app36;

class Insect {
	
	private int i = 9;
	protected int j;

	static void print(Object i) {
		System.out.println(i);
	}

	public Insect() {
		System.out.println("i = " + i + ", j = " + j);
		this.j = 39;
	}

	@SuppressWarnings("unused")
	private static int x1 = printInit("Field 'Static Insect.x1' is initialized");

	static int printInit(String str) {
		print(str);
		return 47;
	}

}



@SuppressWarnings("unused")
public class Main extends Insect{
	
	private int k = printInit("Field 'Beetle.k' is iniitalized");
	public Main() {
		print("k = " + k);
		print("j = " + j);
	}

	private static int x2 = printInit("Field 'static Beetle.x2' is initialized");
	
	public static void main(String[] args) {
		print("Constructor 'Beetle'");
		Main b = new Main();
	}

}
