package other;

import java.util.ArrayList;
import java.util.Scanner;

public class scannerApp {
	
	static Scanner reader = new Scanner(System.in);
	static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println("����� �������� ������ ����� �����, 0 ���������� �������� �������� ������!");
		int in = reader.nextInt();
		while (in != 0) {
			array.add(in);
			in = reader.nextInt();
		}
		System.out.println("-----------------------------------------------");
		
		printArray();
		
		System.out.println("���� ����� �� ������ ��������?");
		
		int del = reader.nextInt();
		
		for (int i = 0; i < array.size(); i++) {
			if(del==array.get(i)) {
				array.remove(i);
//				break;
				i--;
			}
		}
		
		System.out.println("-----------------------------------------------");
		printArray();
		
	}
		
	
	
	public static   void printArray() {
		for (int i : array) {
			System.out.println(i);
		}
	}

}