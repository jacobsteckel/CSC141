//this is random number adding demo

import java.util.Scanner;
import java.util.Random;

public class randomDemo
{
   public static void main (String[]args)
   { 
      int num1, num2, sum, userAnswer;
      
      Scanner keyboard = new Scanner (System.in);
      Random randomNum = new Random();
      
      num1=randomNum.nextInt(100);
      num2=randomNum.nextInt(100);
      
      System.out.println("What is "+num1+" + "+num2+"? ");
      
      sum=num1+num2;
      
      userAnswer=keyboard.nextInt();
      
      if(userAnswer==sum)
         System.out.println("Correct!");
      else
         System.out.println("Incorrect, the answer is "+sum+"!");
   }
}