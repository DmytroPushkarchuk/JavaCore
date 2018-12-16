package decorator.app3;

public class SimplePizze implements Pizza {

	@Override
	public double getCost() {
		return 4.5;
	}

	@Override
	public String getIngredients() {
		return "Pizza";
	}

}
