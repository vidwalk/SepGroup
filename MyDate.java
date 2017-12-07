import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyDate
{
   int month, day, year;
   Scanner scan = new Scanner(System.in);

   public MyDate(int d, int m, int y)
   {
      set(d, m, y);
   }

   public int getMonth()
   {
      return month;
   }

   public int getDay()
   {
      return day;
   }

   public int getYear()
   {
      return year;
   }

   public void set(int d, int m, int y)
   {
      month = m;
      day = d;
      year = y;
      if (month < 1)
         month = 1;
      if (month >= 12)
         month = 12;
      if (year < 0)
         year = 0 - year;
      if (day < 1)
         day = 1;
      switch (month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
         {
            if (day > 31)
               day = 31;
            break;
         }
         case 4:
         case 6:
         case 9:
         case 11:
         {
            if (day > 30)
               day = 30;
            break;
         }
         case 2:
         {
            if (day > 28)
               day = 28;
            break;
         }
         default:
         {
            month = 0;
            break;
         }
      }
   }

   public String toString()
   {  String result = "";
      if (year > 1900)
      {
         if (day < 10 && month < 10)
         {
            result = result + "0" + day + "/0" + month + "/" + year;
         }
         else if (day < 10)
         {
            result = result + "0" + day + month + "/" + year;
         }
         else if (month < 10)
         {
            result = result + day + "/0" + month + "/" + year;
         }
         else if (month > 10 && day > 10)
         {
            result = result + day + "/" + month + "/" + year;
         }

      }
      else
      {
         while (year < 1000)
         {
            System.out
                  .println("Please input the year again in 4-digit format: ");
            year = scan.nextInt();
         }
         if (day < 10 && month < 10)
         {
            result = result + "0" + day + "/0" + month + "/" + year;
         }
         else if (day < 10)
         {
            result = result + "0" + day + month + "/" + year;
         }
         else if (month < 10)
         {
            result = result + day + "/0" + month + "/" + year;
         }
         else if (month > 10 && day > 10)
         {
            result = result + day + "/" + month + "/" + year;
         }
      }
      return result;
   }


   public void set(int day, String monthName, int year)
   {
      this.day = day;
      this.year = year;
      this.month = MyDate.convertToMonthNumber(monthName);
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof MyDate))
      {
         return false;
      }
      MyDate object = (MyDate) obj;
      if (this.day == object.getDay() && this.month == object.getMonth()
            && this.year == object.getYear())
         return true;
      return false;
   }

   public MyDate copy()
   {

      MyDate copydate = new MyDate(month, day, year);
      return copydate;
   }

   
   public MyDate()
   {
      
   }
   
   public boolean isBefore(Object obj)
   {
      if (!(obj instanceof MyDate))
      {
         return false;
      }
      MyDate object = (MyDate) obj;
      if (this.year < object.getYear())
         return true;
      if (this.year == object.getYear() && this.month < object.getMonth())
         return true;
      if (this.year == object.getYear() && this.month == object.getMonth() && this.day < object.getDay())
         return true;
         return false;
   }
   
   
   public int daysBetween(MyDate other)
   {
      int counter = 0;
      if(isBefore(other))
      {
         MyDate counterDate = new MyDate(this.month,this.day,this.year);
         while(!(other.equals(counterDate)))
         {
            counterDate.stepForwardOneDay();
            counter++;
         }
      }
      else
      {
         MyDate counterDate = new MyDate(this.month,this.day,this.year);
         while(!(other.equals(counterDate)))
         {
            other.stepForwardOneDay();
            counter++;
         }
      }
      return counter;
   }
   
   public static MyDate now()
   { 
      MyDate today = new MyDate();
      Calendar now = GregorianCalendar.getInstance();
      System.out.println(now.get(Calendar.YEAR));
      today.set(now.get(Calendar.MONTH)+1, now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.YEAR));
      return today;
   }
}
