package app35;

class SmallBrain {

}

final class Dinosaur extends SmallBrain {
	int i = 1;
	int j;
	SmallBrain x = new SmallBrain();

	void f() {

	};
}

//class Futher extends Dinosaur{
//	
//}

public class Main {

	static void print(int i) {
		System.out.println(i);

	}

	public static void main(String[] args) {

		Dinosaur n = new Dinosaur();
		n.f();
		print (n.i);
		print (n.j);
		
		n.i = 10;
		n.j = 20;
		
		print(n.i);
		print(n.j);

	}

}
