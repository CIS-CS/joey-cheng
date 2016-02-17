// DoubleList.java

package swingGUI;

/**
 * Implements a doubly-linked list.
 * Head points to first node, tail points to last node, current points
 * to MRA node (most recently accessed).
 * @author MHayes
 * @version 2009-01-10
 */
public class DoubleList {

    // Instance variables
    private DoubleNode head = null;
    private DoubleNode tail = null;
    private DoubleNode current = null;  // points to last inserted node

    /**
     *  Inserts a node at the head of the list.
     *  @param node The node to insert.
     */
    public void insertHead(VideoTape tapes)
    {
        DoubleNode node;
        node = new DoubleNode (tapes);
        // Check if the list is empty
        if (head == null)
        {
            // Add the node to the empty list.
            head = node;
            tail = node;
            current = head;
        }
        else
        {
            // The list is not empty. Add at head.
            head.setPrev(node);
            node.setNext(head);
            head = node;
            current = head;
        }
    }

    /**
     *  Inserts a node at the tail of the list.
     *  @param node The node to insert.
     */
    public void insertTail(VideoTape tapes)
    {
        DoubleNode node;
        node = new DoubleNode (tapes);
        // Check if the list is empty
        if (head == null)
        {
            // Add the node to the empty list.
            head = node;
            tail = node;
            current = node;
        }
        else
        {
            // The list is not empty. Add at tail.
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            current = tail;
        }
    }

    /**
     *  Inserts a node before the current node.
     *  @param node The node to insert.
     */
    public void insertBefore(DoubleNode node)
    {
        node.setNext(current);
        node.setPrev(current.getPrev());
        current.getPrev().setNext(node);
        current.setPrev(node);
        current = node;
    }

    /**
     *  Inserts a node after the current node.
     *  @param node The node to insert.
     */
    public void insertAfter(DoubleNode node)
    {
        node.setPrev(current);
        node.setNext(current.getNext());
        current.getNext().setPrev(node);
        current.setNext(node);
        current = node;
        
    }

    /**
     *  Extracts the names from the nodes and forms a string.
     *  @return String The names in the list, separated by "\n"
     */
    public String toString()
    {
        DoubleNode node = head;
        StringBuffer sb = new StringBuffer();

        // Traverse the list to display each node.
        sb.append("head\n----\n");
        while (node != null)
        {
            sb.append(node.getName());
            if (node == current)
            {
                sb.append("  <<<");     // Indicate the current node
            }
            sb.append("\n");
            node = node.getNext();
        }
        return sb.toString();
    }
}
