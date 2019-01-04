//this is a simple java program

public class ForExamples
{
   public static void main (String[]args)
   {
      int num;
      
      for(num=1;num<=10;num++)
         System.out.print(num+" ");
      System.out.println();

      for(num=100;num>=1;num--)
      {
         if(num%2==0)
         System.out.print(num+" ");
      }
      System.out.println();

   }
}