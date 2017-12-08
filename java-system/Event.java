import java.util.ArrayList;
 
public class Event
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
   private ArrayList<Lecturer> lecturer;
   private ArrayList<Sponsor> sponsor;
   
   public Event()
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
 
   public void setDayStart(Date dayStart)
   {
      this.dayStart = dayStart;
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
 
 public void addLecturer(Lecturer lecturer) {
	 this.lecturer.add(lecturer);
 }
 public void addSponsor(Sponsor sponsor) {
	 this.sponsor.add(sponsor);
 }
 
 public ArrayList<Lecturer> getAllLecturer() {
	 ArrayList<Lecturer> other = new ArrayList<Lecturer>();
	 for(int index=0;index<lecturer.size();index++) {
		 other.add(lecturer.get(index));
	 }
	 return other;
 }
 public ArrayList<Sponsor> getAllSponsor(){
	 ArrayList<Sponsor> other = new ArrayList<Sponsor>();
	 for(int index=0;index<sponsor.size();index++) {
		 other.add(sponsor.get(index));
	 }
	 return other;
 }
 
}