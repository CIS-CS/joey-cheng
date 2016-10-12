package page315_Recursion;
import ibio.IBIO;
/**
 * Uses recursion to:
 * 1. display numbers in descending and ascending order.
 * 2. display characters in reverse.
 * 3. test if number is prime.
 *
 * @author Mark Hayes
 */
public class PrintingNumbers {

    public static void main(String[] args) {

        PrintingNumbers app = new PrintingNumbers();
/*
        app.displayDescending(15);
        System.out.println();

        app.displayAscending(15);
        System.out.println("\n");
*/
        app.reverseIt();
        System.out.println("\n");

        //int num = IBIO.inputInt("Enter a number: ");
        //System.out.println(num + (app.isPrime(num, 2) ? " is " : " is not ") + "prime");
    }

    /** Displays n to 0. */
    public void displayDescending(int n) {

        if (n <= -1) {
            return;
        }
        else {
            System.out.print(n + " ");
            displayDescending(n - 1);
        }
    }
    
    /** Displays 0 to n. */
    public void displayAscending(int n) {

        if (n <= -1) {
            return;
        }
        else {
            displayAscending(n - 1);
            System.out.print(n + " ");
        }
    }

    /** Prompt user for chars and display them in reverse. */
    public void reverseIt() {

        char c = IBIO.inputChar("Enter a char. 'q' to quit. ");

        if (c == 'q') {
            return;
        }
        else {
            reverseIt();
            System.out.print(c);
        }
    }

    /** Tests if a number is prime. Pass in the number and initial divisor. */
    public boolean isPrime(int num, int div) {

        if (div == num) {
            return true;
        }
        else if (num % div == 0) {
            return false;
        }
        else {
            return isPrime(num, div + 1);
        }
    }
}
