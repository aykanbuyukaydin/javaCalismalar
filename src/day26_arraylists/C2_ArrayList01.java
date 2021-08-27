package day26_arraylists;




import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {
		// bir arrayList nasýl olustururlur ?
		//array list bir objedir dolayisiyle yeni bir tane olusturmak icin 
		//new keyword kullanmayiliz
		
		//1.yol
		ArrayList<String> list = new ArrayList<String>();
		
		//2.yol
		ArrayList<String> list2=new ArrayList();
		
		// 3.yol
		List<String> list3=new ArrayList<>(); // en cok bunu kullaniriz
		
		//eger constructor olarak list<>() kullanýlýrsa cte verir
		//List<>() constructor olarak kullanilmaz
		
		// List<String> list4=new List<>();  hata verir
		
		//not olusturdugumuz class isimleri javada obje isimleriyle ayni olmamalidir!!
		
		//Liste eleman ekleme;
		//list olustururuken otomatik olarak eleman ekleme ozelligi yoktur
		//elemanlarin tek tek eklenmesi gerekir
		list3.add("ali");
		list3.add("veli");
		list3.add("ayse");
		// list nasil yazdirilir
		System.out.println(list3);
		
		list3.add(1, "can"); // 1.indexe intenen degeri yazar
		System.out.println(list3);
		list3.add(1, "fatma"); // 1.indexe yapmaya devam eder
		System.out.println(list3); 
		
		// Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
	    //kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
			
			int arr[]= {2,3,5,3,6,4,3,6,7}; // {2,5,6,4,6,7} olmasini istiyoz ornegin istenmeyen sayi 3 olsun
			int sayi=3;
		
		List<Integer> istenenList=new ArrayList<>(); // ýNTEGER OLARAK YAZMAMÝZ GEREKÝYOR
		
		
			
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=sayi) {
				istenenList.add(arr[i]);
			}
		}
		
	System.out.println(istenenList);
		
	}

}
