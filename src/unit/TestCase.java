package unit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
	public String methodName;

	public TestCase(String methodName) {
		this.methodName = methodName;
		
	}
	
	public void run() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = this.getClass().getMethod(methodName);
		method.invoke(this);
		
	}

}
