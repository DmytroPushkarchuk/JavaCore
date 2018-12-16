package decorator.app2;

public class Third extends AbsUnit{

	public Third(InterFace inter) {
		super(inter);
	}

	@Override
	public String print() {
		
		return super.print() + " Third";
	}
	
	

}
