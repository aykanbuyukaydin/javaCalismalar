package day45_collections;

import java.util.LinkedList;

public class C4_LinkedList04 {

	public static void main(String[] args) {
		
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("a");
		ll1.add("b");
		System.out.println(ll1);
		
		ll1.contains("a"); // a içeriyor mu ? true yada false doner syso su
		System.out.println(ll1.contains("a")); // true
		
		
		LinkedList<String> ll2 = new LinkedList<>();
		ll2.add("a");
		ll2.add("b");
		ll2.add("c");
		ll2.add("d");
		System.out.println(ll2);
		
		System.out.println(ll2.containsAll(ll1)); // ll1 in elemanlarini iceriyor mu ? true
		System.out.println(ll1.containsAll(ll2));//ll2 nin elemanlarini iceriyor mu //  false
		
		System.out.println(ll2.get(2)); // bize 2 indexleri elemani yazdircaz // c verir
		
		System.out.println(ll2.getFirst());//ilk elemani getirir a
		System.out.println(ll2.getLast());//son elemaný getirir d
		
	}

}
