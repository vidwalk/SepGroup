import java.io.Serializable;

public class Lecturer implements Serializable {
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
	public Lecturer(String name, String email, boolean paidFor, String category)
   {
      super();
      this.name = name;
      this.email = email;
      this.paidFor = paidFor;
      this.category = category;
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

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((category == null) ? 0 : category.hashCode());
      result = prime * result + ((email == null) ? 0 : email.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + (paidFor ? 1231 : 1237);
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
      Lecturer other = (Lecturer) obj;
      if (category == null)
      {
         if (other.category != null)
            return false;
      }
      else if (!category.equals(other.category))
         return false;
      if (email == null)
      {
         if (other.email != null)
            return false;
      }
      else if (!email.equals(other.email))
         return false;
      if (name == null)
      {
         if (other.name != null)
            return false;
      }
      else if (!name.equals(other.name))
         return false;
      if (paidFor != other.paidFor)
         return false;
      return true;
   }
}
