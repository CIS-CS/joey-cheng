/**
 *  Double-linked list
 *  Uses DoubleList, which uses DoubleNode
 */
package page288_LinkedList;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 * Demonstrates use of a doubly-linked list
 * @author Mr J
 * @version 2005.02.08
 */
public class DoubleListApplet extends Applet implements ActionListener
{
    // GUI objects
    private TextField name = new TextField("Type a name here!");
    private Button    insertTail = new Button("Insert Tail");
    private Button    insertHead = new Button("Insert Head");
    private TextArea  display = new TextArea(15, 30);

    DoubleList names = new DoubleList();
    
    /** 
     * Add GUI components to the Applet
     */
    public void init()
    {
        // Add GUI components
        add(name);
        add(insertTail);
        add(insertHead);
        add(display);

        // Add action listeners
        insertTail.addActionListener(this);
        insertHead.addActionListener(this);
    }
        
    /** 
     * When an event occurs on an object with an ActionListener attached, this
     * method is carried out.  
     * 
     * @param e carries details about the event that occurred
     */
    public void actionPerformed(ActionEvent e)
    {
        // get the name and create a new node at the head
        String theName = name.getText();
        DoubleNode node = new DoubleNode(theName);

        // Check the button presses
        if (e.getSource() == insertHead)
        {
            names.insertHead(node);
        }
        else if (e.getSource() == insertTail)
        {
            names.insertTail(node);
        }
        display.setText(names.toString());
    }        
}






