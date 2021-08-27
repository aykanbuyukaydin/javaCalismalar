package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Array (dizi) : javada birden fazla veriabla store etmek icin kullanilan
		// objelerden biridir
		
		int arr[] = {10,23,54}; // lenght =3 dur
		String isimler[]= new String[4]; // lenght =4 olan bos bir array olusturur
		
		//array de primitiv datalar veya nun orimitiv datalarin referanslari store edilebilir
	// mesela isimler array nin icinde degerleri degil,isimleri referans olur
		
		//arrayin elemanlarina ulasma ve update etme
		
		System.out.println(isimler[1]); // array�n 2. elemnaninin degeri yazdir
		
		isimler[2]="boss";
		isimler[0]="elveda";  // 1 ve 3 elemanlar�n� atad�k
		
		//arrayin tum elemanlar�n� yazd�rma;
		System.out.println(isimler);  // referanslarini yazdirir
		
		System.out.println(Arrays.toString(isimler)); // array�n kendisini yazdirma
		
		// method kullanmadan tum elemanalri yazdiralim:
		// loop kullanmamiz lazim
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr); // referans� gelir
		
		System.out.println(Arrays.toString(arr)); // array kensini yazdirir
		
		// array �n elemanlar�n� s�rlamak icn
		
		isimler[1]="oguzhan";
		isimler[3]="bilal";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
	
	}

}
 