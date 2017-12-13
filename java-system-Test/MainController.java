
public class MainController
{
   EventList eventList;
   MemberList memberList;

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
// adding new member to array and saving whole array to a file
 public void createMember(Member member)
 {
    memberList.addMember(member);
    FileHandler.saveMembers(memberList.getMembersArray());
 }

 public String listMembers()
 {
    return memberList.toString();
 }

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



   public void createEvent()
   {
      eventList.createEvents();
      FileHandler.saveEvents(eventList.getArrayEvent());
      System.out.println("event created");
   }

   // removes an event and saves the events again
   public void removeEvent(String name)
   {
      eventList.removeEvents(eventList.searchEvent(name));
      System.out.println("event removed");
   }

   // search for an event
   public Event searchEvent(String name)
   {
      return eventList.searchEvent(name);
   }

   // modify an event

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
         // TODO Auto-generated catch block
         System.out.println("no event found");
      }
      FileHandler.saveEvents(eventList.getArrayEvent());
   }

}
