package app2;

public abstract class Figure {
	
	private double width;
	private double heigth;
	
	
	public Figure(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	public void getParameters() {
		System.out.println("Parameteres of square: width = " + width + "  heigth = " + heigth);
	}

	public abstract void getArea();	
}
