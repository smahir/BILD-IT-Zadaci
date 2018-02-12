package zadaci_12_02_2018;

import java.util.ArrayList;

public class MaxVrijednost {
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(229);
		list.add(2);
		list.add(23232);
		
		
		System.out.println(max(list));
		
		
		
	}
	
	public static Integer max(ArrayList<Integer> list) {
		int maxValue = 0;
		if (list.isEmpty()) {
			return null;
		} else {
			for (int e : list) {
				if (e > maxValue) {
					maxValue = e;
				}
			}
		}
		return maxValue;
		
	}
	
	
	
}
