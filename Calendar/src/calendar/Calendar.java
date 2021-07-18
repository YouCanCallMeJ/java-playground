package calendar;

import java.util.ArrayList;
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

			// Print Calendar Head
			DIM dim = new DIM(ints[0], ints[1]);
			System.out.println(ints[1] + "년 " + ints[0] + "월은 " + dim.getD() + "입니다.");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("--------------------------------------------------");
			
			// Assign days to array 
			int[] days = new int[dim.getD()];
			for (int i = 0; i < days.length; i++) {
				days[i] = (i + 1);
			}

			for (int i = 0; i < days.length; i++) {
				if (i != 0 && i % 7 == 0) {
					System.out.println();
				}
				System.out.print(days[i] + "\t");
				
			}
			
			System.out.println();
		}

	}

}
