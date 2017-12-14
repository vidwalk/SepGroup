
public class MainController
{
   EventList eventList;
   MemberList memberList;
   
   public MainController()
   {
      eventList = new EventList();
      memberList = new MemberList();
//      get members list from the file and pass them to the object
      Member[] membersArray = FileHandler.getMembers();
      for(int i=0; i<membersArray.length;i++)
      {
         memberList.addMember(membersArray[i]);
      }
   }
//   adding new member to array and saving whole array to a file
   public void createMember(Member member)
   {
      memberList.addMember(member);
      FileHandler.saveMembers(memberList.getMembersArray());
   }
   
   
   
   
}
