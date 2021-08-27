package day48_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		//asagýda verilen bir map de yazilim dili java olan kisi isimlerini
		//bir liste olarak donduren bir method yaziniz
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101, "ali, can, java");
		map1.put(102, "veli, yan, java");
		map1.put(103, "ali, yan, c#");
//ben methoda ne gonderecegim __ map ve java gondericem
//method bana ne dondurecek		___ bir list olarak isimleri return edecek
		
		String istenenDil="java";
		List<String> isimList = javaBilenler(map1, istenenDil);
		System.out.println(isimList);
	}

	public static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		//value larý birer birer al
		
		List<String> isimListesi=new ArrayList<>();
		
		for (String each : map1.values()) { // valueler string olark geldi
			
			String arr[]=each.split(", "); // 3 elemanlý arraya dondu 3 tane value
			if(arr[2].equalsIgnoreCase("java")) {
				isimListesi.add(arr[0]);
			}
		}
		
		
		
		return isimListesi;
	}

}
