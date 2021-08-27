package day09_ternary;

public class C1_ternary1 {

	public static void main(String[] args) {
		int sayi=10;
	String sonuc = (sayi%2==0) ? "cift sayidir" : "tek sayidir" ;
    System.out.println(sonuc);
    
    // ben bir veriableye assing etmek istemesem ne yapabilirim
    // syso yicine yazabiliriz
    System.out.println((sayi%2==0) ? "cift sayidir" : "tek sayidir");
    
    // eger  basýna acýklama yazmak istersem
    
    System.out.println("islem sonucu " + ((sayi%2==0) ? "cift sayidir" : "tek sayidir"));
    
	}

}
