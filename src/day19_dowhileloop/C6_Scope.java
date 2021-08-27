package day19_dowhileloop;

public class C6_Scope {

	public static void main(String[] args) {
		// bir class icerisinde olusturulan veriable lerin nerede gecerli oldugunu
		// ve nereden kullanilabilecegini o veriablenin scope u belirler
		// google java da scope nedir?
		// gecerlilik alani,kapsam,bir veriablenin nerelerde gecerli oldugunu soyluyor
		
		
		int sayi=10;
		denemeMethod();
        sayi++;
        System.out.println(sayi);
        //System.out.println(isim);
	}

	public static void denemeMethod() {
		//sayi=20;
		String isim = "mehmet";
		
		
	}

}
