package app14;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Integer[] arr1 = new Integer[10];
		int[] arr2 = new int[10];

		for (Integer i : arr1) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}

		System.out.println(Arrays.toString(arr1));

		System.out.println(Arrays.toString(arr2));

	}

}
