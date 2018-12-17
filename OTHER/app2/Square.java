package app2;

public class Square extends Figure{

	private double width;
	private double heigth;

	public Square(double width, double heigth) {
		super(width, heigth);
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public void getArea() {
		System.out.println(heigth*width);
	}

}
