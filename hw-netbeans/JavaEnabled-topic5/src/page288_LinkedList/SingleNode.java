/*
 *  SingleNode.java
 *  From p288 in the red book (slightly modified).
 *  Used by SingleList.java
 *  
 *  There is a NEXT pointer but no PREVIOUS pointer.
 */
package page288_LinkedList;

public class SingleNode
{
    private int    data = 0;
    private SingleNode next = null;    // pointer to next node in the list
    
    // Constructor
    public SingleNode(int data) {
        this.data = data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    
    public void setNext(SingleNode next) {
        this.next = next;
    }    
    public SingleNode getNext() {
        return next;
    }
}









