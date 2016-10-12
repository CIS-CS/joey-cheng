package page292_StackDynamic;

/**
 * From p292 in the red book.
 * A node for a singly-linked list.
 *
 * @see StackDynApp
 * @see StackDyn
 */
public class StackDynNode
{
    private int data = 0;               // Each node holds an integer
    private StackDynNode prev = null;   // Points to the node below
    
    // Constuctor
    public StackDynNode(int data) {
        this.data = data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    
    public void setPrev(StackDynNode next) {
        this.prev = next;
    }    
    public StackDynNode getPrev() {
        return prev;
    }
}









