/*
 *  SingleNode.java
 *  From p288 in the red book (slightly modified).
 *  Used by SingleList.java
 *  
 *  There is a NEXT pointer but no PREVIOUS pointer.
 */
package page288_LinkedList;

public class SingleNode2
{
    private int    data = 0;
    private SingleNode2 next = null;    // pointer to next node in the list
    
    // Constuctor
    public SingleNode2(int data) {
        this.data = data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    
    public void setNext(SingleNode2 next) {
        this.next = next;
    }    
    public SingleNode2 getNext() {
        return next;
    }
}









