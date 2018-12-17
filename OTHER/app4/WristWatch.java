package app4;

public class WristWatch {

	String title;

	public WristWatch(String title) {
		this.title = title;
	}

	public void setCountry(String name) {
		class Country {
			void display() {
				System.out.println("Coutry: " + name);
			}
		}

		Country country = new Country();

		country.display();

	}

	public void setModel(String name) {
		class Model {
			void display() {
				System.out.println("Model: " + name);
			}
		}

		Model model = new Model();

		model.display();

	}

}
