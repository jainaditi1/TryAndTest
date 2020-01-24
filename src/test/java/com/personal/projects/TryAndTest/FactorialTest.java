package com.personal.projects.TryAndTest;

import org.junit.Test;

import junit.framework.TestCase;


public class FactorialTest extends TestCase{

		
	
	@Test
	public void testFactorial() {
		Factorial factorial = new Factorial();
		long result = factorial.findFactorialOf(10);
		assertNotNull(result);
		assertEquals(3628800, result);
		
	}
	
	
	
}
