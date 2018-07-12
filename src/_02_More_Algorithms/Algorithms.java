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
	
	public static double findTallest(List<Double> peeps) {
		
		double fire = 0;
		
		
			for (int p = 0; p < peeps.size();p++) {
				
			if (fire < peeps.get(p)) {
				
				fire = peeps.get(p);
			
			}
			
			
		}
			
		return fire;
	}
	
	
	public static String findLongestWord(List<String> words) {
		String s = "";
		
		for (int i = 0; i < words.size()-1;i++) {
			
			if ( s.length() < words.get(i+1).length()) {
				
				s = words.get(i+1);
				
			}
			
			
		}
		
		return s; 
	}
	
	public static boolean containsSOS(List<String> message1) {
		
		for (int i = 0; i < message1.size();i++) {
		System.out.println(message1.get(i));
		if (message1.get(i).equals(" ... --- ... ")) {
			
			return true;
			
		}
	
		
	
		}
		
		
		return false;
	}
	

	
}
