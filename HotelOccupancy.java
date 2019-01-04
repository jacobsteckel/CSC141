/*
Jacob Steckel
Hotel Occupancy Program
CSC141-13
*/
import javax.swing.JOptionPane;

public class HotelOccupancy
{
   public static void main (String[]args)
   {
      String input;
      int numFloors, numRooms, numOccupied, totalRooms, totalVacant;
      double occupancyRate;
      
      do
      {
         input=JOptionPane.showInputDialog("How many floors? (1 or more)");
         numFloors=Integer.parseInt(input);
      }
      while(numFloors<1);
      
      do
      {
         input=JOptionPane.showInputDialog("How many rooms on each floor? (10 or more)");
         numRooms=Integer.parseInt(input);
      }
      while(numRooms<10);
      
      totalRooms=(numFloors*numRooms);
      
      do
      {
         input=JOptionPane.showInputDialog("How many rooms are occupied?(0 to Total Rooms)");
         numOccupied=Integer.parseInt(input);
      }
      while(numOccupied<1||numOccupied>totalRooms);
      
      occupancyRate=(double)numOccupied/totalRooms;
      int occupancyPercent=(int)(occupancyRate*100);
      
      totalVacant=(totalRooms-numOccupied);      

      JOptionPane.showMessageDialog(null, "Total Rooms: "+totalRooms+
                    ", Total Occupied: "+numOccupied+
                    ", Total Vacant:  "+totalVacant+
                    ", Occupancy Rate: "+occupancyRate+
                    ", Occupancy Percent: "+occupancyPercent+"%");   
      
      System.exit(0);    
        
      }
}