package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		// herhangi bir sayinin 7 ile bolunebildigini
		//kontrol etmek icin modulus islemi kullan�r�z
		
		int kalan = 15 % 4 ;
		System.out.println(kalan);
System.out.println(26 % 8);


// 856 say�s�n�n birler basamag� kacdir
int sayi = 856;
int birlerBasamagi = sayi % 10;
System.out.println("sayinin birler basamagi " + birlerBasamagi);

//856 say�s�n�n onlar basamag� kacdir
sayi /= 10;
System.out.println("sayi ona bolununce degeri: " + sayi);

int onlarBasamagi = sayi % 10;
System.out.println("onlar basamagi: " + onlarBasamagi);

sayi /= 10;
System.out.println("yuzler basamagi: " + sayi);
	}

}
