package calendar;

import java.util.Scanner;

public class Calendar {
	
	private int[] days;
	
	public int[] getDays() {
		return days;
	}

	public void saveSchedule(String yearString, String monthString, String dayString, String startDayString) {

		// Calculate Days in a month
		DIM dim = new DIM(Integer.parseInt(monthString), Integer.parseInt(yearString));

		// Print Calendar Head
		System.out.println(yearString + "년 " + monthString + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		
		// Calculate Offset
		int offset = calculateOffset(startDayString);
		
		// Assign days to array
		int[] days = new int[dim.getD() + offset];
		for (int i = 0; i < days.length; i++) {
			if(i < offset) {
				days[i] = 0;
			} else {
				days[i] = (i + 1 - offset);
			}
		}
		
		System.out.println();
	}
	
	// Calculate Offset
	public int calculateOffset(String startDayString) {
		// Input Day of the week
		switch (startDayString) {
			case "SU":
				return 0;
			case "MO":
				return 1;
			case "Tu":
				return 2;
			case "WE":
				return 3;
			case "TH":
				return 4;
			case "FR":
				return 5;
			case "SA":
				return 6;
			default:
				return 0;
		}
	}
	
	public void printCalender() {
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
	}
}
