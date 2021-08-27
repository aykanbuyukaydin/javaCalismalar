package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("ali");
		list.add("can");
		list.add("ayse");
		list.add("fatma");
		
		System.out.println(list); // ali can ayse fatma
		
		System.out.println(list.size()); // 4 verecek
		
		System.out.println(list.remove(1)); // indexi 1 olan cani silip sildigi elemamni bana döndürecek
	    System.out.println(list); // artýk ali ayse fatma oldu
	    
	    System.out.println(list.remove("ayse")); // ayseyi silecek bize true yazdircak
	    System.out.println(list); // yeni listti verdi ali fatma
	    
	    System.out.println(list.remove("mehmet")); // mehmeti bulamadýgý icin silemeyecek ve bize false olarak donecek
	    System.out.println(list); // ali fatma olarak tekrar yazýlmýs olur
	    
	    list.remove(1);
	    list.remove("ali");
	    System.out.println(list); // [] verecek
	
	}

}
