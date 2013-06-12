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
}
