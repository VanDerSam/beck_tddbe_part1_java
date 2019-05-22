package beck_tddbe_part1_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiCurrencyTests {
	@Test
	public void testMultiplication() {
		Dollar five = Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
}
