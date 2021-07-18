package gugudan;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// 사용자 단 입력
		
		boolean iterate = true;
		
		// version 4: 클래스 OOP 활용
		while (iterate) {
			System.out.print("출력을 원하는 단을 입력해주세요:");
			Scanner scanner = new Scanner(System.in);
			int dan = scanner.nextInt();
			
			Calculation cal = new Calculation(dan);
			cal.print();
			
			System.out.println("======================");
		}
	}
}
