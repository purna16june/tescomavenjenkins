package com.app.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalTest {
	
	@Mock
	AddService addService;
	CalcService calcService;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testApp() {
		
//		addService = Mockito.mock(AddService.class);
		
		calcService = new CalcService(addService);
		//In the below code, if you give a different value for num1 or num2 it will still not matter
		//as the actual values are being mocked.
		int num1=13;
		int num2=13;
		int expected=25;
		
		Mockito.when(addService.add(num1, num2)).thenReturn(expected);
		int actual = calcService.calc(num1, num2);
		
		assertEquals(expected, actual);
	}
}
