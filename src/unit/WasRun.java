package unit;

public class WasRun extends TestCase {

	public boolean wasRun;
	public String log;
	
	
	public WasRun(String methodName) {
		super(methodName);
		
		//this.methodName = methodName;
	}
	public void testMethod() {
		this.log = this.log + "testMethod ";
	}
	
	public void setUp(){
		this.log = "setUp ";
	}
	
	public void tearDown(){
		this.log = this.log + "tearDown ";
	}
	

}
