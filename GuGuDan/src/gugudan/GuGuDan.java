package gugudan;

import java.util.ArrayList;

public class GuGuDan {
	ArrayList<Integer> result;
	
	public ArrayList<Integer> getResult() {
		return result;
	}

	ArrayList<Integer> calculate(int dan) { 
		for (int i = 1; i < 10; i++) {
			result.add(dan * i);
		}
		return result;
	}
}
