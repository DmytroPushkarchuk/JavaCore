package other;

import java.util.Arrays;
import java.util.List;

public class arrayClass {

	public static void main(String[] args) {
		
		int[] array1 = {6,5,4,3,2,1};
		int[] array2 = {6,5,4,3,2,1};
		int[] array3 = {7,6,5,4,3,2,1};
		int[] array4;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.equals(array1, array2));
		Arrays.sort(array1);
		Arrays.sort(array2, 1, 3);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		Arrays.fill(array1, 1);
		System.out.println(Arrays.toString(array1));
		Arrays.fill(array1, 2, 5, 4);
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array2);
		System.out.println(Arrays.binarySearch(array2, 6));
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		array1 = Arrays.copyOf(array3, array1.length);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array3));
		array1 = Arrays.copyOfRange(array3, 2, array1.length+3);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array3));
		Integer ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2}; 
        List<Integer> l1 = Arrays.asList(ar); 
        System.out.println(l1); 
        System.out.println(Arrays.asList(ar));
        array1 = array2;
        System.out.println(System.identityHashCode(ar));
        System.out.println(System.identityHashCode(array1));
        System.out.println(Arrays.hashCode(array1));
        System.out.println(Arrays.hashCode(array2));
        array4=null;
        System.out.println(Arrays.hashCode(array4));
        array4 = new int[] {1,1,2,4};
        System.out.println(Arrays.toString(array4));
        array4= Arrays.copyOf(array3, 5);
        System.out.println(Arrays.toString(array4));
	}
}
