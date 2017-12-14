 /**
    * Class that manages the main methods used in the GUI
    *
    * @author IT-1V-A17-Group2
    */
public class MainController
{
   EventList eventList;
   MemberList memberList;


   /**
    * The constructor in which the EventList and MemberList objects are created
    *@author IT-1V-A17-Group2
    */
   public MainController()
   {
      eventList = new EventList();
      memberList = new MemberList();
//    get members list from the file and pass them to the object
    Member[] membersArray = FileHandler.getMembers();
    for(int i=0; i<membersArray.length;i++)
    {
       memberList.addMember(membersArray[i]);
    }
   }

 /**
  * A method for adding a new member to an array and saving whole array to a file
 * @author IT-1V-A17-Group2
 */
public void createMember(Member member)
 {
    memberList.addMember(member);
    FileHandler.saveMembers(memberList.getMembersArray());
 }

 /**
  * A method to return the a string of all the members
 * @author IT-1V-A17-Group2
 */
public String listMembers()
 {
    return memberList.toString();
 }

 /**
  * A method to return a string of the member's email
 * @author IT-1V-A17-Group2
 */
public String listMembersByEmails()
 {
    String namesAndEmails="";
    Member[] members = memberList.getMembersArray();
    for(int i=0;i<members.length;i++)
    {
      namesAndEmails += members[i].getName()+" / "+members[i].getEmail()+"\n";
    }

    FileHandler.saveMembersMailsToDoc(namesAndEmails);
    return namesAndEmails;

 }

 /**
  * A method to return a string of all the members by preference
 * @author IT-1V-A17-Group2
 */
public String listMembersByPreference(String preference)
 {
    String namesAndEmails="By "+preference+": \n";
    Member[] members = memberList.getMembersArray();
    for(int i=0;i<members.length;i++)
    {

       if(members[i].getCategory().equalsIgnoreCase(preference))
       {
          namesAndEmails += members[i].getName()+" / "+members[i].getEmail()+"\n";
       }
    }

    return namesAndEmails;
 }

 /**
  *  A method to return a string of all the members that did not pay the annual fee
 * @author IT-1V-A17-Group2
 */
public String listMembersIfNotPaid()
 {
    String namesAndEmails="These members have not paid this year's fee: \n";
    Date date = new Date();
    Member[] members = memberList.getMembersArray();
    for(int i=0;i<members.length;i++)
    {

       if(members[i].getYearPayment() != date.getYear())
       {
          namesAndEmails += members[i].getName()+" / "+members[i].getEmail()+" / Year of last payment: "+members[i].getYearPayment()+"\n";
       }
    }

    return namesAndEmails;
 }

 /**
  * A method to select a member by a string
 * @author IT-1V-A17-Group2
 */
public Member selectMemberByName(String name)
 {
    Member[] members = memberList.getMembersArray();
    for(int i=0;i<members.length;i++)
    {
       if(name.equalsIgnoreCase(members[i].getName()))
       {
          return members[i];
       }

    }
    return null;
 }

 /**
  * A method to remove a member by a string
 * @author IT-1V-A17-Group2
 */
public void removeMember(String name)
 {
    Member[] members = memberList.getMembersArray();
    for(int i=0;i<members.length;i++)
    {
       if(name.equalsIgnoreCase(members[i].getName()))
       {
          memberList.removeMember(i);
       }

    }
    FileHandler.saveMembers(memberList.getMembersArray());
 }


   /**
    * A method that creates an event and saves it to a file
    * @author IT-1V-A17-Group2
    */
   public void createEvent()
   {
      eventList.createEvents();
      FileHandler.saveEvents(eventList.getArrayEvent());
      System.out.println("event created");
   }

   // removes an event and saves the events again
   /**
    * A method that removes an event and saves all the events again to a file
    * @author IT-1V-A17-Group2
    */
   public void removeEvent(String name)
   {
      eventList.removeEvents(eventList.searchEvent(name));
      System.out.println("event removed");
   }

   /**
    * A method that searches for a event by a string
    * @author IT-1V-A17-Group2
    */
   public Event searchEvent(String name)
   {
      return eventList.searchEvent(name);
   }

   // modify an event

   /**
    * A method that modifies an event and saves every event to a file
    * @author IT-1V-A17-Group2
    */
   public void modifyEvent(Event event, String name, String nrParticipants,
         String day, String month, String year, String nrMembers, String length,
         String discount, boolean finalized, String type, boolean vegan,
         String location, String feedback, String lecturerName,
         String lecturerEmail, boolean lecturerPaidFor, String lecturerCategory,
         String sponsorName, String sponsorEmail, String sponsorCategory)
   {
      int numberParticipants = Integer.parseInt(nrParticipants);
      Date dayStart = new Date(Integer.parseInt(day), Integer.parseInt(month),
            Integer.parseInt(year));
      int numberMembers = Integer.parseInt(nrMembers);
      int nrdiscount = Integer.parseInt(discount);
      Lecturer lecturer = new Lecturer(lecturerName, lecturerEmail, lecturerPaidFor,
            lecturerCategory);
      Sponsor sponsor = new Sponsor(sponsorName, sponsorEmail, sponsorCategory);
      try
      {
         eventList.getEvent().get((eventList.searchIndex(event))).setEvent(name,
               numberParticipants, dayStart, numberMembers, length, nrdiscount,
               finalized, type, vegan, location, feedback,
               lecturer, sponsor);
      }
      catch (IndexOutOfBoundsException e)
      {
         System.out.println("no event found");
      }
      FileHandler.saveEvents(eventList.getArrayEvent());
   }

}
