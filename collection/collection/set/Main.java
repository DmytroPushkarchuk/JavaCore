package collection.set;

import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("all")
public class Main {

	public static void main(String[] args) {

		String[] data = { "A", "C", "B", "D", "A", "B", "E", "D", "B", "C" };
		System.out.println("Original array         : " + Arrays.toString(data));

		List<String> list = Arrays.asList(data);
		Set<String> set = new HashSet<String>(list);

		System.out.print("Remove duplicate result: ");

		String[] result = new String[set.size()];
		set.toArray(new String[set.size()]);

		String[] arr = set.toArray(new String[set.size()]);

		for (String s3 : arr) {
			System.out.print(s3 + ", ");
		}
		System.out.println();
		
		
		TreeSet set1 = new TreeSet(Arrays.asList(data)); 
		LinkedHashSet set2 = new LinkedHashSet(Arrays.asList(data)); 
		
		Iterator iterator = set1.iterator();
		
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	
		System.out.println(set2);
		
		Set set3 = EnumSet.of(Days.ясанрю, Days.мед╡къ); 
		
		System.out.println(set3);
		
		set3 = EnumSet.range(Days.онмед╡кнй, Days.вербеп);
		
		System.out.println(set3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
