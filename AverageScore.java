//program demonstates the if statement

import javax.swing.JOptionPane;

public class AverageScore
{
   public static void main (String[]args)
   {
      double score1, score2, score3, average;
      String input;
      
      input=JOptionPane.showInputDialog("Enter score #1");
      score1=Double.parseDouble(input);
      
      input=JOptionPane.showInputDialog("Enter score #2");
      score2=Double.parseDouble(input);
      
      input=JOptionPane.showInputDialog("Enter score #3");
      score3=Double.parseDouble(input);
            
      average=(score1+score2+score3)/3;
      
      JOptionPane.showMessageDialog(null,"Average is: "+average);
      
      if(average<75)
         JOptionPane.showMessageDialog(null,"Bad Score!");
      else if(average>=75&&average<85)
         JOptionPane.showMessageDialog(null,"Okay Score");
      else if(average>=85&&average<95)
         JOptionPane.showMessageDialog(null,"Good Score!");
      else if(average>=95)
         JOptionPane.showMessageDialog(null,"Great Score!");
      
      System.exit(0);
      
   }
}