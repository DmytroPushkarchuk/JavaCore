package decorator.app2;

public class Second extends AbsUnit{

	public Second(InterFace inter) {
		super(inter);
		
	}

	@Override
	public String print() {
		
		return super.print() + " Second";
	}

}
