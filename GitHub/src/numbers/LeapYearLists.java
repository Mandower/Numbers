package numbers;

import javax.swing.JOptionPane;

public class LeapYearLists {

	public static String LeapYearList(int x, int y)

	{
		int lower;
		int upper;
		String input;
		String output;

		output = "";
		lower = x;
		upper = y;

		input = JOptionPane.showInputDialog("Enter lower here : ");
		input = JOptionPane.showInputDialog("Enter upper here : ");

		LeapYear leap = new LeapYear();

		for (int i = lower; i <= upper; i++) {

		}

		return output;

	}

}
