package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {
String[] aidan = {"1200","203","0530","306","34603","14323","402305203","40634","30040","305","508","787","7977"};

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		_00_LinearSearch l = new _00_LinearSearch();
		//1. use the assertEquals method to test your linear search method.
		assertEquals(5,l.linearSearch(aidan, "14323"));
		assertEquals(0,l.linearSearch(aidan, "1200"));
		assertEquals(12,l.linearSearch(aidan, "7977"));
		
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
	
		//   remember that the array must be sorted
		
		assertEquals(5,l.linearSearch(aidan, "14323"));
		assertEquals(0,l.linearSearch(aidan, "1200"));
		assertEquals(12,l.linearSearch(aidan, "7977"));
	}
	
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
