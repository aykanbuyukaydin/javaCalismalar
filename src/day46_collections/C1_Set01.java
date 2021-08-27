package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

	public static void main(String[] args) {
		
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

		System.out.println(set1.hashCode());
		
		set1.add("m");
		set1.add("e");
		System.out.println(set1);
		//set de onemli olan ozellik no duplication ve elemanýn kumede var olup olmamasýdýr
		//sýralama set icin onemli degildir
		//set icin elemanlari girdigimiz sýrada verir veya elemanlari natural sýralama ile
		//verir gibi bir cumle kuramayýz
		
		System.out.println(set1.hashCode());
		// Collections'da hashCode() method'u o collection icindeki tum 
        // elemanlarin hash code'larinin toplamini verir
        // yeni eleman eklersek dogal olarak hash code da degisir
	}

}
