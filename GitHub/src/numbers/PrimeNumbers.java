package numbers;

public class PrimeNumbers {

	public static boolean prime(int x) {
		int counter = 0;
		for (int i = 1 + 1; i < x; i++) {
			if (x % i == 0) {
				counter++;
				break;
			}
		}

		if (counter > 0)
			return false;
		else
			return true;
	}
}
