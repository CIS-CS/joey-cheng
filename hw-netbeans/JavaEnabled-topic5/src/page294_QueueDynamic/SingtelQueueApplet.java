package page294_QueueDynamic;

/**
 * This class uses the QueueAsArray class to demonstrate
 * the use of a queue. A service queue is modeled.
 * 
 * Author:   Richard Jones, UWCSEA, Singapore
 * Date:     May 2001      
 * Hardware: PII 333, 128 Mb RAM
 * Software: Visual Age for Java V2
 * 
 */
import java.applet.*;
import java.awt.*;   
import java.awt.event.*;

public class SingtelQueueApplet extends Applet implements ActionListener
{
    // UI objects
    Label greetLabel   = new Label("Serving You Better - That's Your Singtel!");
    Label nextLabel    = new Label("Next in queue:", Label.RIGHT);
    Label lengthLabel  = new Label("Queue length: ", Label.RIGHT);
    Label nameLabel    = new Label("Name: ", Label.RIGHT);
    Label phoneLabel   = new Label("Phone: ", Label.RIGHT);	
    Label messageLabel = new Label("System messages will appear here");

    TextField nextField   = new TextField("details of next person");
    TextField lengthField = new TextField("q length");
    TextField nameField   = new TextField(20);
    TextField phoneField  = new TextField(12);

    Button dispenseButton = new Button("Dispense ticket");
    Button nextButton     = new Button("Next customer");

    Panel infoPanel       = new Panel();
    Panel inputPanel      = new Panel();

    TextArea displayArea  = new TextArea( 10, 40);

    // The queue
    CustomerQueue q = new CustomerQueue();

    //-------------------------------------------------------------

    /**
     * SingtelQueue constructor comment.
     */
    public SingtelQueueApplet() {
        super();
    }

    /**
     * Initialize the UI
     */
    public void init()
    {
	add(greetLabel);

	infoPanel.setLayout( new GridLayout( 2, 2, 10, 10 ) );

	infoPanel.add(nextLabel);
	infoPanel.add(nextField);
	infoPanel.add(lengthLabel);
	infoPanel.add(lengthField);

	add(infoPanel);

	add(dispenseButton);
	add(nextButton);

	dispenseButton.addActionListener(this);
	nextButton.addActionListener(this);

	inputPanel.setLayout( new GridLayout( 2, 2, 10, 10 ) );

	inputPanel.add(nameLabel);
	inputPanel.add(nameField);
	inputPanel.add(phoneLabel);
	inputPanel.add(phoneField);

	add(inputPanel);
	add(messageLabel);

	add(displayArea);
}
    /**
     * User clicked on Dispense or Serve button
     */
    public void actionPerformed(ActionEvent e)
    {
	// Add and remove items from the customer queue
	
	if (e.getSource() == dispenseButton)
	{
	  dispense();	
	}
	else
	{
	  serve();
	}
	updateDisplay();
    }
    
    /**
     * Add a customer to the queue
     */
    public void dispense()
    {
	CustomerNode theCustomer; // new customer node
	String name, phone;

	// Get the text (and check if there is any)
	
	name  = nameField.getText();
	phone = phoneField.getText();
	
	if ( (name.length() == 0) || (phone.length() == 0) )
	{
            messageLabel.setText("Enter name and phone details");
	}
	else
	{
            try // try to enqueue the details
            {
                theCustomer = new CustomerNode(name, phone, null);
                q.enqueue(theCustomer);
                lengthField.setText("" + q.size());
                messageLabel.setText("Customer added");
            }
            catch (QueueFullException qfe)
            {
                messageLabel.setText(qfe.getMessage());
            }
	}
	
	// clear the input boxes
	nameField.setText("");
	phoneField.setText("");
    }    
    
    /**
     * Method to dequeue users as they are served
     */
    public void serve()
    {
	CustomerNode temp;
	
	// next customer button was pushed

	try // to get the front item
	{
            temp = q.dequeue();
            nextField.setText(temp.getName());
            lengthField.setText("" + q.size());
            messageLabel.setText("OK");
	}
	catch (QueueEmptyException qee)
	{
            messageLabel.setText(qee.getMessage()); // no queue
            nextField.setText("");
            phoneField.setText("");
	}
    }
    
    /**
     * Method to display the queue
     */
    void updateDisplay()
    {
	CustomerNode temp = q.front();
	int i = 0;

	displayArea.setText("");
	
	if (q.isEmpty())
	{
            displayArea.setText("Nobody waiting...\n");
	}
	else
	{
            do
            {
                displayArea.append("" + ++i + ": " + temp.getName()
                                  + " " + temp.getPhone() + "\n");
                //temp = q.getNext(temp);
                temp = temp.getNext();
            }
            while (temp != null);
	}
    }
}

