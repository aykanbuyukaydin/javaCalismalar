package day45_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("a");
		ll1.add("b");
		System.out.println(ll1);
		
		//eger listemiz integerlerden olusuyorsa 
		//parantez icine yazdýgýmýz sayinin index mi yoksa sayi mi oldugunu
		//karýstýrmamak icin
		//java parantez icine yazýlani index olarak kabul eder
		
		System.out.println(ll1.remove(0)); // remove(index) indexdeki elemani siler 
		                                  //ve sildigi elemani bize dondurur
		System.out.println(ll1);
		
		ll1.add("a");
		ll1.add("b");
		System.out.println(ll1);
		
		System.out.println(ll1.remove("b")); // bize true dondurur
		System.out.println(ll1); // ilk b yi silmiþ oldu
		
		ll1.addFirst("b"); // en basa b ekle
		System.out.println(ll1);
		
		System.out.println(ll1.removeFirstOccurrence("c")); // c yi bulup sil false donduruur c yok cunku
		System.out.println(ll1); 
		
		//System.out.println(ll1.removeFirstOccurrence("b")); //buldugu ilk b yi isler true dondurmus olur
		//System.out.println(ll1); // ilk b yi silmiþ oldu
		
		System.out.println(ll1.remove()); // ilk elemani siler ve sildigini dondurur yani b yazdirir
		System.out.println(ll1);
		
		
	}

}
