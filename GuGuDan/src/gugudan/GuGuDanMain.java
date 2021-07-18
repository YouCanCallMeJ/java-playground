package gugudan;

public class GuGuDanMain {

	public static void main(String[] args) {
		// 사용자 단 입력
		
		boolean iterate = true;
		
		// version 4: 클래스 OOP 활용
		while (iterate) {
			
			GuGuDanInput input = new GuGuDanInput(); 
			input.input();
			
			GuGuDan guGuDan = new GuGuDan();
			guGuDan.calculate(input.getDan());
			
			GuGuDanOutput guGuDanOutput = new GuGuDanOutput();
			guGuDanOutput.print(guGuDan.getResult());
			
			System.out.println("======================");
		}
	}
}
