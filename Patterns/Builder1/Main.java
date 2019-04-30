package Builder1;

public class Main {

	public static void main(String[] args) {

		SuperCar superCar;
		
		superCar = new SuperCar.Builder("Audi").setMaxSpeed(200).setColor("Black").build();
		
		System.out.println(superCar);
	}

}

class SuperCar {
	private String name;
	private String color;
	private int maxSpeed;

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public String toString() {
		return name + ", " + color + ", " + maxSpeed;
	}

	public SuperCar(Builder builder) {
		this.name = builder.name;
		this.color = builder.color;
		this.maxSpeed = builder.maxSpeed;
	}

	static class Builder {
		private String name;
		private String color;
		private int maxSpeed;

		public Builder(String name) {
			this.name = name;
		}

		public Builder setColor(String color) {
			this.color = color;
			return this;
		}

		public Builder setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
			return this;
		}

		public SuperCar build() {
			return new SuperCar(this);
		}

	}
}
