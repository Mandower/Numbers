package numbers;

import javax.swing.JOptionPane;

public class LeapYear {

	public static boolean leapYear(int x) {
		if (x % 4 == 0 && x % 100 != 0)
			return true;
		else if (x % 100 == 0 && x % 400 == 0) {
			return true;
		} else
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
		String input;
		int year;

		input = JOptionPane.showInputDialog("Enter a year : ");
		year = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, leapYear(year));
	}
}
