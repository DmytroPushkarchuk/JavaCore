package decorator.app1;

public class ClassBase implements InterfaceDecorator{
	
	private int premium;

	public ClassBase(int premium) {
		this.premium = premium;
	}

	@Override
	public String getString() {
		return "Java Core";
	}

	@Override
	public int getInt() {
		return premium +  300;
	}

}
