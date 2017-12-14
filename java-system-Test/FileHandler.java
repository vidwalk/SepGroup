import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * A static class for file handling
 * 
 * @author IT-1V-A17-Group2
 */
public final class FileHandler implements Serializable {

	public static File eventFile;

	/**
	 * Create a file
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public FileHandler() {
		eventFile = new File("events.bin");
	}

	/**
	 * Create a file for writing members' email address
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public static void saveMembersMailsToDoc(String membersEmails) {
		String filename = "membersEmails.txt";
		File file = new File(filename);
		try {
			PrintWriter out = new PrintWriter(file); // Open the file

			out.print(membersEmails);
			out.flush(); // Force it to write the text
			out.close(); // Close the file
			System.out.println("End writing data to file: " + file.getAbsolutePath());
		} catch (FileNotFoundException e) {

		}

	}

	/**
	 * Create a file to save a list of members
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public static void saveMembers(Member[] members) {
		ObjectOutputStream out = null;
		try {
			File file = new File("members.bin");
			FileOutputStream fos = new FileOutputStream(file, false);
			out = new ObjectOutputStream(fos);
			System.out.println("Saving to a file");
			for (int i = 0; i < members.length; i++) {
				out.writeObject(members[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Create a file to save members
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public static void saveMember(Member member) {
		ObjectOutputStream out = null;
		try {
			File file = new File("members.bin");
			FileOutputStream fos = new FileOutputStream(file);
			out = new ObjectOutputStream(fos);

			out.writeObject(member);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			}

			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Output all members in the file
	 * 
	 * @author IT-1V-A17-Group2
	 */

	public static Member[] getMembers() {
		ArrayList<Object> membersList = new ArrayList<Object>();
		boolean cont = true;
		try {

			FileInputStream fis = new FileInputStream("members.bin");
			ObjectInputStream input = new ObjectInputStream(fis);

			while (cont) {
				Object obj = input.readObject();
				if (obj != null)
					membersList.add(obj);
				else
					cont = false;
			}
		} catch (Exception e) {
			// System.out.println(e.printStackTrace());
		}

		return membersList.toArray(new Member[membersList.size()]);

	}

	/**
	 * Save a list of events into the file
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public static void saveEvents(Event[] events) {
		ObjectOutputStream out = null;
		try {

			FileOutputStream fos = new FileOutputStream("events.bin");
			out = new ObjectOutputStream(fos);

			for (int i = 0; i < events.length; i++) {
				out.writeObject(events[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Save an event to the file
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public static void saveEvent(Event event) {
		ObjectOutputStream out = null;
		try {

			FileOutputStream fos = new FileOutputStream("events.bin");
			out = new ObjectOutputStream(fos);

			out.writeObject(event);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			}

			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Return a list of events from the file
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public static Event[] getEvents() {
		ArrayList<Object> eventsList = new ArrayList<Object>();
		boolean cont = true;
		try {

			FileInputStream fis = new FileInputStream("events.bin");
			ObjectInputStream input = new ObjectInputStream(fis);

			while (cont) {
				Object obj = input.readObject();
				if (obj instanceof Event)
					eventsList.add(obj);
				else
					cont = false;
			}
			try {
				input.close();
			}

			catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			// System.out.println(e.printStackTrace());
		}

		return eventsList.toArray(new Event[eventsList.size()]);

	}
}