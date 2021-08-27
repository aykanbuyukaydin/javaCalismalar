package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
List<String> list = new ArrayList<>();
		
		list.add("ali");
		list.add("can");
		list.add("ayse");
		list.add("fatma");
		System.out.println(list);
		
		// set methodu istenen indexdeki elemani kaldirip yerine bizim istedigimiz elemani koyar
		list.set(2, "kemal"); // indexi 2 olan yere kemali getirecek ayse gidecek
		System.out.println(list); // ali can kemal fatma
		
		list.set(0, "semih");
		System.out.println(list); // semih can kemal fatma
		
		//list.set(4, "mustafa");  // olmayan bir index 4 yok ,oldugu icin hata rte verir

		
		list.add(2, "yasin");
		System.out.println(list);
		list.add(5, "hurriyet");
		System.out.println(list);
		// list.add(10, "sefer"); size den buyuk index kabul etmez hata verir
		
		list.contains("hurriyet"); // listede hurriyet var mý yok mu der bize true dondurur
		System.out.println(list.contains("hurriyet")); // true
		
		// listin elemanlarini siralayiniz
		Collections.sort(list); // collections classýndan cagýrýrýrýz sort ile
		System.out.println(list);
	}

}
