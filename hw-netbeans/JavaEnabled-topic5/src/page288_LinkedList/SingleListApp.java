/*
 *  SingleListApp.java
 */
package page288_LinkedList;

import ibio.IBIO;

public class SingleListApp {
    
    public static void main(String[] args) {
        
        SingleListApp m = new SingleListApp();
        m.testSingleList();         // test the singly-linked list   
    }
    
    // SLList test
    public void testSingleList() {
        
        SingleList myList = new SingleList();       // Create a singly-linked list
        String prompt;                              // user prompt
        
        // Add items to the list
        prompt = "\nEnter a number to add (q to quit): ";
        String input = IBIO.inputString(prompt);
        
        while (!input.equals("q")) {
            int value = Integer.parseInt(input);
            myList.add(value);
            System.out.println(myList.toString());
            input = IBIO.inputString(prompt);            
        }
        
        // Remove items from the list
        prompt = "\nEnter a number to remove (q to quit): ";
        input = IBIO.inputString(prompt);
        
        while (!input.equals("q")) {
            int value = Integer.parseInt(input);
            try {
                myList.remove(value);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(myList.toString());
            input = IBIO.inputString(prompt);            
        }        
    }
}
