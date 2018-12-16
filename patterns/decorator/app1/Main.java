package decorator.app1;

public class Main {

	public static void main(String[] args) {
		
		InterfaceDecorator StudyJava = new Decorator2(new Decorator1(new ClassBase(250)));
		
		System.out.println(StudyJava.getString());
		
		System.out.println(StudyJava.getInt());
		
	}

}
