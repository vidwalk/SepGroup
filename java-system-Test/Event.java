import java.io.Serializable;

public class Event implements Serializable {
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

	/**
	 * Set default value to each variables
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Event() {
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

	/**
	 * Return name
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getName() {
		return name;
	}

	/**
	 * Create or change name
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return participants number
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public int getNrParticipants() {
		return nrParticipants;
	}

	/**
	 * Create or change participants number
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setNrParticipants(int nrParticipants) {
		this.nrParticipants = nrParticipants;
	}

	/**
	 * Return start day
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Date getDayStart() {
		return dayStart;
	}

	/**
	 * Create or change start day
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setDayStart(int d, int m, int y) {
		this.dayStart = new Date(d, m, y);
	}

	/**
	 * Return members' number
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public int getNrMembers() {
		return nrMembers;
	}

	/**
	 * Create or change members' number
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setNrMembers(int nrMembers) {
		this.nrMembers = nrMembers;
	}

	/**
	 * Return length
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getLength() {
		return length;
	}

	/**
	 * Create or change length
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setLength(String length) {
		this.length = length;
	}

	/**
	 * Return discount
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * Create or change discount
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/**
	 * Check whether the event is finilized or not
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public boolean isFinalized() {
		return finalized;
	}

	/**
	 * Set or change the finalization of the event
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setFinalized(boolean finalized) {
		this.finalized = finalized;
	}

	/**
	 * Return type
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getType() {
		return type;
	}

	/**
	 * Create or change type
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Whether the customer is vegan or not
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public boolean isVegan() {
		return vegan;
	}

	/**
	 * Set or change the information of vegan condition for a customer
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}

	/**
	 * Return location
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Create or change location
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Return feedback from customers
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getFeedback() {
		return feedback;
	}

	/**
	 * Create or change feedback from customers
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	/**
	 * Create or change an event
	 * 
	 * @author IT-1V-A17-Group2
	 */

	public void setEvent(String name, int nrParticipants, Date dayStart, int nrMembers, String length, int discount,
			boolean finalized, String type, boolean vegan, String location, String feedback, Lecturer lecturer,
			Sponsor sponsor) {
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
		this.lecturer = lecturer;
		this.sponsor = sponsor;
	}

	/**
	 * Return a lecturer
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Lecturer getLecturer() {
		return lecturer;
	}

	/**
	 * Create or change lecturer for an event
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	/**
	 * Return a sponsor
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Sponsor getSponsor() {
		return sponsor;
	}

	/**
	 * Create or change sponsor for an event
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	/**
	 * Whether two events are the same or not
	 * 
	 * @author IT-1V-A17-Group2
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (dayStart == null) {
			if (other.dayStart != null)
				return false;
		} else if (!dayStart.equals(other.dayStart))
			return false;
		if (discount != other.discount)
			return false;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		if (finalized != other.finalized)
			return false;
		if (lecturer == null) {
			if (other.lecturer != null)
				return false;
		} else if (!lecturer.equals(other.lecturer))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nrMembers != other.nrMembers)
			return false;
		if (nrParticipants != other.nrParticipants)
			return false;
		if (sponsor == null) {
			if (other.sponsor != null)
				return false;
		} else if (!sponsor.equals(other.sponsor))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (vegan != other.vegan)
			return false;
		return true;
	}

	/**
	 * Return all variables in a sentence(all variable has been changed to string)
	 * 
	 * @author IT-1V-A17-Group2
	 */
	@Override
	public String toString() {
		return "Name=" + name + "[" + ", nrParticipants=" + nrParticipants + ", dayStart=" + dayStart + ", nrMembers="
				+ nrMembers + ", length=" + length + ", discount=" + discount + ", finalized=" + finalized + ", type="
				+ type + ", vegan=" + vegan + ", location=" + location + ", feedback=" + feedback + ", lecturer="
				+ lecturer + ", sponsor=" + sponsor + "]" + "\n";
	}

}