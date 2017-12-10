import java.io.*;
import java.util.ArrayList;

public class MemberList
{
   private File emails = new File("emails.bin");
   private File preferences = new File("preferences.bin");
   private File ifPaid = new File("ifPaid.bin");
   private ArrayList<Member> member = new ArrayList<Member>();

   public void listEmails()
   {
      ObjectOutputStream out = null;

      try
      {
         FileOutputStream fos = new FileOutputStream(emails);
         out = new ObjectOutputStream(fos);

         for (int i = 0; i < this.member.size(); i++)
         {
            out.writeObject(member.get(i).getEmail());
         }
      }

      catch (IOException o)
      {
      }
      finally
      {
         try
         {
            out.close();
         }
         catch (IOException o)
         {
            o.printStackTrace();
         }
      }
   }

   public void listByPreference(String Preference)
   {
      ObjectOutputStream out = null;

      try
      {
         FileOutputStream fos = new FileOutputStream(preferences);
         out = new ObjectOutputStream(fos);

         for (int i = 0; i < this.member.size(); i++)
         {
            if (member.get(i).getCategory().equals(Preference))
               out.writeObject(member.get(i));
         }
      }

      catch (IOException o)
      {
      }
      finally
      {
         try
         {
            out.close();
         }
         catch (IOException o)
         {
            o.printStackTrace();
         }
      }
   }

   public void listByPreference(int year)
   {
      ObjectOutputStream out = null;

      try
      {
         FileOutputStream fos = new FileOutputStream(ifPaid);
         out = new ObjectOutputStream(fos);

         for (int i = 0; i < this.member.size(); i++)
         {
            if (member.get(i).getYearPayment() >= year)
               out.writeObject(member.get(i).getName());
         }
      }

      catch (IOException o)
      {
      }
      finally
      {
         try
         {
            out.close();
         }
         catch (IOException o)
         {
            o.printStackTrace();
         }
      }
   }

   public Member searchMember(String name)
   {
      Member members = new Member();
      for (int i = 0; i < this.member.size(); i++)
      {
         if (member.get(i).getName().equals(name))
            members = member.get(i);
      }
      return members;
   }
}