package day49_maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps04_VeriTabani {

	public static void main(String[] args) {
		// methoda ne yolluyorum
		//string dosya yolunu
		//methoddan ne donduruyor
		//map bu <string, string>  dosyaya gore yapariz
		
		String dosyaYolu="C:\\Users\\hbsdellpc\\Desktop\\maps veri tabani.csv";
		Map<String,String> veriMap=veriTabaniAl(dosyaYolu);
		System.out.println(veriMap);

	}

	public static Map<String, String> veriTabaniAl(String dosyaYolu) {
		
		Map<String, String> eklenecekMap=new HashMap<>();
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));  // dosyayý okumak icin kullanýn class
			String satir=br.readLine();// bir satýrý oldugu gibi okuyo
			// satýr="isim,ali"
		while(satir !=null) {	
			System.out.println(satir);
		String keyValue[]=satir.split(";"); // [ iism, ali] olarak yaptý
		
		eklenecekMap.put(keyValue[0], keyValue[1]);
		satir=br.readLine();  
		}
		
		} catch (IOException e) {
			
			e.printStackTrace(); // detayli hatayi verir
		} 
		
		
		return eklenecekMap;
	}

}
