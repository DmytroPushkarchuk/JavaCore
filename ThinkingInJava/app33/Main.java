package app33;

class Gizmo {
	public void spin() {

	}
}

public class Main {

	void with(final Gizmo g) {

//		g = new Gizmo();

	}

	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}

	void f(final int i) {
//		i++;
	}

	int g(final int i) {
		return i + 1;
	}

	public static void main(String[] args) {
		Main myMain = new Main();

		myMain.with(null);
		myMain.without(null);

	}

}
