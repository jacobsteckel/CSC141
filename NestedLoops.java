//this is a program with nested loops

public class NestedLoops
{
   public static void main (String[]args)
   {
      int num1, num2;
      
      for(num1=1;num1<=100;num1++)
      {
         System.out.println("num1= "+num1);
         for(num2=1;num2<=100;num2++)
         {
            System.out.println(num1+" X "+num2+" = "+num1*num2);
         }
      }
   }
}