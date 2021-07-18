package gugudan;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// 사용자 단 입력
		
		boolean iterate = true;
		
		// version 2: 배열 활용
		while (iterate) {
			System.out.print("출력을 원하는 단을 입력해주세요:");
			Scanner scanner = new Scanner(System.in);
			int dan = scanner.nextInt();
			int[] results = new int[9];
			
			for (int i = 0; i < 9; i++) {
				results[i] = dan * (i + 1);
			}
			
			for (int i = 0; i < 9; i++) {
				System.out.println(dan + " * " + (i + 1) + " = " + results[i]);
			}
			
			System.out.println("======================");
		}
	}

}
