package week1.day2;

public class Mobile {

	
	public String make = "OnePlus"; // global or instance var
	private int i =0;
	public void makeCall() {
		int a = 10; // local var
		System.out.println("Calling...");
	}
	
	protected void openGallery() { // inheritance
		System.out.println(make);
		System.out.println("My gallery");
	}
	
	
	public static void main(String[] args) {
		Mobile myMob = new Mobile();
//		myMob.
//		myMob.makeCall();
//		myMob.openGallery();
//		System.out.println(myMob.i);
		
	}
	
	/*
	 * protected class Some{
	 * 
	 * }
	 */

}
