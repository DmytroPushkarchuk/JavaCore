package lamdas;

public class lamdasApp1 {

	public static void main(String[] args) {
		
		Print prn = (s,i,x) -> System.out.println(s + i*x);
		Print prn1 = (s,i,x) -> System.out.println(s + i/x);
		
		prn.print("Добуток ",6,7);
		prn1.print("Частка ", 9, 3);
	
		

	}
	
}

interface Print {
	
	void print (String s, int i, int x);
	
}








