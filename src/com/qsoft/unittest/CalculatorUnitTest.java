package com.qsoft.unittest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qsoft.Calculator;
public class CalculatorUnitTest {

	@Test
	public void addNumberNull(){
		assertEquals(0, Calculator.add(null));
	}
	@Test
	public void addNumberEmpty() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void addNumberNewLine() {
		try {
			assertEquals(5, Calculator.add("-2,\n3,4"));
		} catch (Exception e) {
			assertEquals(true, "negatives not allowed".equals(e.getMessage()));
		}
	}
}
