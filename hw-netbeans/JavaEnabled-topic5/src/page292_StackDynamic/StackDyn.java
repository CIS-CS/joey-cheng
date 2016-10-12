package page292_StackDynamic;

/**
 * StackDyn.java
 * From p292 in the red book with some modifications.
 *
 * 1. The stack is used to hold integers. 
 *    The integers are in StackDynNode objects.
 *    When the stack is empty, the stack pointer (sp) = null;
 *    TOS means top of stack.
 * 2. sp points to the node at the top of the stack.
 * 3. Each node on the stack points to the node below it.
 *    The node on the bottom of the stack points to null.
 *
 * @see StackDynApp
 * @see StackDynNode
 */
public class StackDyn {           
    
    private StackDynNode sp = null;                 // the stack pointer
   
    /**
     * Push a number onto the stack.
     */
    public void push(int data) {

        StackDynNode newNode = new StackDynNode(data);
        // Make the new node point to the node at TOS
        newNode.setPrev(sp);
        // 'Increment' the sp to point at new node
        sp = newNode;
    }
    
    /**
     * POP a number off the stack. sp == null indicates empty stack.
     * @throws Exception
     */
    public int pop() throws Exception {

        if (sp != null) {
            // Get the data form the TOS node
            int data = sp.getData();
            // 'Decrement' sp so it points to the node below TOS
            sp = sp.getPrev();
            return data;
        }
        else {
            throw new Exception("Cannot POP. Stack is empty.");
        }
    }
    
    /**
     * Returns the contents of the stack.
     */
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        StackDynNode current = sp;
        
        sb.append("--TOS--\n");
        while (current != null) {
            sb.append(current.getData());
            sb.append("\n");
            current = current.getPrev();
        }
        return sb.toString();        
    }    
}
