package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int[][] months = new int[1][2];

			System.out.println("달과 연을 입력하세요. 종료하시려면 -1을 입력하세요: ");
			String[] numbersStrings = scanner.nextLine().split(" ");

			if (Integer.parseInt(numbersStrings[0]) == -1) {
				break;
			}
			
			int[] ints = new int[numbersStrings.length];

			for (int i = 0; i < ints.length; i++) {
				ints[i] = Integer.parseInt(numbersStrings[i]);
			}

			DIM dim = new DIM(ints[0], ints[1]);

			System.out.println(ints[1] + "년 " + ints[0] + "월은 " + dim.getD() + "입니다.");
		}

	}

}
