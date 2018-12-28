package app07;

@SuppressWarnings ("all")
public class Class1 {
	
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Class1(int i) {
		super();
		this.i = i;
	}

	public boolean equals(Class1 obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		System.out.println(this.i);
		System.out.println(obj.i);
		return this.i==obj.i;
	}
	

}
