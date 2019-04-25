package app32;

@SuppressWarnings("unused")
class Poppet {

	private int i;

	Poppet(int i) {
		this.i = i;
	}

}

@SuppressWarnings("unused")
public class Main {

	private final int i1 = 0;
	private final int i2;
	private final int i3;
	private final Poppet p;

	public Main() {
		this.i2 = 2;
		this.i3 = 3;
		this.p = new Poppet(1);
	}

	public Main(int i2) {
		this.i2 = i2;
		this.i3 = ++i2;
		this.p = new Poppet(i2);

	}

	public static void main(String[] args) {
		new Main();
		new Main(47);

	}

}
