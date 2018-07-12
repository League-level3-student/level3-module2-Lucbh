package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	
	
	public static int findBrokenEgg(List<String> eggs) {
	
		
	for (int i = 0; i < eggs.size(); i++) {
		
	
		
		if (eggs.get(i).equals("cracked")) {
			
			System.out.println(i);
			
			return i;
		
				
			
		}
		
	
		
	
	
		}
	
	return -1;
	

		
		
		
}
	
	
	public static int countPearls(List<Boolean> oysters)	 {
		
		int nums = 0;
		
		for (int i = 0; i < oysters.size(); i++) {
			
			if (oysters.get(i).equals(true)) {
				nums++;
			}
		}
	return nums;
}
	
	public static int findTallest(List<Double> peeps) {
		
		int fire = 0;
		
		for (int i = 0; i < peeps.size();i++) {
			for (int p = 0; p < peeps.size();p++) {
				
			if (peeps.get(p) < peeps.get(p + 1)) {
				
				return p;
				
			}
			
			}
		}
		return fire;
	}
	
}
