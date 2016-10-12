package page292_StackDynamic;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * An Applet that prompts user for their name, then displays the string
 * in reverse.
 * Uses a stack, implemented in a singly-linked list.
 *
 * @author Mr J. Cleaned up by MHayes.
 * @version 20050211
 * @see ReverseMeStack
 * @see ReverseMeNode
 */
public class ReverseMeApplet extends Applet implements ActionListener
{
    // GUI components
    private TextField name   = new TextField("Type your name");
    private Button    button = new Button("Reverse Me");
    private Label     result = new Label("The result will appear here.");

    // The stack for holding the user string
    ReverseMeStack stack = new ReverseMeStack();

    /** 
     * Add GUI components to the Applet.
     */
    @Override
    public void init()
    {
        add(name);
        add(button);
        add(result);
        // Causes button presses to be detected
        button.addActionListener(this);
        name.selectAll();
    }
    
    /** 
     * Called when user presses the button.
     * 
     * @param e carries details about the event that occurred
     */
    public void actionPerformed(ActionEvent e)
    {
        // Get the string from user
        String text = name.getText();

        // Push each character on to the stack
        for (int i = 0; i < text.length(); i++)
        {
            stack.push(text.charAt(i));
        }

        //  Pop each character and append to ther output string
        String reverse = "";
        try {
            while (!stack.isEmpty())
            {
                reverse = reverse + stack.pop();
            }
            result.setText(reverse);
        }
        catch(Exception error) {
            result.setText(error.getMessage());
        }
    }
}

