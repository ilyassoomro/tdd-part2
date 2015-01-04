package unit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
	public String methodName;

	public TestCase(String methodName) {
		this.methodName = methodName;
	}
	
	public void setUp(){
		
	}
	
	public void tearDown(){
		
	}
	
	public TestResult run() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		TestResult result = new TestResult();
		result.testStarted();
		this.setUp();
		try{
			Method method = this.getClass().getMethod(methodName);
			method.invoke(this);
		}catch(Exception e){
			result.testFailed();
		}
		this.tearDown();
		return result;
	}

}
