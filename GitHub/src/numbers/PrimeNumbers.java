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

	public static void selector() {
		String choice;
		String options = "two";

		JOptionPane.showMessageDialog(null, "There are currently " + options + " for prime numbers \n\n"
				+ "If you enter 1 you'll only be able to test if a specific number is a prime \n"
				+ "If you enter 2 you'll be able to check a range of values you'll enter 2 numbers and all the prime numbers in that rage will be printed");

		choice = JOptionPane.showInputDialog("1. Check if number is prime \n " + "2. Range of prime numbers");

		if (choice.equals("1")) {
			specificPrime();
		}

		else if (choice.equals("2")) {
			rangePrime();
		}

	}

	public static void specificPrime() {
		String input;
		String result;
		int number;

		input = JOptionPane.showInputDialog("Enter the number to test here : ");
		number = Integer.parseInt(input);

		if (prime(number) == true)
			result = number + " is a prime";

		else
			result = number + " is NOT a prime";

		JOptionPane.showMessageDialog(null, result);
	}

	public static void rangePrime() {
		String input;
		int min;
		int max;

		input = JOptionPane.showInputDialog("Enter the lower number here : ");
		min = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter the upper number here : ");
		max = Integer.parseInt(input);

		JOptionPane.showInternalMessageDialog(null, rangePrimePrinter(min, max));
	}

	public static String rangePrimePrinter(int min, int max) {
		int count;
		String result;

		result = "";
		count = 0;

		for (int i = min; i <= max; i++) {
			if (prime(i) == true) {
				result += (i + " ");
				count++;

				if (count % 10 == 0)
					result += "\n";
			}

		}

		return result;
	}

	public static void repeater() {
		String input;

		JOptionPane.showMessageDialog(null,
				"Would you like to \n" + "1. Check specific prime \n" + "2. Check range prime \n" + "3. exit");

		input = JOptionPane.showInputDialog("Please enter your choice here ");

		if (input.equals("1"))
			specificPrime();

		else if (input.equals("2"))
			rangePrime();

		else {
			JOptionPane.showMessageDialog(null, "Goodbye :-) ");
			System.exit(0);
		}

	}// end

}
