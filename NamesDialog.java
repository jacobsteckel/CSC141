/*
Names Dialog Program
Jake Steckel
*/
import javax.swing.JOptionPane;

public class NamesDialog
{
   public static void main (String[] args)
   {
      String first, middle, last;
      
      first = JOptionPane.showInputDialog("What is your first name?");
      middle = JOptionPane.showInputDialog("What is your middle name?");
      last = JOptionPane.showInputDialog("What is your last name?");
      
      JOptionPane.showMessageDialog(null, "Hello, " +first+ " " +middle+ " " +
                                    last+ "!");
                                    
      System.exit(0);
   }
}