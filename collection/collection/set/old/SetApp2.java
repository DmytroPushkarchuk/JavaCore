package collection.set.old;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings ("all")

public class SetApp2 {

	public static void main(String[] args) {
		
		Set set1 = new HashSet();
		Set set2 = new TreeSet();
		Set set3 = new LinkedHashSet();
		
		Random random = new Random();
		int n = 15;
		int r = 13;
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(r)+1;
			set1.add(arr[i]);
			set2.add(arr[i]);
			set3.add(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length+" "+set1.size()+" "+set2.size()+" "+set3.size()+" ");
		
//		set1.add(null);
////		set2.add(null);
//		set3.add(null);
//		System.out.println(set1.size()+" "+set2.size()+" "+set3.size()+" ");
		
		Iterator iterator;
		
		iterator = set1.iterator();

		while(iterator.hasNext()) System.out.print(iterator.next()+" ");
		System.out.println();
		
		iterator = set2.iterator();
		while(iterator.hasNext()) System.out.print(iterator.next()+" ");
		System.out.println();
		
		iterator = set3.iterator();
		while(iterator.hasNext()) System.out.print(iterator.next()+" ");
		System.out.println();
		
	}

}
