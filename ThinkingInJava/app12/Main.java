package app12;

@SuppressWarnings("all")
public class Main {

	public static void main(String[] args) {
		new Book(1);
		new Book(2);
		new Book(3);
		new Book(4);
		new Book(5);

		System.gc();

	}

}

class Book {
	private int i;

	public Book(int i) {
		this.i = i;
	}

	protected void finalize() {
		System.out.println("Помилка " + i);
	}
}
