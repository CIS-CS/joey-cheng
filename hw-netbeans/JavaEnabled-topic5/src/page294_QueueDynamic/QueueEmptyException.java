package page294_QueueDynamic;

/**
 * Exception class for use with the dynamic queue.
 */
class QueueEmptyException extends Exception
{
    /**
     * QueueEmptyException default constructor
     */
     public QueueEmptyException()
    {
        super("Queue is emtpy.");
    }

    /**
     * QueueEmptyException constructor with message
     * @param msg String
     */
    public QueueEmptyException(String msg)
    {
        super(msg);
    }
}