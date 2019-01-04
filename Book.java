/** Class representing a book. */
public class Book 
{
   private String author = new String("none");
   private String title = new String("no title");
   protected int pages = 0;
   protected double price = 0.0;
   
   public Book() 
   {
   }
   public Book(String theAuthor, String theTitle, int thePages,
         Double thePrice)
   {
      author = theAuthor;
      title = theTitle;
      pages = thePages;
      price = thePrice;
   }
   public String getAuthor() 
   {
      return author;
   }
   public void setAuthor(String theAuthor) 
   {
      author = theAuthor;
   }
   public String getTitle() 
   {
      return title;
   }
   public void setTitle(String theTitle) 
   {
      title = theTitle;
   }
   public int getPages() 
   {
      return pages;
   }
   public void setPages(int thePages) 
   {
      pages = thePages;
   }

   public double getPrice() 
   {
      return price;
   }
   
   public void setPrice(double thePrice) 
   {
      price = thePrice;
   }   
   public String toString() 
   {
      return ("Author: " + author +  "\nTitle: " + title
            + "\nPages: " + pages + "\nPrice: " + price);
   }
}
