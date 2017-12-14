import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.Serializable;

public class Date implements Serializable {
	private int day;
	private int month;
	private int year;

	/**
	 * Set value to day,month and year
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Date(int day, int month, int year) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	 * Set current date
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Date() {
		Calendar calendar = GregorianCalendar.getInstance();
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * Return day
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Create or change day
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setDay(int day) {
		if ((day > 0) && (day < 32))
			this.day = day;
	}

	/**
	 * Return month
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Create or change month,and check how many days are in this month
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setMonth(int month) {
		if ((month > 0) && (month < 13))
			this.month = month;
		switch (month) {
		case 1:
			this.day = 31;
		case 2: {
			if ((((this.year % 4 == 0) && (this.year % 100 != 100)) || (this.year % 400 == 0)))
				this.day = 28;
			else
				this.day = 29;
		}
		case 3:
			this.day = 31;
		case 4:
			this.day = 30;
		case 5:
			this.day = 31;
		case 6:
			this.day = 30;
		case 7:
			this.day = 31;
		case 8:
			this.day = 31;
		case 9:
			this.day = 30;
		case 10:
			this.day = 31;
		case 11:
			this.day = 30;
		case 12:
			this.day = 31;

		}
	}

	/**
	 * Return year
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Create or change year
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void setYear(int year) {
		if (year > this.year)
			this.year = year;
	}

	/**
	 * Return all variables in a short sentence(all variables are string)
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String toString() {
		if (month < 10)
			return (day + "/0" + month + "/" + year);
		else
			return (day + "/" + month + "/" + year);
	}

	/**
	 * Whether two dates are the same or not
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}