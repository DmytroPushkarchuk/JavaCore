package app5;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main extends ArrayList<Integer> {

	public static void main(String[] args) {

		Main arrlist = new Main();

		arrlist.add(10);
		arrlist.add(15);
		arrlist.add(12);
		arrlist.add(31);

		System.out.println(arrlist);

		// removing range of 1st 2 elements
		arrlist.removeRange(0, 2);
		System.out.println(arrlist);
	}
}
