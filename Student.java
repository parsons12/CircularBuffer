public class Student {
	private String fname;
	private String lname;
	private String id;
	/**
	 * Constructor for student
	 * @param FirstName
	 * @param LastName
	 * @param ID
	 */
	Student(String FirstName, String LastName, String ID) {
		fname = FirstName;
		lname = LastName;
		id = ID.toLowerCase();

	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getId() {
		return id;
	}

	public String toString() {
		return fname  + " " + lname + ": " + id;	
	} 

}
