package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_ImMutable01 {

	public static void main(String[] args) {
		
		String isim = "ali";
		isim.concat("can");
		System.out.println(isim); // ali 
		
		System.out.println(isim.concat("can")); // alican
		System.out.println(isim); // ali ��kar
		
		// String lerde method ile yapt�g�m�z degisiklikler kalici olmaz
		//cunku jaava string clas�n� �mmutable yapm�st�r
		
		List<String> isimList = new ArrayList<>();
		System.out.println(isimList);
		isimList.add("ali");
		isimList.add("can");
		System.out.println(isimList);
		isimList.remove(1);
		System.out.println(isimList);

		// list lerde method ile yaptigimiz degisiklikler kalici olarak list e islenir
		//cunku list mutable dir
	}

}
