package learnAnnotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Check {
	
	
	
	public Check() {
		System.out.println("construtor");
	}
	
	@Test
	void test() {
		System.out.println("test");
	}
	
	@BeforeSuite
	void suite() {
		System.out.println("suite");
	}
	
	static {
		System.out.println("static");
	}
}
