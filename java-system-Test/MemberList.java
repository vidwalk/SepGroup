import java.io.*;
import java.util.ArrayList;

public class MemberList
{
  ArrayList<Member> members;
  
  

  public MemberList()
  {
     members = new ArrayList<>();
     
  }
  
  public void addMember(Member member)
  {
     members.add(member);
  }
  
  public void removeMember(int index)
  {
     members.remove(index);
  }
  
  public Member[] getMembersArray()
  {
     
     
     return members.toArray(new Member[members.size()]);
  }
     
   public String toString()
   {
      String membersString = "";
      for(int i=0; i<members.size();i++)
      {
         membersString += members.get(i).toString()+"\n";
      }
      return membersString;
   }


}