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

	public static void ForLeapExactCheck() {
		String input;
		int year;

		input = JOptionPane.showInputDialog("Enter year : ");
		year = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, leapYearResults(year));
	}

	public static void selector() {
		String input;
		String message;
		boolean repeat = false;

		boolean result = false;

		do {
			repeat = true;
			message = "Please select the option you want from below \n"
					+ "1. Press 1 to Check whether a specific year is a leap year \n"
					+ "2. Press 2 to Enter a range of year and print out all leap years within that range  \n\n"
					+ "    " + "When you are clear about which choice to make, enter in the textbox and press \"OK\" "
					+ "    ";

			// JOptionPane.showMessageDialog(null, message);
			input = JOptionPane.showInputDialog(message + "\n\n" + "Enter you choice here : ");
			result = input.equals("1") || input.equals("2");

			// main menu selection
			if (input.equals("1")) {

				ForLeapExactCheck();
				do {
					input = JOptionPane.showInputDialog(
							"Would you like to test another year? \n\n" + "1. Enter 1 to test another year\n"
									+ "2. Enter 2 to go back to the main menu\n" + "3. Enter 3 to exit");
					if (input.equals("1"))
						ForLeapExactCheck();
					else if (input.equals("2"))
						selector();
					else if (input.equals("3")) {
						JOptionPane.showMessageDialog(null, "Goodbye :-)");
						repeat = false;

					}

					else {
						JOptionPane.showMessageDialog(null,
								"You have selected an invalid option thus you'll be taken to the main menu ");
						selector();
					}

				} while (repeat == true);

			}

			// main menu selection for the list of leap years
			else if (input.equals("2")) {

				LeapYearLists leapy = new LeapYearLists();
				leapy.LeapYearListControl();
				do {
					input = JOptionPane.showInputDialog(
							"Would you like to test another year? \n\n" + "1. Enter 1 to check another range of years\n"
									+ "2. Enter 2 to go back to the main menu\n" + "3. Enter 3 to exit");
					if (input.equals("1"))
						leapy.LeapYearListControl();
					else if (input.equals("2"))
						selector();
					else if (input.equals("3")) {
						JOptionPane.showMessageDialog(null, "Goodbye :-)");
						repeat = false;
					}

					else {
						JOptionPane.showMessageDialog(null,
								"You have selected an invalid option thus you will return to the main menu ");
						selector();
					}

				} while (repeat == true);

			}

			// main menu selection of the last option
			else if (input.equals("3")) {
				JOptionPane.showMessageDialog(null, "Goodbye :-) ");
				break;
			}

			if (result == false) {
				input = JOptionPane.showInputDialog("You have selected an invalid option : " + "\n"
						+ "Type \"continue\" to try again " + "\n or enter any key to exit");
				if (input.equalsIgnoreCase("continue")) {
					selector();
				} else {

					JOptionPane.showMessageDialog(null, "You have selected an invalid option again \n GOODBYE :-) !!!");
					break;
				}

			}

		} while (result == false);

	}

	public static void main(String args[]) {
		selector();

	}

}
