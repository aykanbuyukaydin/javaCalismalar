package day49_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin kacar kez 
		//kullanildigini return eden bir method yaziniz
		//ornek helloo h=1 e=1 gibi
		
		//= varsa map vardýr
		
		//methoda ne gonderecegim
		//string input ="hellooo"
		
		//methoddan ne return edecek
		//map<string,ýnteger>
		
		String input= "Hellooo";
		//kontenýr =method call olacak
		Map<String,Integer> methoddanGelenMap=harfSayisiBul(input);
		
		System.out.println(methoddanGelenMap);

	}

	public static Map<String, Integer> harfSayisiBul(String input) {
	
		String harfler[]=input.split("");
		System.out.println(Arrays.toString(harfler));
		
		Map<String,Integer>harfKullanimSayisi=new HashMap<>();
		for (String each : harfler) { //icine koyacagim bir map yok uste bir map olusturalým
			if (!harfKullanimSayisi.containsKey(each)) { //mapim o harfi içermiyorsa
				harfKullanimSayisi.put(each, 1); //mape ekle
			}else {   //iceriyorsa o harfi map
				harfKullanimSayisi.put(each, harfKullanimSayisi.get(each)+1); // map e ekle ama valutu getir ekle	
			
		}
				
		}
		
		return harfKullanimSayisi;
	}

}
