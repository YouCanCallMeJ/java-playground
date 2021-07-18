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

			// Input Day of the week
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)");
			String dayString = scanner.nextLine();
			int offset = 0;
			switch (dayString) {
				case "SU":
					offset = 0;
					break;
				case "MO":
					offset = 1;
					break;
				case "Tu":
					offset = 2;
					break;
				case "WE":
					offset = 3;
					break;
				case "TH":
					offset = 4;
					break;
				case "FR":
					offset = 5;
					break;
				case "SA":
					offset = 6;
					break;
				default:
					break;
			}
			
			// Print Calendar Head
			DIM dim = new DIM(ints[0], ints[1]);
			System.out.println(ints[1] + "년 " + ints[0] + "월은 " + dim.getD() + "입니다.");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("--------------------------------------------------");
			
			// Assign days to array 
			int[] days = new int[dim.getD() + offset];
			for (int i = 0; i < days.length; i++) {
				if(i < offset) {
					days[i] = 0;
				} else {
					days[i] = (i + 1 - offset);
				}
			}

			for (int i = 0; i < days.length; i++) {
				if (i != 0 && i % 7 == 0) {
					System.out.println();
				}
				if(days[i] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(days[i] + "\t");
				}			
			}
			
			System.out.println();
		}

	}

}
