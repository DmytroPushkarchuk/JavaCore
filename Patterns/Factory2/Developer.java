package Factory2;

public interface Developer {

	void writeCode();
}


class JavaDeveloper implements Developer {

	public void writeCode() {
		System.out.println("Java developer writes java code...");
	}
	
	public void helpJava() {
		System.out.println("Help from Java...");
	}
	
}

class CppDeveloper implements Developer {

	public void writeCode() {
		System.out.println("Cpp developer writes Cpp code...");
	}

}

class PythonDeveloper implements Developer {

	public void writeCode() {
		System.out.println("Python developoer writes code Python...");
	}

}