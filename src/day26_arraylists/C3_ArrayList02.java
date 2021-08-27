package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// listin uzunlugu nasil bunulur
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		System.out.println(list);
		
		list.size();  //uzunlugu size den buluyoruz
		System.out.println(list.size());

		//bir eleman nasil silinir
		list.remove(1); // index 1 i kaldirsin
		System.out.println(list);
		
		System.out.println(list.remove(2)); // git 12 yi listeden kaldir diyoz(index i 2 ya) ve 12 yi getirir
                                            //length-1 olarak dusun son harfi yazdiriyordu ya
		
	System.out.println(list); // simdi 12 yi kaldirip yazdirmis olduk
	
	//System.out.println(list.remove(5)); // git 5.indexdeki elemani listeden kaldir dedik
	//ama 5. index yok rte verir 
// tekrar yazayim : remove(index) kullandigimizda o indexdeki elemani remove eder
	//eger olmayan bir index giresek rte verir
	List<String> list2 =new ArrayList<>();
	
	list2.add("ali");
	System.out.println(list2.remove("hasan")); // git hasani kaldir dedik
	System.out.println(list2);
	// listede hasan yok false verir 
	//int da index ile karýstýgý için o yuzden hata veriryor
	
	// remove(obje) methodu kullanildiginda eger java istenen elemani bulup remove ederse
	//bize remove edilen elemani döndurur, listede bulamazsa istegin yerine
	//getirelemedigini anlamazýn icin false olarak dondurur
	
	System.out.println(list2.remove("ali")); // true olarak dondu yani aliyi kaldirdi
	System.out.println(list2); // dersek boþ bir array cýkmýs oldu 
	
	
	
	}

}
