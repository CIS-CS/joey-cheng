package original;
/**
 * A class to store Video Tape data in an array
 * 
 * @author Richard 
 * @version 200903
 */
public class VideoStore
{
    static final int MAX_VIDEOS = 5;
    private VideoTape[] videoTapes = new VideoTape[MAX_VIDEOS];
    private int numVideos = 0;  // number of videos currently in collection
    
	public static void main(String[] args)
    {
        new VideoStore();
    }
	/**
	 * Constructor loops until command "quit" is used
	 */
	public VideoStore()
	{
	  char command;
	  do
	  {
	    command = getCommand();
	    doCommand(command);
	  }
	  while (command != 'q');
	}

	/**
	 * Method to get a valid command from the user
	 * 
	 * @return char, a valid command - either (a) add, (l) list or (q) quit
	 */	
	private char getCommand()
	{
	  String cs; // input command as a String
	  char ch;   // input commmand as a char
	  
	  // repeat until a valid command is entered
	  do
	  {
	    output("");
	    output("Would you like to: "); 
	    output("     (a)   add a video tape to the collection");
	    output("     (l)   list the tapes already in the collection");
	    output("     (q)   or quit the program");
	    output("");
	   cs = input("Your choice (a/l/q): ");
	    
	    // check if anything was input
	    if (cs.length() == 0)
	    {
	      output("Please enter a command!");
	      ch = 'n';
	    }
	    else
	    {
	      // check if the value input was a valid command
	      ch = cs.charAt(0);
	      if ( (ch != 'a') && (ch != 'q') && (ch != 'l') )
	      {
	        output("Please enter a valid command (a, l or q)!");
	        ch = 'n';
	      }
	    }
	  } while (ch == 'n');
	  return ch;
	}
	/**
	 * Method to add a video tape, more commands (search, lend, delete could be added)
	 *
	 *@param command char - the command to be carried out by this method
	 */	
	private void doCommand(char command)
	{
	// using an else if chain...
	
	  if (command == 'a')
	  {
	  // see how many videos are in the collection:
	    if (numVideos >= MAX_VIDEOS)
	    {
	      output("Sorry, no more videos can be stored");
	    }
	    else
	    {
	      videoTapes[numVideos] = getVideoDetails();
	      numVideos = numVideos + 1;
	    }
	  }
	  else if (command == 'l')
	  {
	    // loop through array
	     for(int x = 0; x < numVideos; x = x + 1)
	     {
	       output("" + x + ": " + videoTapes[x].toString());
	     }
	  }
	  else if (command == 'q')
	  {
	    output("Bye then");
	  }
	  else
	  {
	    output("Some internal error in doCommand()");
	  }
	}
	/**
	 * Method to get details of tape
	 *
	 *@return VideoTape - a video tape object (well, how neat!)
	 */	
	private VideoTape getVideoDetails()
	{
	  String title = input("Please enter the title of your video: ");
	  int length = inputInt("Please enter the length in minutes: ");
	  // We assume it is not yet lent
	  return new VideoTape(title, length, false);
	}
	/**
	 * IBIO methods, (c) International Baccalaureate 2003
	 * Computer Science Subject Guide, Appendix 2.
	 */
	
	 static void output(String info) {  System.out.println(info); }
     static void output(double info) {  System.out.println(info); }
     static void output(int info)    {  System.out.println(info); }
  
     static int inputInt(String Prompt)
     {  
         int result=0;
         try{result=Integer.parseInt(input(Prompt).trim());}
         catch (Exception e){result = 0;}
         return result;
     }
     static double inputDouble(String Prompt)
     {  
         double result=0;
         try{result=Double.valueOf(input(Prompt).trim()).doubleValue();}
         catch (Exception e){result = 0;}
         return result;
     }
     static String input(String prompt)
     {  
         String inputLine = "";
         System.out.print(prompt);
         try
         { 
             java.io.InputStreamReader sys = new java.io.InputStreamReader(System.in);
             java.io.BufferedReader inBuffer = new java.io.BufferedReader(sys);
             inputLine = inBuffer.readLine();
         }
         catch (Exception e)
         { 
             String err = e.toString();
             System.out.println(err);
         }
         return inputLine;
      }
      static String input() { return input("");  }
}