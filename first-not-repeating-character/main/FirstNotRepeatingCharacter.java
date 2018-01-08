package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {

	public static char firstNotRepeatingCharacter(String input) {

		// default return value when all characters repeat
		final char UNDERSCORE = 0x005F;

		// count the number of occurrences for each character
		Map<Character, Integer> charactersCount = new LinkedHashMap<Character, Integer>();

		for (char character : input.toCharArray()) {

			if (charactersCount.containsKey(character)) {
				charactersCount.put(character, charactersCount.get(character) + 1);
				continue;
			}

			charactersCount.put(character, 1);
		}

		// return first occurring key with value of 1 (one occurrence)
		for (Character character : charactersCount.keySet()) {

			if (charactersCount.get(character) == 1) {
				return character;
			}
		}

		return UNDERSCORE;
	}

}
