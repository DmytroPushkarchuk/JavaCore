package decorator.app1;

public class Decorator2 extends AbstractDecorator{

	public Decorator2(InterfaceDecorator interfaceDecorator) {
		super(interfaceDecorator);
		
	}

	@Override
	public String getString() {
		return super.getString() + " + Spring";
	}

	@Override
	public int getInt() {
		return super.getInt() + 400;
	}
	
	

}
