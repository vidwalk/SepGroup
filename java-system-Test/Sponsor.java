import java.io.Serializable;

public class Sponsor implements Serializable {
	private String name;
	private String email;
	private String category;

	/**
	 * Set name,email and category to default value
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Sponsor() {
		this.name = "(Not Given)";
		this.email = "(Not Given)";
		this.category = "(Not Given)";
	}

	/**
	 * Give arguments to name,email and category
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Sponsor(String name, String email, String category) {
		super();
		this.name = name;
		this.email = email;
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
	public void setEmail(String email) {
		this.email = email;
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
	 * Create or change category
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setCategory(String category) {
		this.category = category;
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
	 * Return all the variables in a short sentence (all variables are String)
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String toString() {

		return "Name: " + name + "; email address: " + email + "; category: " + category + ";";
	}

	/**
	 * Whether two sponsors are the same or not
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
		Sponsor other = (Sponsor) obj;
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
		return true;
	}
}