package week2.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnString4 {
	public static void main(String[] args) {
		
		String s = new String("hello");
		s.concat("hey");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("hey");
		System.out.println(sb);
		StringBuilder sbi = new StringBuilder("hello");
		sbi.append("hey");
		System.out.println(sbi);
		
	
		/*
		 * String str = "hey I have 11 candidates"; // 11
		 * System.out.println(str.replaceAll("\\D", ""));
		 * 
		 * 
		 * String s = "Hey\"s"; System.err.println(s);
		 */

		//	System.out.println(str.replace('e', ' '));
		//	System.out.println(str.replaceAll("e", ""));
	}
}
