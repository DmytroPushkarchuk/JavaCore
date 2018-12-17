package factory.app1.factory;

import factory.app1.developer.InterfaceDeveloper;
import factory.app1.developer.JavaDeveloper;

public class JavaDeveloperFactory implements InterfaceDeveloperFactory{

	@Override
	public InterfaceDeveloper createDeveloper() {
		return new JavaDeveloper();
	}

}
