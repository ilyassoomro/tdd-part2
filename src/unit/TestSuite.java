package unit;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class TestSuite {

	private ArrayList<TestCase> tests;
	
	public TestSuite(){
		tests = new ArrayList<TestCase>();
	}
	
	public void add(TestCase testCase){
		tests.add(testCase);
	}
	
	public void run(TestResult result) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//TestResult result = new TestResult();
		if(tests.size()>0){
			for(TestCase testCase: tests){ 
				testCase.run(result);
			}
		}
		//return result;
	}
	
	
	
	
}
