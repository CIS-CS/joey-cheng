/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookCourseText;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public boolean setRefNumber (String ref)
    {
        if (ref.length() < 3 )
        return false;
        else
        {
            refNumber = ref;
            return true;
        }
       
    }
    
    public void borrow ()
    {
        borrowed++;
    }
   
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void printDetails()
    {
        if (refNumber.length() > 0)
        System.out.println(title + " " + "by" + " " + author + " " + "has" + " " + pages + " " + pages + " " + "with reference number" + " " + refNumber+ " " + ". There are currently" + "" + borrowed + " " + "books borrowed.");
        else
        System.out.println(author + title + pages + "ZZZ");
    }
    

    // Add the methods here ...
}
