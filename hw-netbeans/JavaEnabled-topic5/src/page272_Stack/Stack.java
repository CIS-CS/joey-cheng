
package page272_Stack;
import java.util.Arrays;
import java.io.File;

/**
 *  Implements a stack in an array (a static stack).
 *  The stack pointer (SP) points to the top item in the stack.
 *  When SP == 0, it is pointing the bottom item in the stock.
 *  If the stack is empty, SP == -1.
 * 
 *  On push, SP is incremented, then the data is added at SP.
 *  On pop,  the data is removed, then SP is decremented.
 */
public class Stack {
    
    // Stack and stack pointer
    private String[] stack = null;    // Stack
    private int sp;                // Stack pointer: -1 means empty

    /**
     * Initializes the stack.
     * @param stackSize
     */
    public Stack(int stackSize) {
        stack = new String[stackSize];
        sp = -1;
    }

    /**
     * Add an element to top of stack.
     */
    public void push(String data) throws Exception {

        if (!isFull()) {
            sp = sp + 1;                // increment SP
            stack[sp] = data;           // add item to TOS
        }
        else {
            throw(new Exception("Cannot push: Stack is full."));
        }
        
        File f = new File("a;sdlkfjas;ldkfjas;lfkdj");
        boolean b = f.exists();
    }
    
    /**
     * Remove top element from the stack.
     */
    public String pop() throws Exception {

        if (!isEmpty()) {
            String item = stack[sp];       // get top item from stack
            sp = sp - 1;                // decrement SP
            return(item);
        }
        else {
            throw(new Exception("Cannot pop: Stack is empty."));
        }
    }
    
    /**
     * Return true if stack is empty.
     * @return <code>true</code> if the stack is empty.
     */
    public boolean isEmpty() {
        if (sp ==  - 1) {
            return true;
        }
        else {
            return false;
        }
    }    
    
    /**
     * Checks if the stack is full.
     * @return <code>true</code> if stack is full, otherwise, 
     * <code>false</code>.
     */
    public boolean isFull() {
        if (sp == (stack.length - 1)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Get the size of the stack.
     * @return The size of the stack.
     */
    public int size() {

        if (isEmpty()) {
            return 0;
        }
        else {
            return sp + 1;
        }
    } 
    
    /**
     * Converts the stack to a String, with the top item on the left.
     * @return The stack in the form of a String.
     */
    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        // Make a copy of the stack-array so we do not disturb the real stack.
        String[] temp = Arrays.copyOf(stack, stack.length);
        
        // copy the items into the StringBuffer
        for (int i = size()-1; i >= 0; i--)
        {
            sb = sb.append(temp[i]).append("\n");
            System.out.println(sb);
        }
        return sb.toString();
    }
}






































