package _02_More_Algorithms;

public class Cube {

	public static boolean isCube(int a) {

		for (double i = 1; i <= a; i++) {

			if (a / i / i == i) {

				return true;
			}
		}

		return false;
	}

}
