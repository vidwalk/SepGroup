
public class Sponsor {
	private String name;
	private String email;
	private String category;

	public Sponsor() {
		this.name = "(Not Given)";
		this.email = "(Not Given)";
		this.category = "(Not Given)";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public String toString() {

		return "Name: " + name + "; email address: " + email + "; category: " + category + ";";
	}
}
