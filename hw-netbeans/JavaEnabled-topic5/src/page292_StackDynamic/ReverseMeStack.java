package page292_StackDynamic;

/**
 * ReverseMeStack.java
 * This Class implements a stack using a singly-linked list.
 * The stack is used to store the string that user enters.
 * The stack pointer is sp.
 * TOS stands for, top of stack.
 * 
 * @author Mr J. Cleaned up by MHayes.
 * @version 2005.02.11
 * @see ReverseMeApplet
 * @see ReverseMeNode
 */
public class ReverseMeStack {

    ReverseMeNode sp = null;        // The stack pointer

    /**
     * Push a character onto stack.
     */
    public void push(char c) {

        // Create the new node
        ReverseMeNode node = new ReverseMeNode(c);
        // Point the new node at the node at TOS
        node.setPrev(sp);
        // 'Increment' sp to point to the new node
        sp = node;
    }

    /**
     * Pop a character from stack - check for underflow.
     * @throws Exception
     */
    public char pop() throws Exception {

        ReverseMeNode poppedNode;

        if (!isEmpty()) {
            // Get the node at TOS
            poppedNode = sp;
            // 'Decrement' the sp
            sp = sp.getPrev();
            // Return the character from the popped node
            return poppedNode.getItem();
        }
        else {
            throw new Exception("Error: Stack is empty. Cannot pop.");
        }
  }

    /**
     * Returns true if stack is empty.
     */
    public boolean isEmpty()
    {
        return (sp == null);
    }
}