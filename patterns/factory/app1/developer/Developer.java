package factory.app1.developer;

public abstract class Developer {
	
	public static InterfaceDeveloper createDeveloperBySpecialty(String specialty) {

		if (specialty.equalsIgnoreCase("JAVA")) return new JavaDeveloper();
		if (specialty.equalsIgnoreCase("C++")) return new CppDeveloper();
		if (specialty.equalsIgnoreCase("PHP")) return new PhpDeveloper();
		
		
		return null;
		
	}

}
