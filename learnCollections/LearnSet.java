package learnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
		set.add("apple");
		set.add("pine");
		set.add("grape");
		set.add("watermelon");
		set.add("orange");		
		set.add("Mango");
		set.add("apple");
		set.add("orange");
		set.add("apple");
//		Collections.sort(set);
		System.out.println(set);
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		list.get(0);
//		set.get // dont have get
//		System.out.println(set);
//		System.out.println(set.size());
//		System.out.println(set.contains("apple"));
//		System.out.println(set.isEmpty());
//		System.out.println();
//		set.clear();
		
		
		
		
		
		
		
		
	}

}
