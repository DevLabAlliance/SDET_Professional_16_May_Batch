package testNGAttributes;

import org.testng.annotations.Test;

public class LearnAttributes {

	/*
	 * @Test(dependsOnMethods = "testNGAttributes.LearnAttributes.sleep") public
	 * void eat() { System.out.println("eat"); throw new RuntimeException(); }
	 */
	  @Test(alwaysRun = true, dependsOnMethods =
	  "testNGAttributes.LearnAttributes.sleep") public void code() {
	  System.out.println("code"); }


	@Test(alwaysRun = true,
			enabled = false,
			description = "this is my testcase")
	public void sleep() {
		System.out.println("sleep");
	}
	
	
	
	
	//	@Test(dependsOnMethods = "sleep")
	//	public void repeat() {
	//		System.out.println("repeat");
	//	}



}
