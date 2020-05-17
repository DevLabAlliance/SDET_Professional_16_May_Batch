package week1.day1;

public class LearnCondition {
	
	public static void main(String[] args) {
		
		int i = 1;
		String expectedTitle = "Amazon";
		String actualTitle = "amazon";
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
		
		
		
		
		
		if(i == 0) {
			System.out.println("hey I am 0");
		}else {
			System.out.println("Something wrong");
		}
		
		
	}

}
