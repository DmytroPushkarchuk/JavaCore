package codeWarsClass;

@SuppressWarnings ("all")

public class MoneyApp {

	public static void main(String[] args) {
		
		Money money = new Money();
		System.out.println(Money.calculateYears(1000,0.05,0.18,1100));

	}
 
}

class Money {
	public static int calculateYears(double principal, double interest,  double tax, double desired) {
		if (principal>=desired)
			return 0;
		return 1 + calculateYears(principal*interest*(1-tax),0.05,0.18,1100);
		
		
	}
}



//	int y=0;
//	while (principal<desired){
//		principal +=principal*interest*(1-tax);
//		y++;
//	}
//	return y;
//}
