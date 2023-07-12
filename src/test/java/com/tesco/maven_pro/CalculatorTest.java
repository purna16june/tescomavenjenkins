package com.tesco.maven_pro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.calc.Calculator;

public class CalculatorTest {
	
	@Test
	public void testCalc() {
		assertEquals(10, new Calculator().addTrack(5, 5));
	}

}
