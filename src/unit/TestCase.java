package unit;

import java.lang.reflect.Method;

public class TestCase implements Test {
	public String methodName;

	public TestCase(String methodName) {
		this.methodName = methodName;
	}
	
	public void setUp(){
		
	}
	
	public void tearDown(){
		
	}
	
	public int countTestCases(){
		return 1;
	}
	
	public void run(TestResult result) {
		//TestResult result = new TestResult();
		result.testStarted();
		this.setUp();
		try{
			Method method = this.getClass().getMethod(methodName);
			method.invoke(this);
		}catch(Exception e){
			result.testFailed();
		}
		this.tearDown();
		//return result;
	}

}
