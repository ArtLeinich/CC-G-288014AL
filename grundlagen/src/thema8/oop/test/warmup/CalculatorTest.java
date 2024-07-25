package thema8.oop.test.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAddPositiveNumbers()
	{
		assertEquals(5, Calculator.add(2,3));
		assertEquals(100, Calculator.add(20, 80));
	}
	
	@Test
	public void testAddNegativeNumbers()
	{
		assertEquals(-12, Calculator.add(-2,-10));
		assertEquals(-12, Calculator.add(-9, -3));
	}

}
