package _00_Sorting_Algorithms;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SelectionSorter extends Sorter {
	public SelectionSorter() {
		type = "Selection";
	}
	
	//  You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		//1. make a for loop to iterate through all but the last 
		//   element of the array
		
		for (int i = 0; i < array.length-1; i++) {
			int index =  i;
			
			for (int e = i + 1; e < array.length; e++) {
				
				if (array[e] < array[index]) {
					
					index = e;
					display.updateDisplay();
					
					
				}
				
				int temp = array[index];
				
				array[index] = array[i];
				array[i] = temp;
					
			}
		}
		
		
			//2. create an integer called index and set it equal to i
			
			//3. make another for loop that starts at i + 1 and
			//   goes through the entire array
			
				//4. if the array element at j is less than the 
				//   element at index, then set index equal to j
				
			//5. swap the array element at index with the array element at i
		
		for (int q = 0; q < array.length;q++) {
			
			System.out.println(array[q]);
			
		}
		
	
		
	}
}
