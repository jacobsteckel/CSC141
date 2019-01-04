// This is a simple Java program

public class ClockDemo
{
   public static class MyClock
   {
      //member fields or data
      private int hour;
      private int minute;
      private int second;
      private char ampm;
      
      public void setHour(int h)
      {
         hour = h;
      }
      public void setMinute(int m)
      {
         minute=m;
      }
      public void setSecond(int s)
      {
         second=s;
      }
      public void setAMPM(char ap)
      {
         ampm=ap;
      }
      
      public int getHour()
      {
         return hour;
      }
      public int getMinute()
      {
         return minute;
      }      
      public int getSecond()
      {
         return second;
      }      
      public char getAMPM()
      {
         return ampm;
      }
      public MyClock(int h,int m,int s,char ap)
      {
         hour=h;
         minute=m;
         second=s;
         ampm=ap;         
      }
      public MyClock()
      {
      
      } 
      public void display()
      {
         System.out.println("The time is: "+hour+":"+
                 minute+":"+second+" "+ ampm+"M");
      }
      public int secondsAfterMidnight()
      {
         int total=0;
         
         switch(ampm)
         {
            case 'A':
            {
               total=hour*60*60+minute*60+second;
               break;
            }
            case 'P':
            {
               if(hour==12)
                  total=hour*60*60+minute*60+second;
               else 
                  total=12*60*60+hour*60*60+minute*60+second;
               break;
            }
         }
         return total;
      }
           
   }
   public static void main(String[] args)
   {
      MyClock c1 = new MyClock(3,1,50,'P');
      c1.display();
      System.out.println("Seconds after midnight: "+c1.secondsAfterMidnight());
      MyClock c2 = new MyClock();
      c2.setHour(8);
      c2.setMinute(25);
      c2.setSecond(12);
      c2.setAMPM('A');
      c2.display();
   }
}
