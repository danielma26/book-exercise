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
    //2.85
    private int pages;
    //2.88
    private String ref = "";
    //2.91
    private int borrowed;
    //2.92
    private boolean courseText;
    
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        ref = refNumber;
        borrowed = 0;
        
    }
    
    //2.84
    public printAuthor(String bookAuthor)
    {
    system.out.println(bookAuthor);
    }
    
    
    public printTitle(String bookTitle)
    {
    system.out.println(bookTitle);
    }
    
    public getPage(int bookPages)
    {
    return (bookPages);
    }
    
    
    public getBorrowed (int borrowed)
    {
    return (borrowed);
    }
    
    
   public setRefNumber (String ref)
   {
       if refNumber.length=!0
           
           
           system.out.println("ZZZ");
       
       else 
           system.out.println("refNumber");
   }
      
    public isCoursetext (boolean courseText)
        
    {
        return (courseText)
    }

   public void increaseBorrowed()
   {
       borrowed += 1;
   }

    
   public void printDetails()
   {
       System.out.println(bookTitle + ", "+bookAuthor+", "+bookPages+", "+refNumber+ ", "+ borrowed+ " times.");
      
   }

    
    
}
