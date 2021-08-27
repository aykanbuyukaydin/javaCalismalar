package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci{

	public  String bolum="takimhane";
	public int sorOldIsciSay=20;
	
	public static void main(String[] args) {
		
		UstaBasi ub1 = new UstaBasi();
		//objeyi torun classindan olusturunca 3 classa da ulasabiliriyoruz
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIsciSay);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
		
		//List<String> list = new ArrayList<>();
		//Object str = new String("hasan");
		
		Isci ub2 = new UstaBasi();
		// extends ile birbirne bagli olan classlarda IS-A relation
		//data turleri istebe bagli olarak kullanilabilir
		//daha genis data turu yazmanin avantaji:
		//kapsamin daha genis olmasi
		//daha genis data turu yazmanin dezavantaji :
		//data turu olarak sectigimiz class ve parent larina ait datalara ulasabiliriz
		//ornegin ub2.bolum ulasamayiz
		
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
		
		Personel ub3 = new UstaBasi();
		System.out.println(ub3.id);

	}

}
