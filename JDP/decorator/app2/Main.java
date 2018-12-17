package decorator.app2;

public class Main {

	public static void main(String[] args) {
		
//		InterFace first = new First();

//		InterFace second = new Second(new First());
		
		InterFace q = new Third(new Second(new First()));
		System.out.println(q.print());
		

	}

}
