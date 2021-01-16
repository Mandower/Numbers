package numbers;

import javax.swing.JOptionPane;

public class PrimeNumbers
{
    /**
     * Checks if a number is a prime number
     * @param number - the number to be checked
     * @return returns true if number is a prime number, otherwise false
     */
    public static boolean isNumberPrime(int number)
    {
        if (number < 2)
            return false;
        for (int i = 2; i < (number / 2) + 1; i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void selector()
    {

        String choice;
        String options = "two";

        JOptionPane.showMessageDialog(null, "There are currently " + options + " for prime numbers \n\n"
                + "If you enter 1 you'll only be able to test if a specific number is a prime \n"
                + "If you enter 2 you'll be able to check a range of values you'll enter 2 numbers and all the prime numbers in that rage will be printed");

        choice = JOptionPane.showInputDialog("1. Check if number is prime \n " + "2. Range of prime numbers");

        if (choice.equals("1"))
        {
            specificPrime();
        } else if (choice.equals("2"))
            rangePrime();

        repeater();

    } // This method will select all other methods

    public static void specificPrime()
    {
        String input;
        String result;
        int number;

        input = JOptionPane.showInputDialog("Enter the number to test here : ");
        number = Integer.parseInt(input);

        if (isNumberPrime(number) == true)
            result = number + " is a prime";

        else
            result = number + " is NOT a prime";

        JOptionPane.showMessageDialog(null, result);
    }

    public static void rangePrime()
    {
        String input;
        int min;
        int max;

        input = JOptionPane.showInputDialog("Enter the lower number here : ");
        min = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter the upper number here : ");
        max = Integer.parseInt(input);

        JOptionPane.showInternalMessageDialog(null, rangePrimePrinter(min, max));
    }

    public static String rangePrimePrinter(int min, int max)
    {
        int count;
        String result;

        result = "";
        count = 0;

        for (int i = min; i <= max; i++)
        {
            if (isNumberPrime(i) == true)
            {
                result += (i + " ");
                count++;

                if (count % 10 == 0)
                    result += "\n";
            }
        }

        return result;
    }

    /**
     * Hello world
     */
    
    /**
     * Let me add something here for you to see 
     */
    
    public static void repeater()
    {
        String input;

        JOptionPane.showMessageDialog(null,
                "Would you like to \n" + "1. Check specific prime \n" + "2. Check range prime \n" + "3. exit");

        input = JOptionPane.showInputDialog("Please enter your choice here ");

        if (input.equals("1"))
        {
            specificPrime();
            repeater();
        } else if (input.equals("2"))
        {
            rangePrime();
            repeater();
        } else if (input.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "You haven't entered anything, please try again");
            repeater();
        } // This doesn't work line 124 you need to find a way where the code will
        // recognize when the user mistakenly pressed enter and then prompt the user to
        // enter again

        else if (!(input.equals("2") || input.equals("1")))
        {
            JOptionPane.showMessageDialog(null, "You have entered an invalid option \n" + "Goodbye :-) ");
            System.exit(0);

        } else
        {
            JOptionPane.showMessageDialog(null, "Goodbye :-) ");
            System.exit(0);

        }

    }// end

}
