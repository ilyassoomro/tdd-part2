package unit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {

	public boolean wasRun;
	public boolean wasSetup;
	
	
	public WasRun(String methodName) {
		super(methodName);
		
		//this.methodName = methodName;
	}
	public void testMethod() {
		wasRun = true;
	}
	
	public void setUp(){
		wasRun = false;
		wasSetup = true;
	}
}
