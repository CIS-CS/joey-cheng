/*
 * StaticQueueApp.java
 */
package page278_Queue;

/**
 *
 * @author CIS
 */
public class StaticQueueApp {
    
    /** Creates a new instance of StaticQueueApp */
    public StaticQueueApp() {
    }
    
    /*
     *  Entry point to application
     */
    public static void main(String[] args) {
               
        StaticQueue queue = new StaticQueue(10);
        
        // Test the StaticQueue class
        for (int i = 0; i < 10; i++) {
            queue.add(10);
        }
        // Test the StaticQueue class
        for (int i = 0; i < 11; i++) {
            queue.remove();
        }
    }
}















