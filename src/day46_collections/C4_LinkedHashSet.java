package day46_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class C4_LinkedHashSet {

	public static void main(String[] args) {
		// 
		
		Set<String> set1=new LinkedHashSet<>();
		set1.add("d");
		set1.add("b");
		set1.add("a");
		set1.add("f");
		set1.add("d");
		System.out.println(set1);

		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000; i++) {
			set1.add(""+i);
		}
	    System.out.println(System.currentTimeMillis());
	    
	    System.out.println("========");
	    
	    System.out.println(System.currentTimeMillis());
	    Set<String> set2 = new HashSet<>();
	    for (int i = 0; i < 1000; i++) {
			set1.add(""+i);
		}
         System.out.println(System.currentTimeMillis());
         
         
         
	}

}
