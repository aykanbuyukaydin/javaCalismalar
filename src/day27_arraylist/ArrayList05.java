package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		// verilen bir arrayý list te nasýl çevirebiliriz ?
		
		String arr[]= {"ali", "veli"};
		List<String> listArr=Arrays.asList(arr); // new yok 
		System.out.println(listArr);
		
		Integer arr1[]= {1,2,3};
		List<Integer> list2=Arrays.asList(arr1);
		System.out.println(list2);

		// bazen çok fazla elemaný olan bir liste olusturmamýz gerekir bu durumda liste
		//elemanlarini tek tek eklemek yerine elemanlari bir arraya ekler sonrada
		//list e çevirebilirz
		// bir web sitesindeki tüm urunlerini bir liste eklemek istediginizde
		//ancak bu methodla  arrayden cevirdigimiz list esnek olmaz
		//(arrayýn ozelliklerini tasýr) ad(),remove(),clear() gibi uzunlugu etkileyen methodlar
		//kullanilimaz
		
		arr1[1]=5; //yapalim
		System.out.println(Arrays.toString(arr1));
		System.out.println("list2 " + list2);
		// arr deki biþi degistirnce list halindede degiþiþyor
		
		// tam tersi yapalim bi listti degistirelim
		
		list2.set(2,13);
		System.out.println(list2);
		System.out.println("arr " + Arrays.toString(arr1)); // tam tersi icin de gecerli oluyo
		
		// java bu degisimdeki array ve list i senkronize eder birinde degisiklik olunca otomatik
		//olarak digerini de update eder
	}

}
