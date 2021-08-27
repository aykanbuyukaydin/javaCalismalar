package day39_exception;

import java.io.FileInputStream;

import java.io.IOException;

public class Exception04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//eger handle edilecek exceptionlar araasinda parent-child iliskisi varsa
		//bu durumda child exception icin catch blogu yazmasak da kodumuz calisir
		//child exception i silmenin,
		//pozitif yani : tek catch blogu ile tum exceptionlar handle edilebilir
		//negatif yonu: biz sorunla karsilastýgýmýzda bunun dosya bulunmadigi icin mi
		// yoksa dosya okunamadigi icin oldugu anlasýlmaz
		
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\hbsdellpc\\eclipse-workspace\\winter2021turkish\\src\\day39_exception\\File");

			int k = 0;

			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
fis.close();
			}
		} catch (IOException e) { 

			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmamis");

	}

}
