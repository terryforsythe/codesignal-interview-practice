package main;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

	public static int findFirstDuplicate(int[] array) {

		int noDuplicateValue = -1;

		Set<Integer> firstOccurencesOfNumber = new HashSet<Integer>();

		for (int number : array) {

			if (firstOccurencesOfNumber.contains(number)) {
				return number;
			}

			firstOccurencesOfNumber.add(number);
		}

		return noDuplicateValue;
	}

}
