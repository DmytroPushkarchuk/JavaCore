package factory.app1.factory;

import factory.app1.developer.InterfaceDeveloper;
import factory.app1.developer.PhpDeveloper;

public class PhpDeveloperFactory implements InterfaceDeveloperFactory{

	@Override
	public InterfaceDeveloper createDeveloper() {
		return  new PhpDeveloper();
	}

}
