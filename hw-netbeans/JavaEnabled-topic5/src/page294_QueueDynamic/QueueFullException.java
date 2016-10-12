package page294_QueueDynamic;

/**
 * Exception class for use with interface Queue
 */
class QueueFullException extends Exception
{
/**
 * QueueFullException default constructor
 */
 public QueueFullException()
{
	super("Queue is full");
}
/**
 * QueueFullException constructor with message
 * @param s java.lang.String
 */
public QueueFullException(String s) 
{
	super(s);
}
}