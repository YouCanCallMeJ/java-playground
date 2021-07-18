package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반복횟수를 입력하세요: ");
		int times = Integer.parseInt(scanner.nextLine());
		
		int[][] months = new int[times][2];
		for (int i = 0; i < times; i++) {
			System.out.println("달과 연을 입력하세요: ");
			String[] numbersStrings = scanner.nextLine().split(" ");
			
			int[] ints = new int[numbersStrings.length];

			for (int i1 = 0; i1 < ints.length; i1++) {
				ints[i1] = Integer.parseInt(numbersStrings[i1]);
			}
			
			months[i][0] = ints[0];
			months[i][1] = ints[1];
		}
		
		DIM[] dims = new DIM[times];
		for (int i = 0; i < dims.length; i++) {
			dims[i] = new DIM(months[i][0], months[i][1]);
		}
		
		for (int i = 0; i < dims.length; i++) {
			System.out.println(months[i][1] + "년 " + months[i][0] + "월은 " + dims[i].getD() + "입니다.");
		}
		
		
	}

}
