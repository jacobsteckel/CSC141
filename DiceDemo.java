import java.util.Random;

public class DiceDemo
{
   public static class Die
   {
      private int face;
      
      public void setFace(int n)
      {
         face = n;
      }
      public int getFace()
      {
         return face;
      }
      public void RollDie()
      {
         Random rand = new Random();
         face=rand.nextInt(6)+1;
      }
   }
   public static void main (String[]args)
   {
      Die d1 = new Die();
      for(int i=1;i<=10;i++)
      {
         d1.RollDie();
         System.out.println(d1.getFace());
      }
   }
}