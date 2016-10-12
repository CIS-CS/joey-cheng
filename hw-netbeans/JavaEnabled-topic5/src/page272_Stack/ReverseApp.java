/*
 * Implements an app that reverses String input by user
 * i.e. "I have a dog." is returned as "dog. a have I"
 */
package page272_Stack;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.StringBuffer;

/**
 *
 * @author joeycheng
 */
public class ReverseApp {
     
    public static void main(String[] args) {
        //Prompts user for input and separates user input into words
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter String to be reversed: ");
        String userString = scan.next();
        //Counts how many words are in the String and creates a corresponding stack
        int wordCount = 0;
        StringTokenizer tokenizer = new StringTokenizer (userString);
        while (tokenizer.hasMoreTokens())
        {
            wordCount++;
        }
        Stack reverseStack = new Stack(wordCount);
        //cuts up String into individual words
        String[] userArray = userString.split(" ");
        {
            
        }
       
        
              
        
        
        
    }
    
}
