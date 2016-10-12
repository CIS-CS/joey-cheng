package page315_Recursion;

/**
 *  Factorial.java
 *  Use a recursive method to calculate the factorial of a number.
 *  This is a variation of the code from page 316 of the red book.
 *  Note that it uses a long instead of an int, since the result can
 *  be very large.
 * 
 *  Q: what happens when you try to 'factorialize' 21?
 */
public class Factorial {

    public static void main(String[] args) {

        System.out.println("\nfactorial 20 = " + factorial(20));
    }

    public static long factorial(long n) {
            
        if (n == 1) {
            return n;
        }
        else {
            return n * factorial(n - 1);
	}
    }
}