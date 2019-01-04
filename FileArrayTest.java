//Jacob Steckel
import java.io.*;

public class FileArrayTest
{
   public static void main (String[]args)
   {
      int[]a={1,2,3,4,5};
      File f = new File("ArrayBinaryFile.dat");
      FileArray file = new FileArray();
      file.WriteArray(file,a);
      System.out.println("File Written: ");
      System.out.println();
      file.readArray(file,a);
   }
}      