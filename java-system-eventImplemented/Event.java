import java.io.Serializable;

public class Event implements Serializable
{
   private String name;
   private int nrParticipants;
   private Date dayStart;
   private int nrMembers;
   private String length;
   private int discount;
   private boolean finalized;
   private String type;
   private boolean vegan;
   private String location;
   private String feedback;
   private Lecturer lecturer = new Lecturer();
   private Sponsor sponsor = new Sponsor();
   
   public Event()
   {
      this.name = "input info";
      this.nrParticipants = 0;
      this.dayStart = new Date();
      this.nrMembers = 0;
      this.length = "input info";
      this.discount = 0;
      this.finalized = false;
      this.type = "input string";
      this.vegan = false;
      this.location = "input info(optional)";
      this.feedback = "input info";
   }
 
   public String getName()
   {
      return name;
   }
 
   public void setName(String name)
   {
      this.name = name;
   }
 
   public int getNrParticipants()
   {
      return nrParticipants;
   }
 
   public void setNrParticipants(int nrParticipants)
   {
      this.nrParticipants = nrParticipants;
   }
 
   public Date getDayStart()
   {
      return dayStart;
   }
 
   public void setDayStart(int d, int m, int y)
   {
      this.dayStart = new Date(d,m,y);
   }
 
   public int getNrMembers()
   {
      return nrMembers;
   }
 
   public void setNrMembers(int nrMembers)
   {
      this.nrMembers = nrMembers;
   }
 
   public String getLength()
   {
      return length;
   }
 
   public void setLength(String length)
   {
      this.length = length;
   }
 
   public int getDiscount()
   {
      return discount;
   }
 
   public void setDiscount(int discount)
   {
      this.discount = discount;
   }
 
   public boolean isFinalized()
   {
      return finalized;
   }
 
   public void setFinalized(boolean finalized)
   {
      this.finalized = finalized;
   }
 
   public String getType()
   {
      return type;
   }
 
   public void setType(String type)
   {
      this.type = type;
   }
 
   public boolean isVegan()
   {
      return vegan;
   }
 
   public void setVegan(boolean vegan)
   {
      this.vegan = vegan;
   }
 
   public String getLocation()
   {
      return location;
   }
 
   public void setLocation(String location)
   {
      this.location = location;
   }
 
   public String getFeedback()
   {
      return feedback;
   }
 
   public void setFeedback(String feedback)
   {
      this.feedback = feedback;
   }
 
 

   public void setEvent(String name, int nrParticipants, Date dayStart,
         int nrMembers, String length, int discount, boolean finalized,
         String type, boolean vegan, String location, String feedback,
         Lecturer lecturer, Sponsor sponsor)
{
   this.name = name;
   this.nrParticipants = nrParticipants;
   this.dayStart = dayStart;
   this.nrMembers = nrMembers;
   this.length = length;
   this.discount = discount;
   this.finalized = finalized;
   this.type = type;
   this.vegan = vegan;
   this.location = location;
   this.feedback = feedback;
   this.lecturer=lecturer;
   this.sponsor=sponsor;
}

   public Lecturer getLecturer()
   {
      return lecturer;
   }

   public void setLecturer(Lecturer lecturer)
   {
      this.lecturer = lecturer;
   }

   public Sponsor getSponsor()
   {
      return sponsor;
   }

   public void setSponsor(Sponsor sponsor)
   {
      this.sponsor = sponsor;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((dayStart == null) ? 0 : dayStart.hashCode());
      result = prime * result + discount;
      result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
      result = prime * result + (finalized ? 1231 : 1237);
      result = prime * result + ((lecturer == null) ? 0 : lecturer.hashCode());
      result = prime * result + ((length == null) ? 0 : length.hashCode());
      result = prime * result + ((location == null) ? 0 : location.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + nrMembers;
      result = prime * result + nrParticipants;
      result = prime * result + ((sponsor == null) ? 0 : sponsor.hashCode());
      result = prime * result + ((type == null) ? 0 : type.hashCode());
      result = prime * result + (vegan ? 1231 : 1237);
      return result;
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
      Event other = (Event) obj;
      if (dayStart == null)
      {
         if (other.dayStart != null)
            return false;
      }
      else if (!dayStart.equals(other.dayStart))
         return false;
      if (discount != other.discount)
         return false;
      if (feedback == null)
      {
         if (other.feedback != null)
            return false;
      }
      else if (!feedback.equals(other.feedback))
         return false;
      if (finalized != other.finalized)
         return false;
      if (lecturer == null)
      {
         if (other.lecturer != null)
            return false;
      }
      else if (!lecturer.equals(other.lecturer))
         return false;
      if (length == null)
      {
         if (other.length != null)
            return false;
      }
      else if (!length.equals(other.length))
         return false;
      if (location == null)
      {
         if (other.location != null)
            return false;
      }
      else if (!location.equals(other.location))
         return false;
      if (name == null)
      {
         if (other.name != null)
            return false;
      }
      else if (!name.equals(other.name))
         return false;
      if (nrMembers != other.nrMembers)
         return false;
      if (nrParticipants != other.nrParticipants)
         return false;
      if (sponsor == null)
      {
         if (other.sponsor != null)
            return false;
      }
      else if (!sponsor.equals(other.sponsor))
         return false;
      if (type == null)
      {
         if (other.type != null)
            return false;
      }
      else if (!type.equals(other.type))
         return false;
      if (vegan != other.vegan)
         return false;
      return true;
   }

   @Override
   public String toString()
   {
      return "Name=" + name + "[" + ", nrParticipants=" + nrParticipants
            + ", dayStart=" + dayStart + ", nrMembers=" + nrMembers
            + ", length=" + length + ", discount=" + discount + ", finalized="
            + finalized + ", type=" + type + ", vegan=" + vegan + ", location="
            + location + ", feedback=" + feedback + ", lecturer=" + lecturer
            + ", sponsor=" + sponsor + "]"  + "\n";
   }
 
}