package numbers;

import javax.swing.JOptionPane;

public class LeapYearLists {

	public static String LeapYearList(int x, int y)

	{
		int lower;
		int upper;
		int count;
		String output;

		output = "";
		lower = x;
		upper = y;

		LeapYear leap = new LeapYear();

		count = 0;
		output = "";

		for (int i = lower; i <= upper; i++) {

			if (leap.leapYear(i)) {
				output += (i + " ");
				count++;
				if (count % 15 == 0)
					output += "\n";
			}

		}

		return output;

	}

	public static void LeapYearListControl() {
		LeapYearLists leap = new LeapYearLists();

		int min;
		int max;
		String input;

		input = JOptionPane.showInputDialog("Enter the min year : ");
		min = Integer.parseInt(input);

		input = JOptionPane.showInputDialog("Enter the max year : ");
		max = Integer.parseInt(input);

		JOptionPane.showMessageDialog(null, LeapYearList(min, max));
	}

}
