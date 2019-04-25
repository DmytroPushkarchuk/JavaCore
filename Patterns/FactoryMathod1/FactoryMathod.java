package FactoryMathod1;

public class FactoryMathod {

	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();
		
		// Получаем объект класса SavingAccount и вызываем
		// его метод accountType()
		Account savingAccount = accountFactory.getAccount("SAVING");
		savingAccount.accountType();
		
		// Получаем объект класса CurrentAccount и вызываем
		// его метод accountType()
		Account currentAccount = accountFactory.getAccount("CURRENT");
		currentAccount.accountType();
		
		
		
//		SavingAccount savingAccount = (SavingAccount) accountFactory.getAccount("SAVING");
//		savingAccount.informationSavingAccount();
//		
//		CurrentAccount currentAccount = (CurrentAccount) accountFactory.getAccount("CURRENT");
//		currentAccount.informationCurrentAccount();
		
	}
}
