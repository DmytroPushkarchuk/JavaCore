package app18;

public class Main {

	public static void main(String[] args) {

		MyEnum myEnum = MyEnum.HOT;
		System.out.println(myEnum + " " + myEnum.ordinal());
		System.out.println();

		for (MyEnum obj : MyEnum.values())
			System.out.println(obj + " ordinal " + obj.ordinal());
		System.out.println();

		Burrito plain = new Burrito(MyEnum.NOT), greenChile = new Burrito(MyEnum.MEDIUM),
				jalapeno = new Burrito(MyEnum.HOT);

		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}

}

class Burrito {
	MyEnum degree;

	public Burrito(MyEnum degree) {
		this.degree = degree;
	}

	public void describe() {

		System.out.print("This burrito is ");

		switch (degree) {
		case NOT:
			System.out.println("not spicy at all.");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot.");
		}
	}

}

enum MyEnum {

	NOT, MILD, MEDIUM, HOT, FLAMING

}
