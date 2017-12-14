import java.io.Serializable;

public class Member implements Serializable {
	private String name;
	private String email;
	private String address;
	private String phone;
	private Date registerDate;
	private int yearPayment;
	private String category;

	/**
	 * Create a member by giving all the relevant information
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Member(String name, String email, String address, String phone, Date registerDate, int yearPayment,
			String category) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.registerDate = registerDate;
		this.yearPayment = yearPayment;
		this.category = category;
	}

	/**
	 * Create a member with empty values
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Member() {
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
	 * Return email address
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Create or change email address
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Return email address
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getAdress() {
		return address;
	}

	/**
	 * Create or change address
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setAdress(String adress) {
		this.address = adress;
	}

	/**
	 * Return phone number
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Create or change phone number
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Return date for registration
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Date getRegisterDate() {
		return registerDate;
	}

	/**
	 * Set or change date og registration
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	/**
	 * Return the number of how many years has the customer paid for
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public int getYearPayment() {
		return yearPayment;
	}

	/**
	 * Set or change how many year has the customer paid for
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setYearPayment(int yearPayment) {
		this.yearPayment = yearPayment;
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
	 * Set or change category
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Return all variables in a short sentence(all variables has been changed into
	 * string)
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String toString() {
		String memberString = "";
		return memberString += "Name: " + name + " / Email: " + email + " / Address: " + address + " / Phone: " + phone
				+ " / Category: " + category + " / Year of registration: " + registerDate.toString()
				+ " / Year of last payment: " + yearPayment;
	}
}