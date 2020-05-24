package week2.day1;

public class LearnString {

	public static void main(String[] args) {
	
		// literal
//		koushik
//		kihsouk
		
		/*
		 * int len = str.length(); String temp =""; for (int i = len-1; i>=0; i--) {
		 * System.out.print(str.charAt(i)); }
		 */
		
		String str = "koushik";
		char toFind = 'k';
		char[] myArr = str.toCharArray();
		int numberOfK = 0;
		for (char c : myArr) {
			if (c == toFind) {
				numberOfK++;
			}
		}
		System.out.println(numberOfK);
		
		
		
//		
		
		String name = "Welcome to Dev labs";
		
		char[] array = name.toCharArray();
//		System.out.println(array[name.length()-1]);
		
		
		
		
		/*
		 * int len = name.length(); System.out.println(name.charAt(len - 1));
		 */
		
		
		
		
		
		
		
		
//		System.out.println(name.trim());
//		
//		System.out.println(name.length());
		
		
		
		
		
		
//		System.out.println(name.toUpperCase());
//		System.out.println(name.toLowerCase());
		
		
		
		
		
//		String str = new String("Welcome"); // object
		
		
		
		
		
		
		
//== eqals
	}

}
