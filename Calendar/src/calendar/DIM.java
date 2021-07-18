package calendar;

public class DIM {
	private int d;	
	
	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	DIM(int m, int y) {
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			d = 31;
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			d = 30;
		} else {
			if (m == 2) {
				if (y % 400 == 0 && y % 100 == 0) {
					d = 29;
				} else {
					if (y % 4 == 0 && y % 100 != 0) {
						d = 29;
					} else {
						d = 28;
					}
				}
			}
		}
	}
}
