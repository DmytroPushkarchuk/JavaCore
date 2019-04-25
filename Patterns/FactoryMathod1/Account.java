package FactoryMathod1;

public interface Account {

	void accountType();

}

class SavingAccount implements Account {
	@Override
	public void accountType() {
		System.out.println("SAVING ACCOUNT");
	}
	
	public void informationSavingAccount() {
		System.out.println("Information saving account...");
	}
}

class CurrentAccount implements Account {
	@Override
	public void accountType() {
		System.out.println("CURRENT ACCOUNT");
	}
	
	public void informationCurrentAccount() {
		System.out.println("Information current account...");
	}
}
