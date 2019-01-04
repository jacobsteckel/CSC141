//this program elements a switch demo

import java.util.Scanner;

public class SwitchDemo
{ 
      
   public static void main (String[]args)
   {
      int num;
            
      Scanner keyboard=new Scanner(System.in);  
      
      System.out.println("Enter 1, 2, or 3.");
      num=keyboard.nextInt();
      
      switch(num)
      {
         case 1:
         System.out.print("You entered a 1.");
         break;
         
         case 2:
         System.out.print("You entered a 2.");
         break;

         case 3:
         System.out.print("You entered a 3.");
         break;

         default:
         System.out.print("That's not a 1, 2, or 3!");
         break;

      }
   }
}