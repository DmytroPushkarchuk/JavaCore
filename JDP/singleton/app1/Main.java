package singleton.app1;

public class Main {

	public static void main(String[] args) {
		
		Singleton1 firsteSingleton = Singleton1.getInstance();
		Singleton1 secondSingleton = Singleton1.getInstance();
		
		System.out.println(firsteSingleton.hashCode());
		System.out.println(secondSingleton.hashCode());
		
	}

}

