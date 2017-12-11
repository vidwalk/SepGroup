import java.io.Serializable;

public class Member implements Serializable
{
   private String name;
   private String email;
   private String address;
   private String phone;
   private Date registerDate;
   private int yearPayment;
   private String category;

   public Member(String name, String email, String address, String phone,Date registerDate, int yearPayment, String category)
   {
      this.name = name;
      this.email = email;
      this.address = address;
      this.phone = phone;
      this.registerDate = registerDate;
      this.yearPayment = yearPayment;
      this.category = category;
   }
   
   public Member()
   {
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getAdress()
   {
      return address;
   }

 
   public void setAdress(String adress)
   {
      this.address = adress;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public Date getRegisterDate()
   {
      return registerDate;
   }

   public void setRegisterDate(Date registerDate)
   {
      this.registerDate = registerDate;
   }

   public int getYearPayment()
   {
      return yearPayment;
   }

   public void setYearPayment(int yearPayment)
   {
      this.yearPayment = yearPayment;
   }

   public String getCategory()
   {
      return category;
   }

   public void setCategory(String category)
   {
      this.category = category;
   }
   
   public String toString()
   {
      String memberString = "";
      return memberString += "Name: "+name+" / Email: "+email+" / Address: "+address+" / Phone: "+phone+" / Category: "+category+" / Year of registration: "+registerDate.toString()+" / Year of last payment: "+yearPayment;
   }
}
