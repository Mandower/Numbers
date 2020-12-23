package numbers;

public class NumberCheck {

	public static boolean leapYear(int x) {
		if (x % 400 == 0 && x % 4 == 0 && x != 100)
			return true;
		else
			return false;
	}

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

	public static void main(String args[]) {
		System.out.println(prime(2004545651));
	}
}
