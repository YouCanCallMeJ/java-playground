package gugudan;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// 사용자 단 입력
		
		boolean iterate = true;
		
		// version 3: 메소드 활용
		while (iterate) {
			System.out.print("출력을 원하는 단을 입력해주세요:");
			Scanner scanner = new Scanner(System.in);
			int dan = scanner.nextInt();
			int[] results = calculate(dan);

			print(dan, results);
			
			System.out.println("======================");
		}
	}
	
	public static int[] calculate(int dan) {
		
		int[] results = new int[9];
		
		for (int i = 0; i < 9; i++) {
			results[i] = dan * (i + 1);
		}
		
		return results;
	}

	public static void print(int dan, int[] results) {
		for (int i = 0; i < 9; i++) {
			System.out.println(dan + " * " + (i + 1) + " = " + results[i]);
		}
	}
}
