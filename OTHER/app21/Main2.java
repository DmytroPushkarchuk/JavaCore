package app21;

public class Main2 extends Main {

	@Override
	public void scrub() {
		appEnd("\nDetergent.scrub()");
		super.scrub();
	}

	public void foam() {
		appEnd(" foam()");
	}

	public static void main(String[] args) {
		Main2 x = new Main2();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Перевіряємо базовий клас");
		Main.main(new String[] {});
		Main.main(args);
	}

}
