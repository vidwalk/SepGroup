
public class Member
{
   private String name;
   private String email;
   private String adress;
   private String phone;
   private Date registerDate;
   private int yearPayment;
   private String category;

   public Member(String name, String email, String adress, String phone,Date registerDate, int yearPayment, String category)
   {
      super();
      this.name = name;
      this.email = email;
      this.adress = adress;
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
      return adress;
   }

 
   public void setAdress(String adress)
   {
      this.adress = adress;
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
}
