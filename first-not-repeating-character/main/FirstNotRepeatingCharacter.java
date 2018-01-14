package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {

	public static char firstNotRepeatingCharacter(String input) {

		// default return value when all characters repeat
		final char UNDERSCORE = 0x005F;

		Map<Character, Integer> charactersCount = new LinkedHashMap<Character, Integer>();

		// add characters of String input to Map and count number of occurrences
		for (char character : input.toCharArray()) {

			if (charactersCount.containsKey(character)) {

				int increaseCountBy1 = charactersCount.get(character) + 1;
				charactersCount.put(character, increaseCountBy1);

				continue;
			}

			charactersCount.put(character, 1);
		}

		// return first occurring character with value of 1 (one occurrence)
		for (Character character : charactersCount.keySet()) {

			boolean isFirstNotRepeatingCharacter = charactersCount.get(character) == 1;

			if (isFirstNotRepeatingCharacter) {
				return character;
			}
		}

		return UNDERSCORE;
	}

}
