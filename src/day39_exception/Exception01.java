package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {

	public static void main(String[] args) {
		//javada bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde 
		//java ya dosyayi bulamazsam der ve izden cozum uretmemizi bekler
		//dosya bulma ile ilgili exception turu : FileNotFoundException
		//java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir
		//kodumuzu yazdigimiz anda ortaya cikan bu tur exception lara Checked Exceptions diyoruz
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\hbsdellpc\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");
		} catch (FileNotFoundException e) {
			
		//	e.printStackTrace(); //tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
		System.out.println(e.getMessage()); // daha az hata aciklamsi yazdirir
		}
	System.out.println("kod bloke olmamis");
	}

}
