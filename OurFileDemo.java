//this is a file demo

import java.util.Scanner;
import java.io.*;

public class OurFileDemo
{
   public static void main (String[]args)throws IOException
   {
      PrintWriter outputFile = new PrintWriter("E:/Practice.txt");
      Scanner kb=new Scanner(System.in);
            
      outputFile.println("Go WCU!!!");
      outputFile.println("Go Csc141!!!");
      System.out.print("What is your third line? ");
      String thirdLine=kb.nextLine();
      outputFile.println(thirdLine);
      
      outputFile.close();
      
      File myFile = new File("E:/Practice.txt");
      Scanner inputFile = new Scanner(myFile);
      String line;
      //for(int i=1; i<=3; i++)
      while(inputFile.hasNext())
      {
         line=inputFile.nextLine();
         System.out.println(line);
      }
      inputFile.close();
   }
}