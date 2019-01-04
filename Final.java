/*
Jacob Steckel
CSC141-05
Final
*/

import java.util.Scanner;
import java.io.*;

public class Final
{
   public static void main(String[] args) throws IOException
   {
      //declare data
      double price;
      int quantity;
      String name;
      char TorN;
      //set up the file
      File file = new File("E:/ItemsPurchased.txt");
      Scanner inputFile = new Scanner(file);
      String line;
      //skip first 4 lines of the file - they are just comments!
      inputFile.nextLine();
      inputFile.nextLine();
      inputFile.nextLine();
      inputFile.nextLine();
      while(inputFile.hasNext())
      {
         line=inputFile.nextLine();
      }
      //now get the purchase information for each item
         //get name
         //get details
         //clear newline char
         //print for each item
      //print totalCost
      System.out.println(String.format("    Jacket " +findCost('N',59.95,1)+"\n"+
                                       "     Shirt " +findCost('N',25.49,2)+"\n"+
                                       "Snack Pack " +findCost('T',2.00,6)+"\n"+
                                       "Cookie Box " +findCost('T',3.75,3)));
   }   
   
   public static double findCost(char tn,double pr,int qty)
   {
      pr*=qty;
      if(pr>=50.00)
      pr=pr-5;
      if(tn=='T')
      pr=pr*1.06;
      else
      pr=pr;
      return pr;
   }
   
   public static void finalMessage(double fc)
   {
      System.out.println(String.format("Final coast is $"+fc));
   }
   
}
