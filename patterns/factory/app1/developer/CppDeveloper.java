package factory.app1.developer;

public class CppDeveloper implements InterfaceDeveloper {
	
	public CppDeveloper() {
		System.out.println("Create C++ Developer");
		
	}


	@Override
	public void codeDeveloper() {
		System.out.println("Writen code C++...");
	}

}
