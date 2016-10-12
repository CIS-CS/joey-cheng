package page315_Recursion;

/*
 * Factorials.java
 * Uses iteration instead of factorial.
 */
public class Factorials {
    
    public static void main(String[] args) {
        
        int  number = 5;       // get the factorial of this number
        long result = 1;        // store result here
        
        for (int i = 1; i <= number; i++) {
            
            result = 1;
            
            for (int factor = 2; factor <= i; factor++) {
                result = result * factor;
            }
            
            System.out.println(i + "!" + " is " + result);
        }
    }
}
