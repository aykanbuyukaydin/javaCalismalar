package day40_exceptinon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException , IOException{
	

		FileInputStream fis = new FileInputStream("C:\\Users\\hbsdellpc\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");
//try-catch blogu exception blogu handle etmek ile kullanilir yani kod calismaya devam eder
		//throw keywordu ise declaration dolayisiyla throw kullanilan bir methodda 
		//exception olursa kod bloke olur
		
		
		int k = 0;

		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
		//eger birden fazla exception icin throw keywordu kullanacaksak yazacagimiz
		//exceptionlarin arasindaki iliski ve siralama onemli olur
		//eger yazdigimiz exceptionlar arasinda parent child iliskisi varsa once
		//child exception yazilmalidir aksi takdirde child exception erisilemez olur
		
		//eger yazacaklarimiz arasinda parent-child iliskisi varsa
		//istersek sadece parent'i yazmamiz da yeterli olur.
	}

}


/*
Throws Throw farki
Throw keyword'u 1 exc. firlatmak icin. Throw declare etmiyor
Throws ise bir veya daha fazla exc.'i declera etmek icindir. "," ile ayrilarak yazilabilir.

Throw method'un icinde kullanilir.
Throws keyword ise method signature'inda kullanilir.

 Throw'dan sonra new diyip exc. turunu yazmamis lazim.
 Throws'dan sonra sadece exc. turu yazilmasi yeterlidir.

*/