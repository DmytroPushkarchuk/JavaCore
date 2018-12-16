package factory.app1.developer;

public class PhpDeveloper implements InterfaceDeveloper{
	
	public PhpDeveloper() {
		
		System.out.println("Create PHP Developer ");
	}
	
	

	@Override
	public void codeDeveloper() {
		System.out.println("Writen code PHP...");
	}

}
