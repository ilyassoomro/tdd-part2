package unit;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

import framework.TestCase;
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
	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run(this.result);
		assertTrue("setUp testMethod tearDown ".equals(test.log));
	}
	
	/** Chapter 23. How Suite It Is (Test Case)(Updated) */
	@Test
	public void testResult(){
		WasRun test = new WasRun("testMethod");
		test.run(this.result);
		assertTrue("1 run, 0 failed".equals(this.result.summary()));
	}

	/** Chapter 23. How Suite It Is (Test Case)(Updated) */
	@Test
	public void testFailedResult(){
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
	public void testSuite(){
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod")); 
		suite.run(this.result);
		assertTrue("2 run, 1 failed".equals(this.result.summary()));
		
	}
	
	/** Test Case : After implementing "Test" interface on TestCase and TestSuite (Chapter 24. xUnit Retrospective) */
	@Test
	public void testCaseCount(){
		TestCase testCase = new WasRun("testMethod");
		assertEquals(1,testCase.countTestCases());
	}

	/** Test Case : After implementing "Test" interface on TestCase and TestSuite (Chapter 24. xUnit Retrospective) */
	@Test
	public void testEmtpyCasesCountFromSuite(){
		TestSuite suite = new TestSuite();
		assertEquals(0,suite.countTestCases());
	}

	/** Test Case : After implementing "Test" interface on TestCase and TestSuite (Chapter 24. xUnit Retrospective) */
	@Test
	public void testCasesCountFromSuite(){
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod")); 
		assertEquals(2,suite.countTestCases());
	}
	
	
}

