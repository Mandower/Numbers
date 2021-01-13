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
	} // This method returns true if the number is a prime and false if it's not

	public static void selector() {

		/*
		This method will select all these other methods based on what the user entered
		If the user enters 1 then the specificPrime() method will be called
		If the user enters 2 then the rangePrime() method will be called
		At the end of the operation the method repeater() will be called in order to prompt the user for additional choices
		*/
		
		String choice;
		String options = "two";

		JOptionPane.showMessageDialog(null, "There are currently " + options + " for prime numbers \n\n"
				+ "If you enter 1 you'll only be able to test if a specific number is a prime \n"
				+ "If you enter 2 you'll be able to check a range of values you'll enter 2 numbers and all the prime numbers in that rage will be printed");

		choice = JOptionPane.showInputDialog("1. Check if number is prime \n " + "2. Range of prime numbers");

		if (choice.equals("1")) {
			specificPrime();
		}

		else if (choice.equals("2"))
			rangePrime();

		repeater();

	} // This method will select all other methods

	public static void specificPrime() {
		
		/*
		 * The specificPrime() method takes 1 value as an integer and checks if it's a prime and returns a message whether it's a prime or not
		 * This method will call upon the prime(x) method and if a number is a prime then it generates an output based on what the prime(x) method returned
		 * 
		 */
		
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
		/*
		 * This method is used to accept the integer values that will be used by the method rangePrimePrinter(x,y)
		 * this is just the method that prompts the user to enter the two values that will be used
		 * Those two values will be the lower and upper for the printing range
		 */
		
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
		/*
		 * This method accepts two arguments, one being the minimum value and the other being the maximum
		 * A for loop will be used to increment from the min to the max by 1 and checking each number in that range if it's a prime
		 * If it's a prime it will be added to the result string and if it's not then no action
		 * This will increment until the maximum number is reached 
		 */
		
		int count;
		String result;

		result = "";
		count = 0;

		//Check from min to max if it's a prime, if it's a prime add that to the result string 
		
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
		/*
		 * This method will keep prompting the user to enter an input
		 * If the user enters 1 then the repeater() method will call the specificPrime() method
		 * If the user enters 2 then the repeater() method will call the rangePrime() method
		 * If the user doen't enter anything then the repeater() method will be called again
		 * If the user doesn't enter 1 or 2 then it will be treated as a wrong option then the code will exit 
		 */
		
		String input;

		JOptionPane.showMessageDialog(null,
				"Would you like to \n" + "1. Check specific prime \n" + "2. Check range prime \n" + "3. exit");

		input = JOptionPane.showInputDialog("Please enter your choice here ");

		//Option 1
		if (input.equals("1")) {
			specificPrime();
			repeater();
		}

		//Option 2
		else if (input.equals("2")) {
			rangePrime();
			repeater();
		}

		//In case nothing was entered then the repeater() method will be called again
		else if (input.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "You haven't entered anything, please try again");
			repeater();
		} // This doesn't work line 124 you need to find a way where the code will
			// recognize when the user mistakenly pressed enter and then prompt the user to
			// enter again

		//In case anything is not 1 or 2 the system exits
		else if (!(input.equals("2") || input.equals("1"))) {
			JOptionPane.showMessageDialog(null, "You have entered an invalid option \n" + "Goodbye :-) ");
			System.exit(0);

		}

		//anything entered that isn't 1 or 2 then the system will exit
		else {
			JOptionPane.showMessageDialog(null, "Goodbye :-) ");
			System.exit(0);

		}

	}// end

}
