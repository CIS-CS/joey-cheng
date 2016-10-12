/**
 *  Singly-linked list
 *  Uses SingleNode
 */
package page288_LinkedList;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 * Demonstrates use of a singly-linked list, maintained in order
 *
 * @author Mr J
 * @version 2005-02-11
 */
public class FileListApplet extends Applet implements ActionListener
{
    // GUI objects
    private TextField name = new TextField("Type a name here!");
    private Button add = new Button("Add name");
    private TextArea display = new TextArea(20, 30);
    private Label messages = new Label("Messages will appear here");

    // data members
    FileNode tail = null;
    long pos = 0; 
    
    /** 
     * Add objects to the Applet
     */
    public void init()
    {
        add(name);
        add(add);
        add(display);
        add(messages);
        // Causes button presses to be detected
        add.addActionListener(this);
    }
        
    /** 
     * When an event occurs on an object with an ActionListener attached, this
     * method is carried out.  
     * 
     * @param e carries details about the event that occurred
     */
    public void actionPerformed(ActionEvent e)
    {
        messages.setText("");
        addName();
    }
        
    /** 
     * Add name in correct position in the list
     */
    public void addName()
    {
        // get the name and create a new node at the head
        // We'll just increment pos - could  hold the pos of this record 
        // or block of records in a partially indexed file
        String theName = name.getText();
        pos = pos + 1;
        FileNode newOne = new FileNode( theName, pos, null);
        // Need to link this node into the existing list
        // First check if the list is empty
        if (tail == null)
        {
            tail = newOne;
            newOne.setNext(newOne);  // if only one node, it points to itself
        }
        else
        {
            FileNode temp = tail.getNext();                    // head node
            int result = theName.compareTo(temp.getName());    // name at head
            if (result < 0)
            {
                // Name belongs at the head
                addAtHead(newOne);
            }
            else
            {
                // traverse to entry point
                FileNode prev = temp;   // we'll need a reference to the previous node
                boolean found = false;  // insertion point found flag
                boolean atTail = false; // insert at tail flag

                while ( (!found) && (!atTail) )
                {
                    prev = temp;
                    temp = temp.getNext();
                    atTail = (temp == tail);
                    found = (theName.compareTo(temp.getName()) < 0); 
                }	            
                if (found)
                {
                addInMiddle(newOne, prev, temp);
                }
                else if (atTail)
	            {
	                addAtTail(newOne);
	            }	        
	        }
	    }
	    displayList();
	}
    
    /** 
     * Display the list of names
     */
    public void displayList()
    {
        if (tail == null)
        {
            display.setText("empty list");
        }
        else
        {
            display.setText("start\n-----\n");
            FileNode temp = tail;
            boolean completed = false;
            // "walk" round the list, using the temp pointer
            while (!completed)
            {
                temp = temp.getNext(); // first time this will be the head
                display.append(temp.getName()  + " temp " + temp.getFilePos() + "\n");
                completed = (temp == tail); // check have we been all the way round
            }
        }
    }
        
    /** 
     * Adds a node to the tail end of the list
     * 
     * @param n the node to be added
     */
    private void addAtTail( FileNode n )
    {
        n.setNext(tail.getNext());
        tail.setNext(n);
        tail = n;
    }
        
    /** 
     * Adds a node to the head of the list
     * 
     * @param n the node to be added
     */
    private void addAtHead( FileNode n )
    {
        n.setNext(tail.getNext());
        tail.setNext(n);
    }
        
    /** 
     * Add a node in the middle of the list
     * 
     * @param n the node to be added
     * @param p the node before the insertion point
     * @param t the node after the insertion point
     */
    private void addInMiddle( FileNode n, FileNode p, FileNode t )
    {
        n.setNext(t);
        p.setNext(n);
    }
}







