import java.io.Serializable;

public class Lecturer implements Serializable {
	private String name;
	private String email;
	private boolean paidFor;
	private String category;

	/**
	 * Set default value to name,email,sponsorizaiton condition and category
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Lecturer() {
		this.name = "(Not Given)";
		this.email = "(Not Given)";
		this.paidFor = false;
		this.category = "(Not Given)";
	}

	/**
	 * Set value to name,email,sponsorization condition and category
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Lecturer(String name, String email, boolean paidFor, String category) {
		super();
		this.name = name;
		this.email = email;
		this.paidFor = paidFor;
		this.category = category;
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
	 * Create or change email
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setEmail(String emailAddress) {
		email = emailAddress;
	}

	/**
	 * Create or change sponsorization condition
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setPaidFor(boolean stateSponsorization) {
		this.paidFor = stateSponsorization;
	}

	/**
	 * Create or change category
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setCategory(String category) {
		this.category = category;
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
	 * Return email
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Return sponsorization condition
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public boolean isPaidFor() {
		return paidFor;
	}

	/**
	 * Return category
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Return all variables in a short sentence (all variables are string)
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String toString() {

		return "Name: " + name + "; email address: " + email + "; is paid for advertise himself(herself)?: " + paidFor
				+ "; category: " + category + ";";
	}

	/**
	 * Whether two lecturers are the same
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
		Lecturer other = (Lecturer) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (paidFor != other.paidFor)
			return false;
		return true;
	}
}