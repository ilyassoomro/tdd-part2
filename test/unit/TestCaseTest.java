package unit;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

import framework.TestResult;
import framework.TestSuite;
import framework.WasRun;


@SuppressWarnings("unused")
public class TestCaseTest {
	
	TestResult result;
	
	@Before public void setUp(){
		result = new TestResult();
	}
	
	/** Chapter 23. How Suite It Is (Test Case)(Updated) */
	@Test
	public void testTemplateMethod() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		WasRun test = new WasRun("testMethod");
		test.run(this.result);
		assertTrue("setUp testMethod tearDown ".equals(test.log));
	}
	
	/** Chapter 23. How Suite It Is (Test Case)(Updated) */
	@Test
	public void testResult() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		WasRun test = new WasRun("testMethod");
		test.run(this.result);
		assertTrue("1 run, 0 failed".equals(this.result.summary()));
	}

	/** Chapter 23. How Suite It Is (Test Case)(Updated) */
	@Test
	public void testFailedResult() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		WasRun test = new WasRun("testBrokenMethod");
		test.run(this.result);
		assertTrue("1 run, 1 failed".equals(this.result.summary()));
	}

	/** Chapter 22. Dealing with Failure (Test Case) */
	@Test 
	public void testFailedResultFormatting(){
		this.result.testStarted();
		this.result.testFailed();
		assertTrue("1 run, 1 failed".equals(result.summary()));
	}
	
	
	/** Chapter 23. How Suite It Is (Test Case) */
	@Test
	public void testSuite() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod")); 
		suite.run(this.result);
		assertTrue("2 run, 1 failed".equals(this.result.summary()));
		
	}
	
	
}

