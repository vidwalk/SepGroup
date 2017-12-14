import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.Serializable;
/**
 * A static class for file handling
 * @author IT-1V-A17-Group2
 */
public final class FileHandler  implements Serializable
{

   public static File eventFile;
   public FileHandler()
   {
      eventFile = new File("events.bin");
   }
   public static void saveMembersMailsToDoc(String membersEmails)
   {
      String filename = "membersEmails.txt";
      File file = new File(filename);
      try {
         PrintWriter out = new PrintWriter(file); // Open the file


               out.print(membersEmails);
               out.flush(); // Force it to write the text
               out.close(); // Close the file
               System.out.println("End writing data to file: " + file.getAbsolutePath());
      }
      catch(FileNotFoundException e)
      {

      }


   }

   public static void saveMembers(Member[] members)
   {
      ObjectOutputStream out = null;
      try
      {
      File file = new File("members.bin");
      FileOutputStream fos = new FileOutputStream(file, false);
      out = new ObjectOutputStream(fos);
      System.out.println("Saving to a file");
      for(int i=0;i<members.length;i++)
      {
         out.writeObject(members[i]);
      }

      }
      catch(IOException e)
      {
         e.printStackTrace();
      }

      finally
      {
      try
      {
      out.close();
      }
      catch (IOException e)
      {
      e.printStackTrace();
      }
      }
   }

   public static void saveMember(Member member)
   {
      ObjectOutputStream out = null;
      try
      {
      File file = new File("members.bin");
      FileOutputStream fos = new FileOutputStream(file);
      out = new ObjectOutputStream(fos);

         out.writeObject(member);

      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
      try
      {
      out.close();
      }

      catch (IOException e)
      {
      e.printStackTrace();
      }
      }
   }
// get members array

  public static Member[] getMembers()
  {
     ArrayList<Object> membersList = new ArrayList<Object>();
     boolean cont = true;
     try{

        FileInputStream fis = new FileInputStream("members.bin");
        ObjectInputStream input = new ObjectInputStream(fis);

        while(cont){
           Object obj = input.readObject();
           if(obj != null)
              membersList.add(obj);
           else
              cont = false;
        }
     }catch(Exception e){
        //System.out.println(e.printStackTrace());
     }

     return membersList.toArray(new Member[membersList.size()]);

  }

   public static void saveEvents(Event[] events)
   {
      ObjectOutputStream out = null;
      try
      {

         FileOutputStream fos = new FileOutputStream("events.bin");
         out = new ObjectOutputStream(fos);

         for(int i=0;i<events.length;i++)
         {
            out.writeObject(events[i]);
         }

      }
      catch(IOException e)
      {
         e.printStackTrace();
      }

      finally
      {
         try
         {
            out.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
   }

   public static void saveEvent(Event event)
   {
      ObjectOutputStream out = null;
      try
      {

         FileOutputStream fos = new FileOutputStream("events.bin");
         out = new ObjectOutputStream(fos);

         out.writeObject(event);

      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            out.close();
         }

         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
   }

// get events array

   public static Event[] getEvents()
   {
      ArrayList<Object> eventsList = new ArrayList<Object>();
      boolean cont = true;
      try{

         FileInputStream fis = new FileInputStream("events.bin");
         ObjectInputStream input = new ObjectInputStream(fis);

         while(cont){
            Object obj = input.readObject();
            if(obj instanceof Event)
               eventsList.add(obj);
            else
               cont = false;
         }
            try
            {
               input.close();
            }

            catch (IOException e)
            {
               e.printStackTrace();
            }

      }catch(Exception e){
         //System.out.println(e.printStackTrace());
      }

      return eventsList.toArray(new Event[eventsList.size()]);

   }
}

