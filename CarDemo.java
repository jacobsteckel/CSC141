public class CarDemo
{
   public static class Car
   {
      private int yearModel;
      private String make;
      private int speed;
      
      public Car(int ym, String m)
      {
         yearModel=ym;
         make=m;
         speed=0;
      }
      
      public String toString()
      {
         return yearModel+" "+make+": speed: "+speed;
      }
      
      public int getYearModel()
      {
         return yearModel;
      }
      public String getMake()
      {
         return make;
      }
      public int getSpeed()
      {
         return speed;
      }

      public void accelerate()
      {
         speed+=5;
         if (speed>65)
            speed=65;
      }
      
      public void brake()
      {
         speed-=5;
         if (speed<0)
            speed=0;
      }      
   }
   
   public static void main(String[] args)
   {
      Car subaru = new Car(2010,"Subaru");
      Car ford = new Car(2012,"Ford");
      
      int i;
      for (i=1;i<=5;i++)
      {
         subaru.accelerate(); ford.accelerate();
         //System.out.println(subaru.getSpeed());
         //System.out.println(subaru.toString());
         System.out.println(subaru);
         System.out.println(ford);
      }
      for (i=1;i<=5;i++)
      {
         subaru.brake();ford.brake();
         //System.out.println(subaru.getSpeed());
         System.out.println(subaru);
         System.out.println(ford);
      }
         
   }
}
