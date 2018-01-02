package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.FirstDuplicate;

public class FirstDuplicateTest {

	int[] array;
	int result;

	@Test
	public void shouldReturnAValueOfNegativeOneWhenNoDuplicatesOccur() {
		array = new int[] { 1, 2, 3, 4, 5, 6 };
		result = FirstDuplicate.findFirstDuplicate(array);
		assertThat(result, is(-1));
	}

	@Test
	public void shouldReturnAValueOfThreeWhenTwoNumberArrayHasSameNumbers() {
		array = new int[] { 3, 3 };
		result = FirstDuplicate.findFirstDuplicate(array);
		assertThat(result, is(3));
	}

	@Test
	public void shouldReturnValueOfFiveWhenFourNumberArrayHasTwoSetsOfDuplicates() {
		array = new int[] { 5, 1, 5, 1 };
		result = FirstDuplicate.findFirstDuplicate(array);
		assertThat(result, is(5));
	}

	@Test
	public void shouldReturnValueOfThreeWhenEightNumberArrayHasFourSetsOfDuplicates() {
		array = new int[] { 2, 3, 3, 4, 5, 2, 5, 4 };
		result = FirstDuplicate.findFirstDuplicate(array);
		assertThat(result, is(3));
	}

}
