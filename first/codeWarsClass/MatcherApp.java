package codeWarsClass;

public class MatcherApp {

	public static void main(String[] args) {
		System.out.println(PinCode("12355"));
	}
	
	static boolean PinCode(String pin) {
		return ((pin.matches("[0-9]+"))&&(pin.length() == 4 || pin.length() == 6));
//		return (pin.matches("\\d{4}|\\d{6}"));
		
	}
		
}


//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
//http://qaru.site/questions/63495/how-to-check-if-a-string-contains-only-digits-in-java

