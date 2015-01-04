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
	
	public void run() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.setUp();
		Method method = this.getClass().getMethod(methodName);
		method.invoke(this);
		this.tearDown();
		
	}

}
