package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.FirstNotRepeatingCharacter;

public class FirstNotRepeatingCharacterTest {

	String string;

	private char result() {
		return FirstNotRepeatingCharacter.firstNotRepeatingCharacter(string);
	}

	@Test
	public void shouldReturnUnderscoreWhenAllCharactersRepeat() {
		string = "abacabaabacaba";
		final char UNDERSCORE = 0x005F;
		assertThat(result(), is(UNDERSCORE));
	}

	@Test
	public void shouldReturnNonRepeatingCharacterInFourLetterString() {
		string = "aaba";
		assertThat(result(), is('b'));
	}

	@Test
	public void shouldReturnFirstNonRepeatingCharacterInStringWithTwoOccurrences() {
		string = "ttuvvxxyszz";
		assertThat(result(), is('u'));
	}

	@Test
	public void shouldReturnFirstNonRepeatingCharacterInLongString() {
		string = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
		assertThat(result(), is('g'));
	}

}
