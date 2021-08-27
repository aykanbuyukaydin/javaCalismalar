package day13_stringmanipulations;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		// 

		String str = "Javayla hayat ne guzel" ;
		
		System.out.println(str.endsWith("zel"));
		
		System.out.println(str.endsWith("ne guzel"));
		
		System.out.println(str.endsWith("zel "));
		
		// kullanicidan bir mail isteyin
		// eger @ isareti içermiyorsa girdiginiz bilgi email degil
		// eger @ isareti iceriyor ama gmail.com icermiyorsa lutfen gmail adresi yazýn
		// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa gecersiz gmail adresi yazsýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir mail adresi girin");
		String email = scan.next();
		
		
		if (! email.contains("@")) { // basina ! koyunca icermiyorsa demek istedi
			System.out.println("giridiginiz bilgi email degil");
		}else if (! email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresi yaziin");
		}else if (email.endsWith("@gmail.com")) {
			System.out.println("email adresiniz basarili ile kaydedildi");
		}else {
			System.out.println("gecersiz mail adresi");
		}
	}

}