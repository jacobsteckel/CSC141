//Jake Steckel
//Csc141-13
//Test Average Program

import java.util.Scanner;

public class TestAverage
{   
   public static void main(String[]args)
   {
      double avg;
      int num1,num2,num3,num4,num5;
      String input;
   
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter 5 test scores: ");
      num1=kb.nextInt();
      num2=kb.nextInt();
      num3=kb.nextInt();
      num4=kb.nextInt();
      num5=kb.nextInt();
      kb.nextLine();
      
      System.out.println(num1+" = "+determineGrade(num1));
      System.out.println(num2+" = "+determineGrade(num2));
      System.out.println(num3+" = "+determineGrade(num3));
      System.out.println(num4+" = "+determineGrade(num4));
      System.out.println(num5+" = "+determineGrade(num5));
 
      avg=calcAvg(num1,num2,num3,num4,num5);
      System.out.printf("The Average is: %.2f",avg);
   }
   
   public static char determineGrade(double g)
   {
      if(g>=90)
      return 'A';
      else if(g>=80)
      return 'B';
      else if(g>=70)
      return 'C';
      else if(g>=60)
      return 'D';
      else 
      return 'F';
   }
   
   public static double calcAvg(int g1,int g2,int g3,int g4,int g5)
   {
      double total=g1+g2+g3+g4+g5;
      total=total/5;
      return total;
   }
}