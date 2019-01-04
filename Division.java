import java.util.Scanner;

public class Division
{ 
      
   public static void main (String[]args)
   {
      double num1, num2, quotient;
      
      Scanner keyboard=new Scanner(System.in);  
      
      System.out.print("Enter a number: ");
      num1=keyboard.nextDouble();
      
      System.out.print("Enter another number: ");
      num2=keyboard.nextDouble();
      
      if(num2==0)
      {
         System.out.println("Don't divide by 0");
         System.out.println("Run again");
      }
      else
      {
         quotient=num1/num2;
         System.out.println("Quotient= "+quotient);
      }
   }
}