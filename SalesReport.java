import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class SalesReport
{
   public static void main (String[]args)throws IOException

   {
      final int NUM_DAYS=5;
      String fileName;
      double totalSales,averageSales;
      
      fileName=getFileName();
      totalSales=getTotalSales(fileName);
      averageSales=totalSales/NUM_DAYS;
      displayResults(totalSales,averageSales);
      
      System.exit(0);
   }
   
   public static String getFileName()
   {
      String file;
      file=JOptionPane.showInputDialog("Enter file name");
      return file;
   }
   
   public static double getTotalSales(String fileName)throws IOException
   {
      double total=0.0;
      double sales;
      
      File file =new File(fileName);
      Scanner inputFile=new Scanner(file);
      
      while(inputFile.hasNext())
      {
         sales=inputFile.nextDouble();
         total+=sales;
      }
      inputFile.close();
      return total;
   }
   
   public static void displayResults(double total, double avg)
   {
      JOptionPane.showMessageDialog(null, 
      String.format("The total sales is $%,.2f\n"+
                    "The average is $%,.2f",total,avg));
   }
}