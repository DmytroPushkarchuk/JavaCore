package codeWarsClass;

public class MathApp {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
//		Math1 math1 = new Math1(-5);
//		Koma koma = new Koma();
//		System.out.println(koma.sumTriangularNumbers(3));
		
		
		
	}
}

class MostDigits {
	  public static int findLongest(int[] numbers) {
		  int tmp = numbers.length;
		  for (int i =0; i<numbers.length;++i) {
			  tmp = numbers[i];
			  for (int j = i+1; j < numbers.length;++j) {
				  if (numbers[i]==numbers[j])
					  return numbers[i];
			  }
		  }
		  
		  
		return tmp;
	  }
	}





class Math1 {

	public Math1(int i) {
		System.out.println(-Math.abs(i));
	}

}


class Koma {
	
  public static int sumTriangularNumbers(int n)
  {
    int sum=0;
    for (int i = 1;  i <= n; i++){
    sum += i*(i+1)/2;
    
    }
    
    return sum;
  }
}

