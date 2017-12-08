import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EventList {
	private File lecturerCategory = new File("lecturerCategory.bin");
	private File sponsorCategory = new File("sponsorCategory.bin");
	private ArrayList<Event> event = new ArrayList<Event>();

	public void setEvents(Event event) {
		this.event.add(event);
	}

	public ArrayList<Event> searchByCategoryEvent(String category) {
		ArrayList<Event> other = new ArrayList<Event>();
		for (int index = 0; index < event.size(); index++) {
			if (event.get(index).getAllLecturer().get(0).getCategory().equals(category)) {
				other.add(event.get(index));
			}
		}
		return other;
	}

	public ArrayList<Event> searchByNotFinilized() {
		ArrayList<Event> other = new ArrayList<Event>();
		for (int index = 0; index < event.size(); index++) {
			if (event.get(index).isFinalized() == false) {
				other.add(event.get(index));
			}
		}
		return other;
	}

	public ArrayList<Event> searchByFinilized() {
		ArrayList<Event> other = new ArrayList<Event>();
		for (int index = 0; index < event.size(); index++) {
			if (event.get(index).isFinalized() == true) {
				other.add(event.get(index));
			}
		}
		return other;
	}

	public void listByCategoryLecturer(String category) {
		ObjectOutputStream out = null;

		try {
			FileOutputStream fos = new FileOutputStream(lecturerCategory);
			out = new ObjectOutputStream(fos);

			for (int indexOne = 0; indexOne < event.size(); indexOne++) {
				for (int indexTwo = 0; indexTwo < event.get(indexOne).getAllLecturer().size(); indexTwo++) {
					out.writeObject(event.get(indexOne).getAllLecturer().get(indexTwo));
				}
			}
		} catch (IOException o) {
			
		} finally {
			try {
				out.close();
			} catch (IOException o) {
				o.printStackTrace();
			}
		}
	}

	public void listByCategorySponsor(String category) {
		ObjectOutputStream out = null;

		try {
			FileOutputStream fos = new FileOutputStream(sponsorCategory);
			out = new ObjectOutputStream(fos);

			for (int indexOne = 0; indexOne < event.size(); indexOne++) {
				for (int indexTwo = 0; indexTwo < event.get(indexOne).getAllSponsor().size(); indexTwo++) {
					out.writeObject(event.get(indexOne).getAllSponsor().get(indexTwo));
				}
			}
		} catch (IOException o) {
			
		} finally {
			try {
				out.close();
			} catch (IOException o) {
				o.printStackTrace();
			}
		}
	}

	public Event searchEvent(String name) {
		Event other = new Event();
		for (int index = 0; index < event.size(); index++) {
			if (event.get(index).getName().equals(name)) {
				other = event.get(index);
			}
		}
		return other;
	}
}
