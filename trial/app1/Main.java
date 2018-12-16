package app1;

public class Main {
	
	public static void main(String[] args) {
		
		Group[] university = new Group[] {new Group1(), new Group2(), new Group3()};  
		
		for (Group iter : university) {
			iter.getGroup() ;
		}
		
	}

}
