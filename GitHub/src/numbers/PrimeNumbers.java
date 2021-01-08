package numbers;

import javax.swing.JOptionPane;

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

	public static String chooser() {
		String choice;
		String options = "two";

		JOptionPane.showMessageDialog(null, "There are currently " + options + " for prime numbers \n\n"
				+ "If you enter 1 you'll only be able to test if a specific number is a prime \n"
				+ "If you enter 2 you'll be able to check a range of values you'll enter 2 numbers and all the prime numbers in that rage will be printed");

		choice = JOptionPane.showInputDialog("1. Check if number is prime \n" + "2. Range of numbers");

		return choice;
	}

}
