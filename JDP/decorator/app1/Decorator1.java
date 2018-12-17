package decorator.app1;

public class Decorator1 extends AbstractDecorator{

	public Decorator1(InterfaceDecorator interfaceDecorator) {
		super(interfaceDecorator);
	}

	@Override
	public String getString() {
		return super.getString() + " + Stream API";
	}

	@Override
	public int getInt() {
		return super.getInt() + 100;
	}
	
	

}
