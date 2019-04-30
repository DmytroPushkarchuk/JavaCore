package Builder3;

public class Main {

	public static void main(String[] args) {
		Account account = new Account.AccountBuilder("Saving Account", "Dinesh Rajput", 1111l)
		.balance(38458.32)
		.interest(4.5)
		.type("SAVING")
		.build();
		
		System.out.println(account);

		}
}

class Account {
	private String accountName;
	private Long accountNumber;
	private String accountHolder;
	private double balance;
	private String type;
	private double interest;



	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountNumber=" + accountNumber + ", accountHolder="
				+ accountHolder + ", balance=" + balance + ", type=" + type + ", interest=" + interest + "]";
	}

	private Account(AccountBuilder accountBuilder) {
		this.accountName = accountBuilder.accountName;
		this.accountNumber = accountBuilder.accountNumber;
		this.accountHolder = accountBuilder.accountHolder;
		this.balance = accountBuilder.balance;
		this.type = accountBuilder.type;
		this.interest = accountBuilder.interest;
	}

// Сеттеры и геттеры
	
	public static class AccountBuilder {
		private final String accountName;
		private final Long accountNumber;
		private final String accountHolder;
		private double balance;
		private double interest;
		private String type;

		public AccountBuilder(String accountName, String accountHolder, Long accountNumber) {
			this.accountName = accountName;
			this.accountHolder = accountHolder;
			this.accountNumber = accountNumber;
		}

		public AccountBuilder balance(double balance) {
			this.balance = balance;
			return this;
		}

		public AccountBuilder type(String type) {
			this.type = type;
			return this;
		}

		public AccountBuilder interest(double interest) {
			this.interest = interest;
			return this;
		}

		public Account build() {
			Account user = new Account(this);
			return user;
		}
	}
}
