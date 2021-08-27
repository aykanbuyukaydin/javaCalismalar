package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	public static void main(String[] args) {
		/*eger kodumuzu yazdigimizda birden fazla exception ile iliskili durum oluyorsa
		 * icice try-catch bloklari olusturabiliriz
		 * bu ornekte ilk once dosyayi okutmak istedik
		 * java ya dosyayi bulamazsam diye bizden yardim istedi
		 * biz de try-catch blogu ile FileNotFoundException ile handle etmesinde yardýmcý olduk
		 * sonra dosyadaki yazilari okumaya calýstýk ve java yeniden ya dosyayi okuyamazsdam
		 * diye yardým istedi
		 * biz de try-catch blogu ile IOException ile handle etmesini sagladýk 
		 
		  
		 */
		
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\hbsdellpc\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");
		
		int k=0;
		try {
			while ((k=fis.read())!=-1) {
				System.out.print((char)k); //
			}
		} catch (IOException e) { // dosyalatla ilgili genel yazma ve okuma sorunlari ile handle eder
			
			e.printStackTrace();
		}
		
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmamis");

	}

}
