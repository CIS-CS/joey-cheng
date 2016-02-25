package swingGUI;
/**
 * DoubleNode.java
 * From: http://www.ib-computing.com/java/datastructures/lists.html
 * @author Mr J (andrew jones?)
 * @version 20050208
 */
class DoubleNode
{
    // data member
    private String tapeName;
    private int tapeLength;
    private boolean lent;
    
    // The fields that links nodes together.
    private DoubleNode next = null;
    private DoubleNode prev = null;

    public DoubleNode()
    {
        // default constructor, sets fields to null
        tapeName = "no name";
    }
        
    public DoubleNode(String name)
    {
        // Second Constructor for a student record, assigns fields
        setName(name);
    }
    
    public DoubleNode (VideoTape tapes)
    {
        tapeName = tapes.getTitle();
        tapeLength = tapes.getLength();
        lent = tapes.isLent();
    }
    
    public int getLength()
    {
        return tapeLength;
    }
    
    public boolean getLent()
    {
        return lent;
    }
   
 
        
    // accessor methods
    public String     getName(){ return tapeName;}
    public DoubleNode getNext(){ return next;}
    public DoubleNode getPrev(){ return prev;}
    
    // modifier methods
    public void setName( String name )   {this.tapeName = tapeName;}
    public void setNext( DoubleNode name){this.next = name;}
    public void setPrev( DoubleNode prev){this.prev = prev;}
}





