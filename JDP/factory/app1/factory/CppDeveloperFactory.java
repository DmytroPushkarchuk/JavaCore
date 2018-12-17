package factory.app1.factory;

import factory.app1.developer.CppDeveloper;
import factory.app1.developer.InterfaceDeveloper;

public class CppDeveloperFactory implements InterfaceDeveloperFactory{

	@Override
	public InterfaceDeveloper createDeveloper() {
		return new CppDeveloper();
	}

}
