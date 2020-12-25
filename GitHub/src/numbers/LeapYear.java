package numbers;

import javax.swing.JOptionPane;

//This method returns a boolean value whether it's a leap year or not
public class LeapYear {

	public static boolean leapYear(int x) {
		if (x % 4 == 0 && x % 100 != 0)
			return true;
		else if (x % 100 == 0 && x % 400 == 0) {
			return true;
		} else
			return false;
	}

	public static String leapYearResults(int year) {
		String decision;

		String isD = "is divisible";
		String isNotD = "is not divisible";

		decision = "";

		decision += "The year : " + year + "\n" + "\n";
		if (year % 4 == 0)
			decision += year + " " + isD + " by 4 \n";
		else
			decision += year + " " + isNotD + " by 4 \n";

		if (year % 100 == 0)
			decision += year + " " + isD + " by 100 \n";
		else
			decision += year + " " + isNotD + " by 100 \n";

		if (year % 400 == 0)
			decision += year + " " + isD + " by 400 \n";
		else
			decision += year + " " + isNotD + " by 400 \n";

		if (leapYear(year) == true)
			decision += year + " is a leap year";
		else
			decision += year + " is NOT a leap year";

		return decision;

	}

	public static void main(String args[]) {

		int year;
		String input;
		String message;
		boolean result = false;

		do {

			message = "Please select the option you want from below \n"
					+ "1. Press 1 to Check whether a specific year is a leap year \n"
					+ "2. Press 2 to Enter a range of year and print out all leap years within that range + \n\n"
					+ "When you are clear about which choice to make, select \"OK\" and a text box to add your choice will appear ";

			JOptionPane.showMessageDialog(null, message);
			input = JOptionPane.showInputDialog("Enter you choice here : ");
			result = input.equals("1") || input.equals("2");

			JOptionPane.showMessageDialog(null, message);
		} while (result == false);

		input = JOptionPane.showInputDialog("Enter year : ");
		year = Integer.parseInt(input);

		JOptionPane.showMessageDialog(null, leapYearResults(year));

	}

}
