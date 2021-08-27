package day49_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps01 {

	public static void main(String[] args) {
		
		Map<Integer, String> map1=new HashMap<>();
		map1.put(101, "ali, can, java");
		map1.putIfAbsent(102,"veli, yan, java");
		map1.put(103, "ali, yan, c#");
		System.out.println(map1);
		
		System.out.println(map1.size());
		
		System.out.println(map1.entrySet()); // set oldu ama ayný kalýp olarak ceviriyor
		
		System.out.println(map1.entrySet().size()); // gene haliyle 3 olur entry:key,value ikiliisnden olusan tum eleman
		
		Set<Entry<Integer, String>> mapdenSet=map1.entrySet();
		for (Entry<Integer, String> each : mapdenSet) {
			
			System.out.println(each);
		}

		System.out.println(map1.equals(mapdenSet)); // haliyle false verir
		
		System.out.println(map1.get(101));
		
		
	}

}
