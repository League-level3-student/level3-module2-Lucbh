package _02_More_Algorithms;

public class Square {

	public static boolean isSquare(int a) {

		for (int i = 1; i <= a; i++) {

			if (a / i == i) {

				return true;
			}
		}

		return false;
	}

}
