/*
Internet Service Provider
Jake Steckel
Csc141-05
*/

import javax.swing.JOptionPane;

public class InternetServiceProvider
{
   public static void main(String [] args)
   {
      String input;
      int pack;
      int hours;
      double total=0.0;
      
      input = JOptionPane.showInputDialog("What package did you purchase? "+
                                          "Enter 1 for pack A, 2 for pack B, or 3 for pack C?");
      pack= Integer.parseInt(input);
       
      input = JOptionPane.showInputDialog("How many hours did you work this week?");
      hours= Integer.parseInt(input);
      
      switch(pack)
      {
         case 1:
         {
            if(hours>10)
               hours=hours-10;
            total=total+9.95+(hours*2);
         }
         break;
         
         case 2:
         {
            if(hours>20)
               hours=hours-20;
            total=total+13.95+(hours);
         }       
         break;
         
         case 3:
         {
            total=total+19.95;
         }  
      }
      JOptionPane.showMessageDialog(null,"Your total is $"+total);

      System.exit(0);
   }
}