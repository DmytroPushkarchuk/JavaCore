package FactoryMathod1;

public class AccountFactory {
	final String CURRENT_ACCOUNT = "CURRENT";
	final String SAVING_ACCOUNT = "SAVING";

	// Используем метод getAccount для получения объекта типа Account
	// Фабричный метод для объектов типа Account

	public Account getAccount(String accountType) {
		switch (accountType) {
		case CURRENT_ACCOUNT:
			return new CurrentAccount();
		case SAVING_ACCOUNT:
			return new SavingAccount();
		default:
			return null;
		}

	}

}
