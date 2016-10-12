/*
 * Queue exception.
 */
package page278_Queue;

/**
 * Holds the error message for a queue full exception.
 * @author Mark Hayes
 */
public class QueueFullException extends Exception {

    private String message = "Queue is full. Cannot add to queue.";

    public String toString() {
        return message;
    }
}
