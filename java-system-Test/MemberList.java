import java.io.*;
import java.util.ArrayList;

public class MemberList {
	ArrayList<Member> members;

	/**
	 * Create an empty member list
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public MemberList() {
		members = new ArrayList<>();

	}

	/**
	 * Add a member to the member list
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void addMember(Member member) {
		members.add(member);
	}

	/**
	 * Remove a member in the member list
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public void removeMember(int index) {
		members.remove(index);
	}

	/**
	 * Return an array of all members
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public Member[] getMembersArray() {

		return members.toArray(new Member[members.size()]);
	}

	/**
	 * Return all members in a passage
	 * 
	 * @author IT-1V-A17-Group2
	 */
	public String toString() {
		String membersString = "";
		for (int i = 0; i < members.size(); i++) {
			membersString += members.get(i).toString() + "\n";
		}
		return membersString;
	}

}