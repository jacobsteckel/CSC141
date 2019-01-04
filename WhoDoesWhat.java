import java.util.Random;

public class WhoDoesWhat
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
      public void rollDie()
      {
         Random rand = new Random();
         face = rand.nextInt(6)+1;
      }
      public void display()
      {
         System.out.println(face);
      }
   }

   public static void display(Die d)
   {
      System.out.println(d.getFace());
      d.display();
   }

   public static void main(String[] args)
   {
         Random rand = new Random();
         Die d = new Die();
         d.setFace(rand.nextInt(6)+1);
         System.out.println(d.getFace());
         d.display();
         display(d);
                 
      
   }
}
