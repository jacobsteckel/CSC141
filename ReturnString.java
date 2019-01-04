//this is a method calling prgram which returns string

public class ReturnString 
{
   public static void main (String[]args)
   {
      String customerName;
      customerName=fullName("Jake","Steckel");
      System.out.println(customerName);
   }
   public static String fullName(String first, String last)
   {
      String name;
      name=first+" "+last;
      return name;
   }
}