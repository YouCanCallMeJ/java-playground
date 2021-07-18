package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.print("달과 연을 입력하세요: ");

		Scanner scanner = new Scanner(System.in);
		String[] numbersStrings = scanner.nextLine().split(" ");
		
		int[] ints = new int[numbersStrings.length];

		for (int i = 0; i < ints.length; i++) {
			ints[i] = Integer.parseInt(numbersStrings[i]);
		}
		
		DIM dim = new DIM(ints[1], ints[0]);
		
		System.out.println(ints[0] + "년 " + ints[1] + "월은 " + dim.getD() + "입니다.");
	}

}
