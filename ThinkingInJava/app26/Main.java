package app26;

public class Main extends Shape {

	private Circle c;
	private Triangle t;
	private Line[] l = new Line[3];

	public Main(int i) {
		super(i);
		c = new Circle(1);
		t = new Triangle(1);
		for (int j = 0; j < l.length; ++j)
			l[j] = new Line(j, j * j);
		System.out.println("Комбінований конструктор");

	}

	@Override
	public void dispose() {
		System.out.println("main.dispose()");
		c.dispose();
		t.dispose();
		for (int j = 0; j < l.length; ++j)
			l[j].dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		Main x = new Main(47);
		try {

		} finally {
			x.dispose();
		}

	}

}

class Shape {
	public Shape(int i) {
		System.out.println("Корструктор Shape(int i)");
	}

	public Shape(int i, int y) {
		System.out.println("Корструктор Shape(int i, int y)");
	}

	public void dispose() {
		System.out.println("Завершення Shape");
	}
}

class Circle extends Shape {

	public Circle(int i) {
		super(i);
		System.out.println("Креслимо Circle");
	}

	@Override
	public void dispose() {
		System.out.println("Стираємо Circle");
		super.dispose();
	}

}

class Triangle extends Shape {

	public Triangle(int i) {
		super(i, i);
		System.out.println("Креслимо Triangle");
	}

	@Override
	public void dispose() {
		System.out.println("Стираємо Triangle");
		super.dispose();
	}

}

class Line extends Shape {
	private int start, end;

	public Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Креслимо Line: " + start + " " + end);
	}

	@Override
	public void dispose() {
		System.out.println("Стираємо Line: " + start + " " + end);
		super.dispose();
	}

}
