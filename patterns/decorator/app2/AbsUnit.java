package decorator.app2;

public abstract class AbsUnit implements InterFace {
	
	private InterFace inter;

	public AbsUnit(InterFace inter) {
		this.inter = inter;
	}

	public String print() {
		
		return inter.print();
	}

}
