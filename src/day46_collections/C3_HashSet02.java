package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet02 {

	public static void main(String[] args) {
		// 
		
		Set<String> set1 = new HashSet<>();
		set1.add("f");
		set1.add("b");
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("b");
		set1.add("a");
		set1.add("y");
		set1.add("d");
		System.out.println(set1);
		
		set1.clear();
		System.out.println(set1);
		
		set1.add("f");
		set1.add("b");
		set1.add("a");
		set1.add("b");
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<>();
		set2.add("b");
		set2.add("f");
		set2.add("a");
		System.out.println(set2);
		
		System.out.println(set1.containsAll(set2)); //set1 set2 yi i�eriyor mu // true
        System.out.println(set1.equals(set2)); // set1 set2 ye esit mi // true
        
        set1.removeAll(set2); //set1 icindeki set2nin butun elemanlar�n� c�kar
        System.out.println(set1); //c�kar�nca esit olduklar� icin bos olmus oldu
        System.out.println(set2);
        
        set1.add("f");
		set1.add("b");
		set1.add("a");
		set1.add("d");
		System.out.println(set1);
        
        set1.retainAll(set2); // set1 icindeki set2 nin elemanlar�n� tut di�erlerini sil
        System.out.println(set1);
        System.out.println(set2);
        
		
	}

}
