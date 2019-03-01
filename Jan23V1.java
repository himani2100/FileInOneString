/*
Himani Raval
January 23, 2019
*/

import java.util.*;
import java.io.*; //for the exceptions
import java.nio.file.*; //to read from from
import java.nio.charset.*;

public class FileInOneString
{
   public static void main(String[] args) throws IOException
   {
      try
      {
         if (args.length != 1) //in case arguments were too many or too less
         {
            System.out.println("Wrong Execution format");
            System.out.println("\"java FileInOneString inputfile.txt \"");
            System.exit(100);
         }
         String data = new String(Files.readAllBytes(Paths.get(args[0])), StandardCharsets.UTF_8);
         //save to string
         //file opens file and reads byte by byte
         //Paths will get the txt file
         System.out.println(data); //print file to screen
         /*
         file will be printed as is.
         Output similar to when used cat inputfile.txt
         */
      }

      catch (FileNotFoundException f)
      {//in case file doesn't exist
         System.out.println("File Couldn't be found");
      };
   }
}
