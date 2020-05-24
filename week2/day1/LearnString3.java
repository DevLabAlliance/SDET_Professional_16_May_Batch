package week2.day1;

public class LearnString3 {
	public static void main(String[] args) {
		
		
		String s1 = "koushik"; // literal
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		String s3 = "koushik";
		System.out.println(System.identityHashCode(s3));
//		System.out.println(s1 == s3);
		
		// obj
		String s2 = new String("koushik");
		String s4 = new String("koushik");
		
		System.out.println(s1.equals(s2));
//		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s4));
//		System.out.println(s1 == s2);
		
		/*
		 * String newString = s1.toUpperCase(); System.out.println(newString);
		 * System.out.println(s1);
		 */
		
	}

}
