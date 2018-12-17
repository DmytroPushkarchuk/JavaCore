package factory.app1.developer;

public class JavaDeveloper implements InterfaceDeveloper {
	
	public JavaDeveloper() {
		System.out.println("Create Java Developer");
		
	}

	@Override
	public void codeDeveloper() {
		System.out.println("Writen code Java...");
	}

}
