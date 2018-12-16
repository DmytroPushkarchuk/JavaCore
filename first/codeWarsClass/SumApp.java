package codeWarsClass;

public class SumApp {

	public static void main(String[] args) {
		
		Sum sum = new Sum();
		System.out.println(sum.GetSum(3, 2));
		
	}
}


class Sum{
   public int GetSum(int a, int b){
	   if (a>b) {
		   int i=a;
		   a=b;
		   b=i;
	   }
	   if (a==b) return a;
	   return a+GetSum(++a,b);
	   
	   
//	   return (a + b) * (Math.abs(a - b) + 1) / 2;
   }
}