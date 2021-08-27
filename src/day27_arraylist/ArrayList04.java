package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ArrayList04 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(10);
		//list2.add(30);
		
		// equals methodu iki listeyi hem elemanlar hem de elemanlarin indexleri ile kardilastirir
		//hem elemanlar hemde indexler esit ise true d�ner yoksa false d�ner
		System.out.println(list1.equals(list2)); // false
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.equals(list2)); // s�ralama ayn� oldu ya true olmus olur
		
		list1.clear(); // bu listedeki butun elemanlari siler
		System.out.println(list1);
		
		

	}

}
