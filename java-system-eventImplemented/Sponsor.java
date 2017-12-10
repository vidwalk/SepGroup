import java.io.Serializable;

public class Sponsor implements Serializable {
	private String name;
	private String email;
	private String category;

	public Sponsor() {
		this.name = "(Not Given)";
		this.email = "(Not Given)";
		this.category = "(Not Given)";
	}

	public Sponsor(String name, String email, String category)
   {
      super();
      this.name = name;
      this.email = email;
      this.category = category;
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

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((category == null) ? 0 : category.hashCode());
      result = prime * result + ((email == null) ? 0 : email.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
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
      Sponsor other = (Sponsor) obj;
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
      return true;
   }
}
