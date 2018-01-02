package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.FirstDuplicate;

public class FirstDuplicateTest {

	int result;

	@Test
	public void shouldReturnAValueOfNegativeOneWhenNoDuplicatesOccur() {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		result = FirstDuplicate.findFirstDuplicate(array);
		assertThat(result, is(-1));
	}

	@Test
	public void shouldReturnAValueOfThreeWhenTwoNumberArrayHasSameNumbers() {
		int[] array = { 3, 3 };
		result = FirstDuplicate.findFirstDuplicate(array);
		assertThat(result, is(3));
	}

	@Test
	public void shouldReturnValueOfFiveWhenFourNumberArrayHasTwoSetsOfDuplicates() {
		int[] array = { 5, 1, 5, 1 };
		result = FirstDuplicate.findFirstDuplicate(array);
		assertThat(result, is(5));
	}

	@Test
	public void shouldReturnValueOfThreeWhenEightNumberArrayHasFourSetsOfDuplicates() {
		int[] array = { 2, 3, 3, 4, 5, 2, 5, 4 };
		result = FirstDuplicate.findFirstDuplicate(array);
		assertThat(result, is(3));
	}

}
