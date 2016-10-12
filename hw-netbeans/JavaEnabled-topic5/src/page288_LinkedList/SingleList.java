/*
 *  SingleList.java
 *  From page 288-290 in the red book. (Llist.java)
 * 
 *  1. SingleList is a singly-linked list with a HEAD pointer and a
 *     TAIL pointer.
 *  2. Each item in the list is a SingleNode object;
 *     SingleNode objects contain integer data.
 *     SingleNode objects are stored in ascending order in the list.
 *  3. Duplicate entries in the list are ok.
 */

package page288_LinkedList;

public class SingleList
{   
    private SingleNode head = null;
    private SingleNode tail = null;
    private SingleNode current = null;
    
    /**
     *  Add a node to the list (in ascending order).
     *  Four possibilities: 
     *  1. the list is empty; start a new list. 
     *  2. add to the front of the list. 
     *  3. add to the end of the list.
     *  4. insert into the middle of the list.     
     */ 
    public void add(int data) {
        
        SingleNode newNode = new SingleNode(data);
        current = null;

        // The list is empty, start a new list
        if (head == null) {            
            newNode.setNext(null);
            head = newNode;
            tail = newNode;
        }
        // Add to the front of the list
        else if (newNode.getData() <= head.getData()) {            
            newNode.setNext(head);              
            head = newNode;
        }
        // Add to the end of the list
        else if (newNode.getData() >= tail.getData()) { 
            newNode.setNext(null);              
            tail.setNext(newNode);
            tail = newNode;
        }
        else {
            // Insert in the middle
            current = head;                     
            while (current != tail) {
                if (newNode.getData() <= current.getNext().getData()) {
                    // link the new node to the node after current
                    newNode.setNext(current.getNext());
                    // link the current to the new node
                    current.setNext(newNode);
                    break;             // done: early exit the loop
                }
                else {
                    current = current.getNext();    // try the next one
                }
            }
        }
    }

    /**
     *  Remove a node from the list.
     *  Three possibilities:
     *  1. the list is empty; report node not found (throw Exception).
     *  2. list has one node; remove node, set H,T to null;
     *  3. list has more than one node; 
     *     see if it is the first node
     *     if not, check the embedded nodes, up to the last one.
     *     check the last node
     *  Since the list is singly-linked, it is necessary to maintain a reference
     *  back to the previous node. 
     */
    public void remove(int data) throws Exception {        
        
        if (isEmpty())
        {
            throw new Exception("Value not found.");
        }
        else if (size() == 1)
        {
            if (head.getData() == data)
            {
                // one item in the list; remove it.
                head = null; 
                tail = null;
            }
            else 
            {
                // one item in the list, but it's not the one we are looking for.
                throw new Exception("Value not found."); 
            }
        }
        else
        {
            // the list has more than one node in it; check the first node.
            current = head;
            if (current.getData() == data)
            {
                // remove the first node from the list
                head = current.getNext();
                current.setNext(null);
                current = null;
            }
            else
            {
                // check the rest of the nodes, not including the last one.
                current = current.getNext();                
                SingleNode previous = head;
                boolean found = false;
                
                while (!found && current.getNext() != null)
                {
                    if (current.getData() == data)
                    {
                        // found the data in an embedded node
                        previous.setNext(current.getNext());
                        current.setNext(null);
                        found = true;
                    }
                    // go to the next node
                    current = current.getNext();
                    previous = previous.getNext();
                }
                // check the last node
                if (!found)
                {
                    if (current.getData() == data)
                    {  
                       // found the data in the last node 
                       previous.setNext(null);
                       tail = previous;
                    }
                    else 
                    {
                        // we did not find the node
                        throw new Exception("Value not found."); 
                    }                    
                }                
            }
        }    
    }
    
    /**
     * Return the size of the list.
     * @return the size of the list.
     */
    public int size()
    {
        int result = 0;
        SingleNode current = head;
        
        while (current != null)
        {
            result++;
            current = current.getNext();
        }
        return result;
    }
    
    /**
     * Return a string representation of the list.
     */ 
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        
        SingleNode current = head;
        while (current != null) {
            sb.append(current.getData());
            sb.append(" ");
            current = current.getNext();
        }
        return "List = " + sb.toString();
    }
    
    public boolean isEmpty() {
        return (head == null && tail == null) ? true : false;
    }
}






