package Day9;

import java.util.*;

public class TreeCase {
	public static void main(String[] args) {
		TreeSet<Integer> idNumbers = new TreeSet<>();

		idNumbers.add(104);
		idNumbers.add(101);
		idNumbers.add(110);
		idNumbers.add(108);

		System.out.println("Ascending Order: " + idNumbers);
		System.out.println("Decending Order: " +idNumbers.descendingSet());

		System.out.println("First ID: " + idNumbers.first());
		System.out.println("Last ID: " + idNumbers.last());
	}
}
