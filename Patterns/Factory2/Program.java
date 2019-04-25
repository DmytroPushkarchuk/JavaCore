package Factory2;

public class Program {


	public static void main(String[] args) {
		
		


		Developer developer = createDeveloperFactoryBySpecialty("Java");

		developer.writeCode();
		
		
		
	}

	static Developer createDeveloperFactoryBySpecialty(String specialty) {

		switch (specialty) {
		case "Java":
			return new JavaDeveloper();
		case "Cpp":
			return new CppDeveloper();
		case "Python":
			return new PythonDeveloper();
		default:
			return null;

		}

	}

}

//public class Program {
//
//	public static void main(String[] args) {
//
//		DeveloperFactory developerFactory = createDeveloperFactoryBySpecialty("Python");
//
//		Developer developer = developerFactory.createDeveloper();
//
//		developer.writeCode();
//
//	}
//
//	static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty) {
//
//		switch (specialty) {
//		case "Java":
//			return new JavaDeveloperFactory();
//		case "Cpp":
//			return new CppDeveloperFactory();
//		case "Python":
//			return new PythonDeveloperFactory();
//		default:
//			return null;
//
//		}
//
//	}
//
//}
