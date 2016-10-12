// StaticQueue.java

package page278_Queue;

import ibio.IBIO;

/**
 *  StaticQueue.java
 *  Implements a circular queue in an array. 
 *     Head will point to the first item in the queue.
 *     Tail will point to the free spot at the end of the queue.
 *  @author Mark Hayes
 */
public class StaticQueue {
    
    // Instance variables
    private int[] queue;                // the queue is stored in an array
    private int head;                   // pointer to first item in the queue
    private int tail;                   // pointer to the free spot at end of the queue
    private boolean isEmpty;            // True when the queue is empty
    private boolean isFull;             // True when the queue is full
        
    /** 
     *  Creates a static circular queue for holding integers.
     *  @param size The size of the queue.
     */
    public StaticQueue(int size) {
        queue = new int[size];
        head = 0;
        tail = 0;
        isEmpty = true;
        isFull = false;
    }
    
    /*
     *  Add an item to the stack.
     */
    public void add(int item) {
        if (isFull) {
            IBIO.output("Error: Cannot add. Queue is full.");
        }
        else {
            // Add the item to the queue
            queue[tail] = item;
            isEmpty = false;
            // Adjust the tail
            if (tail == (queue.length - 1)) {
                tail = 0;
            }
            else {
                tail = tail + 1;
            } 
            // See if the queue is now full
            if (tail == head) {
                isFull = true;
            }
        }
    }
    
    /*
     *  Remove an item from the stack. 
     */
    public int remove() {
        
        int queueItem;
        
        if (isEmpty) {
            IBIO.output("Error: Cannot remove. Queue is empty.");
            queueItem = -999;
        }
        else {
            // Get the item to be removed
            queueItem = queue[head]; 
            isFull = false;
            // Adjust the head
            if (head == (queue.length - 1)) {       
                head = 0;
            }
            else {
                head = head + 1;
            } 
            // See if the queue is now empty
            if (head == tail) {
                isEmpty = true;
            }
        }
        return queueItem;                    
    } 
/*
    // Hide from students. Do as an exercise.
    public String toString() {
        StringBuffer sb = new StringBuffer();

        if (head == tail)
        {
            if (isEmpty)
            {
                // Nothing in the queue
                sb.append("H: queue is empty");
            }
            else
            {
                // Queue is full
                for (int i = head; i < queue.length)
            }
        }
        else if (head < tail)
        {

        }

        return sb.toString();
    }
*/
    /**
     *  Displays the queue by making a copy of the original.
     */
/*
    public String toString2()
    {
        StringBuffer sb = new StringBuffer();
        int[] temp = new int[queue.length];

        // Save the state of the original queue
        int saveHead = head;
        int saveTail = tail;
        for (int i = 0; i < queue.length; i++) {
            temp[i] = queue[i];
        }

        // Place the contents of the queue into the SB
        sb.append("Head: ");
        while (!isEmpty) {
            sb.append(remove());
            sb.append(" ");
        }

        // Restore the original queue
        head = saveHead;
        tail = saveTail;
        for (int i = 0; i < queue.length; i++) {
            queue[i] = temp[i];
        }
    }
*/
}

























