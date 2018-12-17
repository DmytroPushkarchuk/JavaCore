package other;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class randomApp {

	public static void main(String[] args) {
		
		int[] arr = RandArr(2, 3);
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static int[] RandArr (int n, int r) {
		
		Set<Integer>set = new LinkedHashSet<>();
		Random random = new Random();
		
			while (set.size() < n ) {
				set.add(random.nextInt(r));
			}
		
		return set.stream().mapToInt(Integer::intValue).toArray();
		
	}	
	
}