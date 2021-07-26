package scehduler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		
		File file = new File("Schedule.txt");
		if (file.exists()) {
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Schedule.txt"))){
				calendar = (Calendar) in.readObject();
				System.out.println("저장된 파일이 로드되었습니다.");	
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("새로운 파일이 생성되었습니다..");
		}		
		
		Boolean iterater = true;
		
		while (iterater) {			
			// 명렁어 입력
			System.out.println("명령 (1, 2, 3, h, q)");
			String command = scanner.nextLine();
			
			switch (command) {
				// Registration a schedule
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
					try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Schedule.txt"))){
						out.writeObject(calendar);
						System.out.println("일정이 저장되었습니다.");
					} catch (Exception e) {
						System.out.println(e);
					}
					calendar.printCalender();
					break;
				}
				
				// Search Schedule on a specific day
				case "2": {
					Boolean isEmpty = true;
					String[][] days = calendar.getDays();					
					for(int i = 0; i < days[1].length; i++) {
						if (days[1][i] != null) {
							isEmpty = false;
						}
					}
					
					if(isEmpty) {
						System.out.println("일정이 비었습니다..");
						break;
					}
					
					System.out.println("[일정 검색] 날짜를 입력하세요(e.g.2021-07-19).");
					String dateString = scanner.nextLine();
					String dayString = dateString.substring(8, 10);

					System.out.println(dateString + " 일정\n" + calendar.showSchedule(dayString));
					break;
				}
				
				// Print Calendar
				case "3": {
					calendar.printCalender();
					break;
				}
				case "h": {
					
					break;
				}
				case "q": {
					iterater = false;
					break;
				}
				default:
					break;
			}
		}
		System.out.print("End of Program");
	}

}
