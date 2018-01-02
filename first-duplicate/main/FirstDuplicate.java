package main;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

	public static int findFirstDuplicate(int[] array) {

		int noDuplicateValue = -1;

		Set<Integer> firstOccurenceOfNumber = new HashSet<Integer>();

		for (int number : array) {

			if (firstOccurenceOfNumber.contains(number)) {
				return number;
			}

			firstOccurenceOfNumber.add(number);
		}

		return noDuplicateValue;
	}

}
