package learnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>(); 
		System.out.println(fruits.isEmpty());
		fruits.add("apple");
		fruits.add("pine");
		fruits.add("grape");
		fruits.add("watermelon");
		fruits.add("orange");		
		fruits.add("Mango");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		/*
		 * for (String eachFruits : fruits) { System.out.println(eachFruits); }
		 */
//		boolean remove = fruits.remove("apple1");
//		System.out.println(remove);
//		System.out.println(fruits);
//		fruits.set(2, "strawberry");
//		System.out.println(fruits);
//		System.out.println(fruits.size());
//		System.out.println(fruits.get(fruits.size() - 1));
//		System.out.println(fruits.isEmpty());
//		
//		boolean contains = fruits.contains("Strawberry");
//		fruits.re
//		fruits.clear();
//		System.out.println(fruits.size());
//		fruits.removeAll(fruits);
//		System.out.println("is avail "+contains);
//		fruits.get(15);
		
//		List<Object> myList = new ArrayList<Object>();
//		Object webElement = myList.get(0);aa
//		webElement.
//		webElement.
//		webElement.
		/*
		 * myList.add("Koushik"); myList.add("Mainak"); myList.add("Monika"); String
		 * string = myList.get(0);
		 */
		
		/*
		 * List<Integer> money = new ArrayList<Integer>(); money.add(1); money.add(100);
		 */
//		money.add("lakdsnl");
	}

}
