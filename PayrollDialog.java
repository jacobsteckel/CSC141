/*
Pay roll dialog
Jake Steckel
*/

import javax.swing.JOptionPane;

public class PayrollDialog
{
   public static void main(String [] args)
   {
      String inputString,name;
      int hours;
      double payrate, grosspay;
      
      name = JOptionPane.showInputDialog("What is your name?");
      inputString = JOptionPane.showInputDialog("How many hours did" +
                                                "you work this week?");
      hours= Integer.parseInt(inputString);
      
      inputString= JOptionPane.showInputDialog("What is your pay rate?");
      payrate= Integer.parseInt(inputString);
      
      grosspay=hours*payrate;
      
      JOptionPane.showMessageDialog(null,"Hello, "+name+". Your grosspay is $"+grosspay);

      System.exit(0);
   }
}