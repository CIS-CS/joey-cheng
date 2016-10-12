/*
 * Main.java
 *
 * Created on October 25, 2007, 12:16 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package page255_PassByValue;

/**
 *
 * @author CIS
 */
public class PassBy {
        
    /** Creates a new instance of Main */
    public PassBy() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 10;
        Integer myInteger = new Integer(10);
        String[] names = {"tom", "dick", "harry"};
        
        passPrimitiveByValue(i);
        passObjectsByReference(myInteger, names);
        argumentList(i, myInteger, names);
    }
    
    /* Pass primitives by value */
    public static void passPrimitiveByValue(int i) {
        
        int value = i;          // the value of "i in main" is passed to this method
        
    }
    
    /* Pass objects by reference */
    public static void passObjectsByReference(Integer myInteger, String[] names) {
        
        int i = myInteger.intValue();
        String[] teamMates = names;
    } 
    
    /* argument list */
    public static void argumentList(int i, Integer myInteger, String[] names) {
        
        // the argument list includes an int, an Integer, and an array
    }    
    
}
