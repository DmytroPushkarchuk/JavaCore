package Factory2;

public interface DeveloperFactory {

	Developer createDeveloper();

}


class JavaDeveloperFactory implements DeveloperFactory {

	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

}

class CppDeveloperFactory implements DeveloperFactory {

	public Developer createDeveloper() {
		return new CppDeveloper();
	}

}

class PythonDeveloperFactory implements DeveloperFactory {

	public Developer createDeveloper() {
		return new PythonDeveloper();
	}

}