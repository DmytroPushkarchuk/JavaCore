package decorator.app3;

public class Main {

	public static void main(String[] args) {

		Pizza simplePizza = new SimplePizze();
		System.out.printf("Ingrediets: %s %nCost: $%.2f", simplePizza.getIngredients(), simplePizza.getCost());

		Pizza pizzaWithMushrooms = new PizzaWithMushrooms(new SimplePizze());
		System.out.printf("%nIngrediets: %s %nCost: $%.2f", pizzaWithMushrooms.getIngredients(),
				pizzaWithMushrooms.getCost());

		Pizza pizzaWithSausages = new PizzaWithMushrooms(new PizzaWithSausages(new SimplePizze()));
		System.out.printf("%nIngrediets: %s %nCost: $%.2f", pizzaWithSausages.getIngredients(),
				pizzaWithSausages.getCost());
		
	}

}
