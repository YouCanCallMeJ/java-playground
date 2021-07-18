package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		System.out.print("두수를 입력하세요: ");
		
		Scanner scanner = new Scanner(System.in);
		String[] numbersStrings = scanner.nextLine().split(" ");
		
		int[] ints = new int[numbersStrings.length];
		
		for (int i = 0; i < ints.length; i++) {
			ints[i] = Integer.parseInt(numbersStrings[i]); 
		}
		
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i]; 
		}
		
		System.out.println("두수의 합은 " + sum + "입니다.");
	}

}
