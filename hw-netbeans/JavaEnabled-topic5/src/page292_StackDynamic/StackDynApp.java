package page292_StackDynamic;
import ibio.IBIO;

/**
 * TestStackDyn: uses the StackDyn class to store integers.
 * 1. Prompt user to enter some numbers.
 * 2. Let user pop the numbers off the stack.
 *
 * @see StackDyn
 * @see StackDynNode
 */
public class StackDynApp {

    /**
     * Entry point to application
     */
    public static void main(String[] args) {        
        test();           // test the stack   
    }
    
    /**
     * Prompt user for numbers. Let user pop the stack.
     */
    public static void test() {

        // Create a stack object
        StackDyn stack = new StackDyn();
        String prompt = "Enter a number to PUSH (-1 to stop): ";
        
        // Push items onto the stack
        int input = IBIO.inputInt(prompt);
        while (input != -1) {
            stack.push(input);
            System.out.println(stack.toString());
            input = IBIO.inputInt(prompt);            
        } 
        
        // Pop items off the stack
        prompt = "Enter 'p' to POP ('q' to stop): ";
        char c = IBIO.inputChar(prompt);
        while (c != 'q') {
            // Do pop in a try block in case user attemps to pops empty stack
            try {
                stack.pop();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // Display the stack
            System.out.println(stack.toString());
            // Prompt user again
            c = IBIO.inputChar(prompt);              
        }        
    }
}




