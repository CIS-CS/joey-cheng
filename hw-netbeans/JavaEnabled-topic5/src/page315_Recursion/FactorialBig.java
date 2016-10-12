package page315_Recursion;
import java.math.BigInteger;

/**
 *  Factorial.java
 *	Use a recursive method to calculate the factorial of a number.
 *  This is a variation of the code from page 316 of the red book.
 *  Note that it uses a long instead of an int, since the result can
 *  be very large.
 */
public class FactorialBig {

    public static void main(String[] args) {
        
        // Did user enter an argument?
        if (args.length == 0) {
           System.out.println("Usage: FactorialBig number");
           System.exit(1);
        }
        
        // Is the argument a number?
        try {
            Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e) {
           System.out.println("Error: " + args[0] + " is not a number.");
           System.exit(1);
        }

        // Calculate the factorial
        BigInteger result = factorial(new BigInteger(args[0],10));
        
        // Display the result
        System.out.println("\nfact(" + args[0] + " = " + result.toString());        
    }

    public static BigInteger factorial(BigInteger n) {
        
        if (n == BigInteger.ONE) {
            return BigInteger.ONE;
        }
        else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
    }
}