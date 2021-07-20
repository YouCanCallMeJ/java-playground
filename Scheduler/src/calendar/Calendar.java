package calendar;

public class Calendar {
	
	private String yearString;
	private String monthString;
	private String dayString;
	private String startDayString;
	private DIM dim;
	private String[][] days;
	private int offset;
	
	public String[][] getDays() {
		return days;
	}

	public void setDays(String[][] days) {
		this.days = days;
	}

	public DIM getDim() {
		return dim;
	}

	public void setDim(DIM dim) {
		this.dim = dim;
	}

	public String getYearString() {
		return yearString;
	}

	public void setYearString(String yearString) {
		this.yearString = yearString;
	}

	public String getMonthString() {
		return monthString;
	}

	public void setMonthString(String monthString) {
		this.monthString = monthString;
	}

	public String getStartDayString() {
		return startDayString;
	}

	public String getDayString() {
		return dayString;
	}

	public void setDayString(String dayString) {
		this.dayString = dayString;
	}
	
	public void setStartDayString(String startDayString) {
		this.startDayString = startDayString;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public Calendar(String yearString, String monthString, String dayString, String startDayString) {
		this.yearString = yearString;
		this.monthString = monthString;
		this.dayString = dayString;
		this.startDayString = startDayString;
		this.offset = calculateOffset(startDayString);

		// Calculate Days in a month
		this.dim = new DIM(Integer.parseInt(monthString), Integer.parseInt(yearString));
		
		// Assign days to array
		this.days = new String[2][dim.getD() + offset];
		for (int i = 0; i < dim.getD() + offset; i++) {
			if(i < offset) {
				days[0][i] = "0";
			} else {
				days[0][i] = Integer.toString((i + 1 - offset));
			}
		}
	}
	
	
	public void saveSchedule(String toDoString) {
		int day = Integer.parseInt(dayString);
		days[1][day - 1 + offset] = toDoString;
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
		// Print Calendar Head
		System.out.println(this.yearString + "년 " + this.monthString + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		
		for (int i = 0; i < days[0].length; i++) {
			if (i != 0 && i % 7 == 0) {
				System.out.println();
				for (int j = i - 7; j <= i; j++) {
					if (days[1][j] != null) {
						System.out.print(".\t");
					} else {
						System.out.print(" \t");
					}
				}
				System.out.println();
			}
			if(days[0][i] == "0") {
				System.out.print(" \t");
			} else {
				System.out.print(days[0][i] + "\t");
			}
			
			if (i == days[0].length - 1) {
				System.out.println();
				for (int j = i - 7; j <= i; j++) {
					if (days[1][j] != null) {
						System.out.print(".\t");
					} else {
						System.out.print(" \t");
					}
				}
				System.out.println();
			}
		}
		
		System.out.println();
	}
}
