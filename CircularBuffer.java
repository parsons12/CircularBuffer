import java.util.ArrayList;
import java.util.LinkedList;

public class CircularBuffer<T> {
	private int maxSize;
	private int end = 0;
	private int length = 0;
	private int cnt = 0;
	private ArrayList<T> list = new ArrayList<T>();

	/**
	 * Constructor for circular buffer
	 * 
	 * @param size
	 */
	public CircularBuffer(int size) {
		maxSize = size;
		end = 0;
		length = 0;
	}

	public int getSize() {// returns size of the buffer
		return length;
	}

	public boolean isEmpty() {// check if empty
		return length == 0;
	}

	public boolean isFull() {// check if full
		return length == maxSize;
	}

	public void add(T n) {// insert an object
		if (!isFull()) {// if buffer is not full
			length++;
			end = (end + 1) % maxSize;
			list.add(n);

		} else {// if buffer is full overwrite
			if (cnt == length) {
				cnt = 0;
			}
			list.remove(cnt);
			list.add(cnt, n);
			cnt++;
		}
	}

	public void remove(T n) {// remove an object
		length--;
		end = (end - 1) % maxSize;
		list.remove(n);
	}

	public void prettyPrint() {// print the buffer
		System.out.println("Buffer: " + list);
	}

	public String compare(T n, T m) {
		String l = n.toString();
		String k = m.toString();
		if (l.compareTo(k) == 0) {
			return "4 is equal to 4";
		} else if (l.compareTo(k) > 0) {
			return n + " is greater than " + m;
		} else {
			return m + " is greater than " + n;
		}

	}
}
