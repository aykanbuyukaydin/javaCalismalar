package day38_exception;

public class Exception03 {

	public static void main(String[] args) {
		// try catch blogundaki e nin gorevi
		
		int sayi1=10;
		int sayi2=0;
		
		Exception01 exp = new Exception01();
		//esitligin solundaki Exception01 hem class adi hem de exo objesi icin data turu
		
		try {
		System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e) {
			//ArithmeticException javada bir class ve e objesi icin data turu
			//e ise ArithmeticException classin da olusturdugumuz objenin adi
			//o zaman ismi e olmak zorunda degiliz ama genelde e kullanilir
			System.out.println("sayiyi sifira bolemezsin");// bizim kullaniciya vermek istedigimiz mesaj
			System.out.println(e); //java.lang.ArithmeticException: / by zero
			//bu durumda hem javaya sorunu yazmasi icin firsat vermis
			//hemde aplication i bloke etmis oluruz
			System.out.println(e.getMessage()); // / by zero

			
			e.printStackTrace();//java.lang.ArithmeticException: / by zero
			                    //at day38_exception.Exception03.main(Exception03.java:15)

		}
System.out.println("kod bloke olmamiss");
	}

}
