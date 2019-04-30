package Builder4;

import Builder4.House.Builder;

public class Main {

	public static void main(String[] args) {

		House house = new Builder(1, "Voli")
				.floor(3)
				.window(5)
				.build();

		System.out.println(house);

	}

}

class House {

	private int room;
	private int window;
	private String street;
	private int floor;

	public House(Builder builder) {
		this.room = builder.room;
		this.window = builder.window;
		this.street = builder.street;
		this.floor = builder.floor;

	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "House [room=" + room + ", window=" + window + ", street=" + street + ", floor=" + floor + "]";
	}

	public static class Builder {
		private int room;
		private int window;
		private String street;
		private int floor;

		public Builder(int room, String street) {
			this.room = room;
			this.street = street;
		}

		public Builder window(int window) {
			this.window = window;
			return this;
		}

		public Builder floor(int floor) {
			this.floor = floor;
			return this;
		}

		public House build() {
			return new House(this);
		}

	}

}