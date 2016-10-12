package page292_StackDynamic;

/**
 * this is the node for the singly-linked list.
 * The previous pointer points to the node 'below' in the stack.
 * From: http://www.ib-computing.com/java/datastructures/stacks.html
 *
 * @author Mr J. Cleaned up by MHayes.
 * @version 2005.02.05
 * @see ReverseMeApplet
 * @see ReverseMeStack
 */
class ReverseMeNode
{
    private char item;
    private ReverseMeNode prev;
    
    // Constructor
    public ReverseMeNode(char c)
    {
        item = c;        
	prev = null;
    }    
    
    // Accessor methods
    public char getItem() 
    {
        return item;
    }
    public ReverseMeNode getPrev()
    {
        return prev;
    }
    
    // Mutator methods
    public void setItem(char ch) 
    {
        item = ch;
    }
    public void setPrev(ReverseMeNode node)
    {
        prev = node;
    }
}




