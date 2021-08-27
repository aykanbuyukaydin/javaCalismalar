package day48_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		
		map1.put(101, "ali, can, java");
		map1.put(102, "veli, yan, java");
		map1.put(103, "ali, yan, c#");
		System.out.println(map1);
		
		map2.put(101, "vehbi, bas, java");
		map2.put(102, "esra, coban, sql");
		System.out.println(map2);
		
		map1.putAll(map2); //map1 sýnuna map2 eklenmis oldu ama keyleri ayný 101 ve 102 haliyle onlarýn yerine yenisini koymus olacak
		System.out.println(map1);
		//map e yeni bir entry eklemek istedigimde java key e bakar
		//ilk mapte eklenecek key varsa o zaman bu key ait value, eklneen value ile update olur

		map2.put(104, "omer, arý, sql");
		map1.putAll(map2);
		System.out.println(map1); // 104 u sonuna eklemis oldu
		
		map1.putIfAbsent(102, "ahmet, demir, java");
		System.out.println(map1);
		map1.putIfAbsent(100, "ahmet, demir, java");
		System.out.println(map1);
		//keyinde o key yoksa ekle, eger key im ile ayný ise ekleme o value yi
		
		System.out.println(map1.containsKey(101)); //true
		System.out.println(map1.containsValue("java")); //false
		System.out.println(map1.containsValue("vehbi, bas, java")); //true
		//aranan degere tam olarak esit bir value varsa true dondurur
		//value icinde gecen veya stringleri bulmaz
		
		
	}

}
