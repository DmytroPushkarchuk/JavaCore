package decorator.app1;

public abstract class AbstractDecorator implements InterfaceDecorator {

	InterfaceDecorator interfaceDecorator;

	public AbstractDecorator(InterfaceDecorator interfaceDecorator) {
		this.interfaceDecorator = interfaceDecorator;
	}

	@Override
	public String getString() {
		return interfaceDecorator.getString();
	}

	@Override
	public int getInt() {
		return interfaceDecorator.getInt();
	}

}
