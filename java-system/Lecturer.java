
public class Lecturer {
	private String name;
	private String email;
	private boolean paidFor;
	private String category;

	public Lecturer() {
		this.name = "(Not Given)";
		this.email = "(Not Given)";
		this.paidFor = false;
		this.category = "(Not Given)";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String emailAddress) {
		email = emailAddress;
	}

	public void setPaidFor(boolean stateSponsorization) {
		this.paidFor = stateSponsorization;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public boolean isPaidFor() {
		return paidFor;
	}

	public String getCategory() {
		return category;
	}

	public String toString() {

		return "Name: " + name + "; email address: " + email + "; is paid for advertise himself(herself)?: " + paidFor
				+ "; category: " + category + ";";
	}
}
