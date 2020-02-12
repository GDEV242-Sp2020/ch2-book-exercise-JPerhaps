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
    
    private String author;
    private String title;
    public int pages;
    public String refNumber;
    int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPages, boolean immutable)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = false;
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
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void setRefNumber(String ref)
    {
        
        if(ref.length() >= 3)
        {
            refNumber = ref;
            
        }
        else
        {
            System.out.println("Reference number must be at least 3"
            + " charaters");
        }
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
    
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author 
            + ", Pages: " + pages);
            
        System.out.println(title + " has been borrowed " + borrowed + "times");
    
        if(refNumber.length() != 0)
            {
                System.out.println("Reference number: " + refNumber);
            }
        else
        {
            System.out.println("ZZZ");
        }
        System.out.println(title + " has been borrowed " + borrowed + "times");
        
    }
}
