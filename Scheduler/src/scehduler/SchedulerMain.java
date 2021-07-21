package scehduler;

import java.util.Scanner;

import calendar.Calendar;

public class SchedulerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("+----------------------+\r\n"
				+ "| 1. 일정 등록\r\n"
				+ "| 2. 일정 검색\r\n"
				+ "| 3. 달력 보기\r\n"
				+ "| h. 도움말 q. 종료\r\n"
				+ "+----------------------+");
		
		Calendar calendar = null;
		
		while (true) {			
			// 명렁어 입력
			System.out.println("명령 (1, 2, 3, h, q)");
			String command = scanner.nextLine();
			
			switch (command) {
				case "1": {
					System.out.println("[일정 등록] 날짜를 입력하세요(e.g.2021-07-19).");
					String dateString = scanner.nextLine();
					String yearString = dateString.substring(0, 4);
					String monthString = dateString.substring(5, 7);
					String dayString = dateString.substring(8, 10);
					
					if(calendar == null) {
						// Input start day					
						System.out.println("첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)");
						String startDayString = scanner.nextLine();

						calendar = new Calendar(yearString, monthString, dayString, startDayString);
					}
					
					// 
					System.out.println("일정을 입력하세요.");
					calendar.saveSchedule(dayString, scanner.nextLine());
					System.out.println("일정이 등록되었습니다.");
					calendar.printCalender();
					break;
				}
				case "3": {
					calendar.printCalender();
					break;
				}
				default:
					break;
			}
		}		
	}

}
