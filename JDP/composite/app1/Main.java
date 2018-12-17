package composite.app1;

public class Main {

	public static void main(String[] args) {

		Tree tree = new Tree();
		Leaf leaf = new Leaf();
		Stick stick = new Stick();

		Composite composite = new Composite();

		composite.add(tree, leaf, stick);

		Composite composite1 = new Composite();

		Tree tree1 = new Tree();
		Leaf leaf1 = new Leaf();
		Stick stick1 = new Stick();

		composite1.add(tree1);
		composite1.add(leaf1);
		composite1.add(stick1);

		composite.add(composite1);

		composite.show();

	}

}
