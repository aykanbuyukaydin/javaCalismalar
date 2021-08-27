package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps03 {

	public static void main(String[] args) {
		Map<Integer, String> map1=new HashMap<>();
		map1.put(101, "ali, can, java");
		map1.putIfAbsent(102,"veli, yan, java");
		map1.put(103, "ali, yan, c#");
		
		
	System.out.println(map1.get(101));
	
	System.out.println(map1.get(105)); //null
	System.out.println(map1.getOrDefault(105, "aradiginiz key map de yok")); //daha kullanýslý
	
	System.out.println(map1.keySet()); //bir set olarak keyleri verir
	
	map1.replace(103, "mesut, aksu, java"); // put ilede bu islemi yapabiliriz
	

	Map<String, Integer> map2 = new HashMap<>();
	map2.put("h", 1);
	map2.put("e", 2);
	map2.put("l", 2);
	map2.put("o", 3);
	System.out.println(map2);
	
	map2.compute("h", (key,value) -> 10); //key olarak h yi bul value 10 yap diyor
	System.out.println(map2);
	
	map2.computeIfAbsent("a", v -> 15);
	System.out.println(map2);
	map2.computeIfAbsent("h", v->5); //h yoksa key olarak h yi v olarak 5 i ekle demek
	System.out.println(map2);;
	
	map2.computeIfPresent("h", (key,value)->20);
	map2.computeIfPresent("m", (key,value)->20);
	System.out.println(map2);
	
	
	

	}

}
