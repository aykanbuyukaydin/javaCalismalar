package day45_collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		//collection da esitligin sol tarafýna data turu yazilmasa veya
		//data turu olarak object yazilsa collections calisir
		//ama böyle bir kullanýmda sürekli casting yapildigi icin
		//zaman ve hafiza acisindan verimli degildir
		
		LinkedList<Object> ll1 = new LinkedList<>();
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000; i++) {
			ll1.add("a"+i);//concatanion
			ll1.add(20+i);//toplama
			ll1.add('c'+i);//ascii degerleri
		}
		System.out.println(System.currentTimeMillis());
		//System.out.println(ll1);
		
		System.out.println("*************");
		System.out.println(System.currentTimeMillis());
		LinkedList ll2 = new LinkedList<>();
		for (int i = 0; i < 1000; i++) {
			ll2.add("b"+i);
			ll2.add(25+i);
			ll2.add('k'+i);
		}
		System.out.println(System.currentTimeMillis());
		//System.out.println(ll2);
		
		System.out.println("*************");
		System.out.println(System.currentTimeMillis());
		LinkedList<String> ll3 = new LinkedList<>();
		for (int i = 0; i < 1000; i++) {
			ll3.add("d"+i);
			ll3.add("" + 15+i);
			ll3.add("" +'z'+i);
		}
		
		System.out.println(System.currentTimeMillis());
		//System.out.println(ll3);


	}

}
