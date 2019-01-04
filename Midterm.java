/*
Jacob Steckel
Csc141-13
Midterm
*/

import java.util.Scanner;
import java.io.*;

public class Midterm
{
   public static void main (String[]args)throws IOException
   {
      double totalLength=0;
      double totalLines=0;
      double avg=0.0;
            
      File myFile = new File("E:/MidtermA.txt");
      Scanner inputFile = new Scanner(myFile);
      String line;
      
      System.out.println("Names and Lengths");
      
      while(inputFile.hasNext())
      {
         line=inputFile.nextLine();
         System.out.println(line+":"+line.length());
         totalLength+=line.length();
         totalLines++;
      }
      avg=totalLength/totalLines;
      inputFile.close();
      
      System.out.println(String.format("Average Name Length: %,.1f",avg));
   }
}