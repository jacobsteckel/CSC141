//this is a simple java program

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ConsecutiveNums
{
   public static void main (String[]args)
   {
      int num, total;
      total=0;
      String input;
      int quantity;
      int yesOrNo;
      Scanner keyboard=new Scanner(System.in);
      
      do
      {
         input=JOptionPane.showInputDialog("How many numbers?");
         quantity=Integer.parseInt(input);
         
         for(num=1;num<=quantity;num++)
         {
            total+=num;
            System.out.println(total);
         }
         JOptionPane.showMessageDialog(null, "The total is "+total);
         System.out.println("Try again -1 to quit");
         yesOrNo=keyboard.nextInt();
      }
      while(yesOrNo!=-1);
         System.exit(0);
   }
}