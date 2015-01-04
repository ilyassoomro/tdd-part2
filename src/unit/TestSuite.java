package unit;

import java.util.ArrayList;

public class TestSuite implements Test {

	private ArrayList<TestCase> tests;
	
	public TestSuite(){
		tests = new ArrayList<TestCase>();
	}
	
	public void add(TestCase testCase){
		tests.add(testCase);
	}
	
	public void run(TestResult result){
		//TestResult result = new TestResult();
		if(tests.size()>0){
			for(TestCase testCase: tests){ 
				testCase.run(result);
			}
		}
		//return result;
	}

	public int countTestCases() {
		return tests.size();
	}
}
