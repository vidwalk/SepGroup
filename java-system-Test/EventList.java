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

	/**
	 * Return an ArrayList for all events
	 * 
	 * @author IT-1V-A17-Group2
	 */
   public ArrayList<Event> getEvent()
   {
      return event;
   }
	/**
	 * Return an array for all events
	 * 
	 * @author IT-1V-A17-Group2
	 */
   public Event[] getArrayEvent()
   {
      if (event.size() > 0)
         return event.toArray(new Event[event.size()]);
      else
         return null;
   }
	/**
	 * Create or change the event list
	 * 
	 * @author IT-1V-A17-Group2
	 */
   public void setEvent(ArrayList<Event> event)
   {
      this.event = event;
   }
	/**
	 * Add an created event to the ArrayList of events
	 * 
	 * @author IT-1V-A17-Group2
	 */
   public void createEvents()
   {
      Event createEvent = new Event();
      event.add(createEvent);
   }
	/**
	 * Add an event to the ArrayList of events
	 * 
	 * @author IT-1V-A17-Group2
	 */
   public void addEvents(Event event)
   {
      this.event.add(event);
   }
	/**
	 * Remove an event in the ArrayList of events
	 * 
	 * @author IT-1V-A17-Group2
	 */
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
	/**
	 * Search an event by giving the category
	 * 
	 * @author IT-1V-A17-Group2
	 */
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
	/**
	 * Search for not finalized events
	 * 
	 * @author IT-1V-A17-Group2
	 */
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
	/**
	 * Search for finalized events
	 * 
	 * @author IT-1V-A17-Group2
	 */
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
	/**
	 * Writing a list of lecturers which has a certain category in the file
	 * 
	 * @author IT-1V-A17-Group2
	 */
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
	/**
	 * Writing a list of sponsors which has a certain category in the file
	 * 
	 * @author IT-1V-A17-Group2
	 */
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
	/**
	 * Return an event by giving the name
	 * 
	 * @author IT-1V-A17-Group2
	 */
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
	/**
	 * Return the last event in the ArrayList
	 * 
	 * @author IT-1V-A17-Group2
	 */
   public Event getLastEvent()
   {
      return event.get(event.size() - 1);
   }
	/**
	 * Return the position of an event in the ArrayList
	 * 
	 * @author IT-1V-A17-Group2
	 */
   public int searchIndex(Event event)
   {
      for (int i = 0; i < this.event.size(); i++)
      {
         if (this.event.get(i).equals(event))
            return i;
      }
      return -1;
   }
	/**
	 * Return all events in a passage
	 * 
	 * @author IT-1V-A17-Group2
	 */
   @Override
   public String toString()
   {
      return "List of Events [event=" + event + "]";
   }
}