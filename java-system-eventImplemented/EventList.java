import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class EventList
{
   private File lecturerCategory = new File("lecturerCategory.txt");
   private File sponsorCategory = new File("sponsorCategory.txt");
   private Event[] eventArray = FileHandler.getEvents();
   private ArrayList<Event> event = new ArrayList<Event>(
         Arrays.asList(eventArray));

   public ArrayList<Event> getEvent()
   {
      return event;
   }

   public Event[] getArrayEvent()
   {
      if (event.size() > 0)
         return event.toArray(new Event[event.size()]);
      else
         return null;
   }

   public void setEvent(ArrayList<Event> event)
   {
      this.event = event;
   }

   public void createEvents()
   {
      Event createEvent = new Event();
      event.add(createEvent);
   }

   public void addEvents(Event event)
   {
      this.event.add(event);
   }

   public void removeEvents(Event event)
   {

      for (int index = 0; index < this.event.size(); index++)
      {
         if (this.event.get(index).equals(event))
         {
            this.event.remove(this.event.get(index));
         }
      }
      FileHandler.saveEvents(getArrayEvent());
   }

   public String searchByCategoryEvent(String category)
   {
      String string = "";
      // ArrayList<Event> other = new ArrayList<Event>();
      for (int index = 0; index < event.size(); index++)
      {
         if (event.get(index).getLecturer().getCategory().equals(category))
         {
            string = string + event.get(index);
         }
      }
      return string;
   }

   public String searchByNotFinalized()
   {
      String string = "";
      // ArrayList<Event> other = new ArrayList<Event>();
      for (int index = 0; index < event.size(); index++)
      {
         if (event.get(index).isFinalized() == false)
         {
            string = string + event.get(index);
         }
      }
      return string;
   }

   public String searchByFinalized()
   {
      String string = "";
      // ArrayList<Event> other = new ArrayList<Event>();
      for (int index = 0; index < event.size(); index++)
      {
         if (event.get(index).isFinalized() == true)
         {
            string = string + event.get(index);
         }
      }
      return string;
   }

   public void listByCategoryLecturer(String category)
   {
      PrintWriter fos = null;

      try
      {
         fos = new PrintWriter(lecturerCategory);

         for (int indexOne = 0; indexOne < event.size(); indexOne++)
         {
            if (event.get(indexOne).getLecturer().getCategory()
                  .equals(category))
               fos.println(event.get(indexOne).getLecturer().toString());

         }
      }
      catch (IOException o)
      {
         o.printStackTrace();
      }
      finally
      {
         fos.close();
      }
   }

   public void listByCategorySponsor(String category)
   {
      PrintWriter fos = null;

      try
      {
         fos = new PrintWriter(sponsorCategory);
         

         for (int indexOne = 0; indexOne < event.size(); indexOne++)
         {
            if (event.get(indexOne).getSponsor().getCategory().equals(category))
               fos.println(event.get(indexOne).getSponsor().toString());

         }
      }
      catch (IOException o)
      {
         o.printStackTrace();
      }
      finally
      {
         fos.close();
      }
   }

   public Event searchEvent(String name)
   {
      Event other = new Event();
      other.setName("no event found");
      Event[] event = FileHandler.getEvents();
      for (int i = 0; i < event.length; i++)
         if (event[i].getName().equals(name))
            return event[i];
      return other;
   }

   public Event getLastEvent()
   {
      return event.get(event.size() - 1);
   }

   public int searchIndex(Event event)
   {
      for (int i = 0; i < this.event.size(); i++)
      {
         if (this.event.get(i).equals(event))
            return i;
      }
      return -1;
   }

   @Override
   public String toString()
   {
      return "List of Events [event=" + event + "]";
   }
}
