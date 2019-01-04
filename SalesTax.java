/*
Sales Tax Program 
Jacob Steckel
Csc 141
*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class SalesTax
{  
      
   public static void main (String[]args)
   {
      String input;
      double amount;
      double countyTax=.02;
      double stateTax=.04;
      
      input = JOptionPane.showInputDialog("What is the amount of the purchase?");
      amount=Double.parseDouble(input);
            
      System.out.println("Amount of purchase $"+amount); 
      System.out.println("State sales tax = $"+(amount*stateTax));
      System.out.println("County sales tax = $"+(amount*countyTax));
      System.out.println("Total sales tax = $"+
                        (amount*(stateTax+countyTax)));
      System.out.println("Purchase with taxes = $"+
                        (amount+(amount*countyTax)+(amount*stateTax)));
      
      System.exit(0);

   }
}