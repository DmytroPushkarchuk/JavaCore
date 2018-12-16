package decorator.app3;

public class PizzaWithMushrooms extends PizzaDecorator {

	public PizzaWithMushrooms(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 2;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + " + MushRooms";
	}

}
