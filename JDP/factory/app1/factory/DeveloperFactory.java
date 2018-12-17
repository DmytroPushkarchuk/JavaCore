package factory.app1.factory;

public abstract class DeveloperFactory implements InterfaceDeveloperFactory{
	
	public static InterfaceDeveloperFactory createDeveloperFactoryBySpecialty(String specialty) {

		if (specialty.equalsIgnoreCase("JAVA")) return new JavaDeveloperFactory();
		if (specialty.equalsIgnoreCase("C++")) return new CppDeveloperFactory();
		if (specialty.equalsIgnoreCase("PHP")) return new PhpDeveloperFactory();
		

		return null;

	}
		
	
	
	

}
