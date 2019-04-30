package Builder2;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		SportCar sportCar = new SportCar.Builder("BMW").setDoors(4).setColor("ddd").build();

	}

}

@SuppressWarnings("unused")
class SportCar {
	private String name;
	private String color;
	private int doors;
	private int maxSpeed;

	public SportCar(Builder builder) {
		this.name = builder.name;
		this.color = builder.color;
		this.doors = builder.doors;
		this.maxSpeed = builder.maxSpeed;

	}

	
	
	
	
	static class Builder {
		private String name;
		private String color;
		private int doors;
		private int maxSpeed;

		public Builder(String name) {
			this.name = name;
		}

		public Builder setColor(String color) {
			this.color = color;
			return this;
		}

		public Builder setDoors(int doors) {
			this.doors = doors;
			return this;
		}

		public Builder setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
			return this;
		}

		public SportCar build() {
			return new SportCar(this);
		}

	}

}