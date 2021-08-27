package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// javada saat ile islem yapmak icin
		//LoacalTime clasýsýndan obje kullaniriz
		
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat);
		
		for (int i = 0; i < 1000000; i++) {
			i+=1;
		}
	LocalTime saat2 = LocalTime.now();
	System.out.println(saat2);    // bir for loop kaç sn de yapti bakallim :)
	
	System.out.println(saat); // ilk saati yazdirri sati guncel yazdirmaz guncel icin 
	//tekrr local obje olusturmak gerekir
	
	System.out.println(saat.plusHours(15)); // 15 ssaat oncesaat kacdý
	
	System.out.println(saat.getSecond());  // 31
	
	System.out.println(saat.minusSeconds(156789)); // bu saniden once saat kacdi
	
	System.out.println(saat.now(ZoneId.of("Japan"))); // þsu anda saat japan da kac
	
	
	}

}
