package decorator.app3;

public abstract class PizzaDecorator implements Pizza {

	private Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getCost() {
		return pizza.getCost();
	}

	@Override
	public String getIngredients() {
		return pizza.getIngredients();
	}

}
