package learnCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
	
	
	public static void main(String[] args) {
		Map<Integer, String> empRecords = new LinkedHashMap<Integer, String>();
		empRecords.put(10001, "Monika");
		empRecords.put(10001, "koushik");
		empRecords.put(10023, "Mainak");
		empRecords.put(10058, "Komal");
		empRecords.put(10036, "koushik");
		empRecords.put(10044, "Sahil");
		System.out.println(empRecords);
		for (Entry<Integer, String> eachEntry : empRecords.entrySet()) {
			System.out.println(eachEntry.getKey()+" --> "+ eachEntry.getValue());
		}
		boolean containsKey = empRecords.containsKey(10036);
		
		Collection<String> values = empRecords.values();
		Set<Integer> keySet = empRecords.keySet();
//		String string = empRecords.get(10044);
//		System.out.println(string);
		
		
	}

}
