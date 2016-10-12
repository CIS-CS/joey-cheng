package page288_LinkedList;
/**
 * FileNode.java
 * 
 * @author Mr J 
 * @version 2005-02-10
 */
class FileNode
{	
    /* The node could be used to hold a key and an address in an RAF.
       If using text files, the node could contain a position/line in the
       text file.
       It could also be used to access data stored in an array by storing
       the element number.
    */
    private String     name;
    private long       filePos;
    private FileNode   next;

    // Default constructor, sets fields to null
    public FileNode( )
    {        
        name =  null;
        filePos = -1;
        next = null;
    }

    // 3-arg Constructor for a student record, assigns fields
    public FileNode(String name, long filePos, FileNode next)
    {        
        this.name = name;
        this.filePos = filePos;
        this.next = next;
    }

    // Accessor methods
    public String getName() {return name;}
    public FileNode getNext() {return next;}
    public long getFilePos() {return filePos;}

    // Modifier methods
    public void setName( String name ) {this.name = name;}
    public void setNext( FileNode next) {this.next = next;}
    public void setFilePos( long filePos ) {this.filePos = filePos;}
}




