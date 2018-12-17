package codeWarsClass;

public class DivisibleNbApp {

	public static void main(String[] args) {
		DivisibleNb div = new DivisibleNb();
		System.out.println(div.isDivisible(4, 1, 1));
	}
}

class DivisibleNb {
	public boolean isDivisible(long n, long x, long y) {
		return n%x==0 && n%y==0;
	}
}
