import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.Serializable;
public class Date implements Serializable
{
   private int day;
   private int month;
   private int year;

   public Date(int day, int month, int year)
   {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   public Date()
   {
      Calendar calendar = GregorianCalendar.getInstance();
      this.year = calendar.get(Calendar.YEAR);
      this.month = calendar.get(Calendar.MONTH) + 1;
      this.day = calendar.get(Calendar.DAY_OF_MONTH);
   }

   public int getDay()
   {
      return day;
   }

   public void setDay(int day)
   {
      if((day>0)&&(day<32)) this.day=day;
   }

   public int getMonth()
   {
      return month;
   }

   public void setMonth(int month)
   {  if((month>0)&&(month<13)) this.month=month;
      switch (month)
      {
         case 1: this.day=31;
         case 2:{if ((((this.year % 4 == 0) && (this.year % 100 != 100))|| (this.year % 400 == 0))) this.day=28;
         else this.day=29;}
         case 3:this.day=31;
         case 4:this.day=30;
         case 5:this.day=31;
         case 6:this.day=30;
         case 7:this.day=31;
         case 8:this.day=31;
         case 9:this.day=30;
         case 10:this.day=31;
         case 11:this.day=30;
         case 12:this.day=31;

      }
   }

   public int getYear()
   {
      return year;
   }

   public void setYear(int year)
   {
      if (year > this.year)
         this.year = year;
   }

   public String toString()
   {
      if (month < 10)
         return (day + "/0" + month + "/" + year);
      else
         return (day + "/" + month + "/" + year);
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Date other = (Date) obj;
      if (day != other.day)
         return false;
      if (month != other.month)
         return false;
      if (year != other.year)
         return false;
      return true;
   }
}