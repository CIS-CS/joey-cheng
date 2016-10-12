package page288_LinkedList;
/**
 * DoubleNode.java
 * From: http://www.ib-computing.com/java/datastructures/lists.html
 * @author Mr J (andrew jones?)
 * @version 20050208
 */
class DoubleNode
{
    // data member
    private String name;

    // The fields that links nodes together.
    private DoubleNode next = null;
    private DoubleNode prev = null;

    public DoubleNode()
    {
        // default constructor, sets fields to null
        name = "no name";
    }
        
    public DoubleNode(String name)
    {
        // Second Constructor for a student record, assigns fields
        setName(name);
    }
        
    // accessor methods
    public String     getName(){ return name;}
    public DoubleNode getNext(){ return next;}
    public DoubleNode getPrev(){ return prev;}
    
    // modifier methods
    public void setName( String name )   {this.name = name;}
    public void setNext( DoubleNode name){this.next = name;}
    public void setPrev( DoubleNode prev){this.prev = prev;}
}





