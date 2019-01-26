package app21;

public class Main {
	private String s = "Clearser";
	
	public void appEnd(String a) {
		s += a;
	}
	
	public void dilute() {
		appEnd(" dilute()");
	}

	public void apply() {
		appEnd(" apply()");
	}
	
	public void scrub() {
		appEnd(" scrub()");
	}
	
	
	
	
	@Override
	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Main x = new Main();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
		
	}

}
