package day39_exception;

public class Exception07 {

	public static void main(String[] args) {
		// data turlerini casting yaparken uygun olmayan yaparsaniz
		// java ClassCastException verir 
		
		//eger tamamem sayilardan olusmayan bir stringi int a cevirmeye
		//calisirsaniz  java NumberFormatException verir
		
		int sayi = 10;
		//String str = sayi; // CTE exception degil

		String str="123456";
		
		System.out.println(str + 10); //12345610
		
		int strSayi = Integer.parseInt(str); //parseInt ==> string içi tamamem sayidan olusuyorsa bunu int cevirebiliriz
		System.out.println(strSayi + 10); //123466
		System.out.println(str+20);//12345620
		
		String str2="123a45";
		//System.out.println(Integer.parseInt(str2)); // NumberFormatException
	//a oldugunu icin boyle bir seyi numbere ceviremezsin dedi
		
		Object sayi2=40;
		String SayiStr=(String)sayi2; //explicit narrowing casting // sayiyi string oluyor ya
		                        //ClassCastException  // sýnýflar farklý olmuyor
	}

}
