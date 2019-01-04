//this is a format pratice program

public class FormatPractice
{
   public static void main (String[]args)
   {
      double num1 = 12345.678;
      double num2 = 54.321;
      
      System.out.printf("The number is %f",num1);
      System.out.println("");
      System.out.printf("The number is %.2f",num1);
      System.out.println("");
      System.out.printf("The amount is $%,.2f",num1);
      System.out.println("");
      System.out.printf("The numbers are %f and %f",num1,num2);
      System.out.println("");
      System.out.printf("%,15.2f\n",num1);
      System.out.printf("%,15.2f\n",num2);
      
   }
}