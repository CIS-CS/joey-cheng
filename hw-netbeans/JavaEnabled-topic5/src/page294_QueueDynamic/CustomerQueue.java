package page294_QueueDynamic;

/**
 * Implements a queue using a singly-linked list.
 * @author MHayes
 */
class CustomerQueue
{
    // Pointers to head and tail of the queue
    // H --> Node --> Node --> Node <-- T
    private CustomerNode head = null;
    private CustomerNode tail = null;

    // Size of the queue
    private int size = 0;
    private final int QUEUE_LIMIT = 10;

    /**
     * Add a customer to the rear of the queue.
     */
    public void enqueue(CustomerNode node) throws QueueFullException
    {
        if (isEmpty())
        {
            head = node;
            tail = node;
            node.setNext(null);
            size = 1;
        }
        else if (!isFull())
        {
            tail.setNext(node);
            tail = node;
            size++;
        }
        else
        {
            throw new QueueFullException("Error: queue is full.");
        }
    }

    /**
     * Remove a customer from the front of the queue.
     */
    public CustomerNode dequeue() throws QueueEmptyException
    {
        CustomerNode result;

        if (!isEmpty())
        {
            result = head;
            head = head.getNext();
            result.setNext(null);       // detach the dequeue'd item from list
            size--;
            if (size == 0) tail = null;
            return result;
        }
        else
        {
            throw new QueueEmptyException("Nobody is in the queue.");
        }
    }

    /**
     * Returns first item in the queue without removing the item.
     */
    public CustomerNode front()
    {
        return head;
    }

    /**
     * Returns last item in the queue without removing the item.
     */
    public CustomerNode rear()
    {
        return tail;
    }

    /**
     * Returns the size of the queue.
     */
    public int size()
    {
        return size;
    }

    /**
     * Returns true if the queue is empty, otherwise false.
     */
    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

        // Two more ways to write this method:
        // return (size == 0);
        // return size == 0 ? true : false;
    }

    /**
     * Returns true if the queue is full, otherwise false.
     */
    public boolean isFull()
    {
        
        if (size == QUEUE_LIMIT)
        {
            return true;
        }
        else
        {
            return false;
        }

        // Two more ways to write this method:
        // return (size == QUEUE_LIMIT);
        // return size == QUEUE_LIMIT ? true : false;
    }
}