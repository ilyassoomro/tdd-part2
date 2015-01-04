package unit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {

	public boolean wasRun;
	
	
	public WasRun(String methodName) {
		super(methodName);
		wasRun = false;
		//this.methodName = methodName;
	}
	public void testMethod() {
		wasRun = true;
	}
}
