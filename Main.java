import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/* create buffer and specify size */
		CircularBuffer cb = new CircularBuffer(4);

		/* insert any type of object */
		cb.add(5);// add int object
		cb.add("Michigan");// add string object
		cb.add(2.33); // add double object
		Student s1 = new Student("John", "Doe", "doe1jf");// create type student
		cb.add(12);
		cb.add(s1);// add student s1, will overwrite first element because buffer reached max size
		System.out.println(cb.compare("Michigan", s1));
		cb.prettyPrint();// print buffer)
	}
}
