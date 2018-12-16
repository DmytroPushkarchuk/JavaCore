package other;

import java.util.stream.IntStream;

public class intStreamArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		
		 IntStream stream = IntStream.of(-7, -9, -11); 
		 IntStream stream2 = IntStream.of(arr);
		  
	        // Displaying the sequential ordered stream 
	        stream.forEach(System.out::println); 
	        stream2.forEach(System.out::print); 

	}

}

class Kata{
	  public static double find_average(int[] array){
	  
		return IntStream.of(array).average().getAsDouble();
	    
	  }


}
class Kata1 {

	  public int min(int[] list) {
	    return IntStream.of(list).min().getAsInt();
	  }
	  
	  public int max(int[] list) {
	    return IntStream.of(list).max().getAsInt();
	  }
	}