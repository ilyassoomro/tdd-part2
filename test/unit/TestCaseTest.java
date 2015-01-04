package unit;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

import framework.TestResult;
import framework.WasRun;


public class TestCaseTest {
	
	
	
	
	/**
	 * Chapter 20. Cleaning Up After
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testTemplateMethod() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		WasRun test = new WasRun("testMethod");
		test.run();
		assertTrue("setUp testMethod tearDown ".equals(test.log));
	}
	
	/**
	 * Chapter 21. Counting (Test Case)
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testResult() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		WasRun test = new WasRun("testMethod");
		TestResult result = test.run();
		assertTrue("1 run, 0 failed".equals(result.summary()));
	}
	
	/**
	 * Chapter 22. Dealing with Failure (Test Case)
	 */
	@Test 
	public void testFailedResultFormatting(){
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		assertTrue("1 run, 1 failed".equals(result.summary()));
	}
	
	/**
	 * Chapter 21. Counting (Test Case)
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testFailedResult() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = test.run();
		assertTrue("1 run, 1 failed".equals(result.summary()));
	}
	
	
	
}

