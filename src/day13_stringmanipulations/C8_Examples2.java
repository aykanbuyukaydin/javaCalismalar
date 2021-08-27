package day13_stringmanipulations;

public class C8_Examples2 {

	public static void main(String[] args) {
		// string seklinde verilen degerleri toplatiniz
		
		// String str1= "$13.99"
		// String str2= "$10.55"
		
		//ipucu Double.parseDouble() methodunu kullanabilirisin
		
		String str1= "$13.99";
		str1=str1.replaceAll("\\D", "");
		System.out.println(str1);
		
		
		String str2= "$10.55";
		str2=str2.replaceAll("\\D", "");
		System.out.println(str2);
		
		// str1 ve str2 icerigini sayi olan stringlerdir
		// eger iceriginin tamamem sayi oldugunu bildigimiz string varsa
		// parseDouble() veya parseInteger() metotut kullanabiliriz
		// ancak primte data tipleri metota sahip olmadiklarindan wrapper class kullanmak lazim
		
		double sayi1=Double.parseDouble(str1);
		double sayi2=Double.parseDouble(str2);
		double toplam = (sayi1+sayi2)/100 ;
				System.out.println("$" + toplam);
				System.out.println(str1+str2);
		
	}

}
;