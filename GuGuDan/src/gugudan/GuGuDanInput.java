package gugudan;

import java.util.Scanner;

public class GuGuDanInput {
	int dan;
	
	public int getDan() {
		return dan;
	}

	int input() {
		System.out.print("출력을 원하는 단을 입력해주세요:");
		Scanner scanner = new Scanner(System.in);
		
		dan= scanner.nextInt();
		
		return dan;
	}
}
