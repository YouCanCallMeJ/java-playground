package gugudan;

public class Calculation {
	int dan;
	int[] results = new int[9];
	
	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int[] getResults() {
		return results;
	}

	public void setResults(int[] results) {
		this.results = results;
	}

//	public void calculate(int dan) {
//		for (int i = 0; i < 9; i++) {
//			results[i] = dan * (i + 1);
//		}
//	}
	
	public Calculation(int dan) {
		this.dan = dan;
		
		for (int i = 0; i < 9; i++) {
			results[i] = dan * (i + 1);
		}
	}
	
	public void print() {
		for (int i = 0; i < 9; i++) {
			System.out.println(dan + " * " + (i + 1) + " = " + results[i]);
		}
	}
}
