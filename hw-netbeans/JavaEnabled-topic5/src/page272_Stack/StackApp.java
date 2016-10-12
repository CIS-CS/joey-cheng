// StackTester.java
package page272_Stack;

/**
 *  StackTester.java
 *  A simple program that uses the Stack class.
 *  @author Mark Hayes
 */
public class StackApp {
    
    public static void main(String[] args) {
        
        // Create the stack object
        Stack s = new Stack(5);
        
        try {
            
            s.push("100");
            /*
            s.push(101);
            s.push(102);
            //s.push(103);
            //s.push(104);
            s.pop();
            s.pop();
            */
            System.out.println(s.toString());
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        

    }
    
}





