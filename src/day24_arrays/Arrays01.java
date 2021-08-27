package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int sayi=10;
		String ism="ali";
		
		//javada birden fazla elemani koyabilecegimiz (store) objeler vardir
		//bugun bunlardan ilkini gorecez
		
		int arr[] = {10,20,40}; // int[] arr = seklindede yapilabilir
                                // bu ornekte arrays in elemanlarýný direk yazdðým icin
		                       // uzunluk belirtmeye gerek kalmadi
		                           // bu kullanimda max eleman sayisi (lenght 3 dur) yazdýgýmýz eleman sayisidir
		
		System.out.println(arr); //array bir objedir
		            // eger direk olrak arrayi yazdirmak isterseniz referansý yazdýrýrý
		
		System.out.println(Arrays.toString(arr)); // [10, 20, 30]
		
		String takim[] = new String[9]; // 3 elemanlý string girebilrsin
		                                 // null, null, null olur
		
		System.out.println(Arrays.toString(takim));
		
		takim[0]="ali";
		System.out.println(Arrays.toString(takim));
		
		takim[2]="hasan";
		takim[1]="veli";
		System.out.println(Arrays.toString(takim));
		
		//takim[3]="mehmet";
		// java run time programdir, dolayisiyla array programi calistirinca
		//olusturur.dolayisiiyla 37 satirdaki isaretsel olarak hata olamdigindan cte olmaz
		//program calistiginda 3.index olmadigi icin rte verir
		
		// Arraydeki bir elemani update yani guncelleme
		//velinin yerine kemal gelsin
		takim[1]="kemal";
		System.out.println(Arrays.toString(takim));
		
		//bir arrayin uzunlugunu nasil bulabiliriz
		System.out.println(takim.length);
		
		// dipnot: Strigdeki length() idi ama Arrays deki length bole
		
		
		//Arraydeki son elemani mehmet yapalim
		takim[takim.length-1]="mehmet";   // index olarak dusundugumuz icin -1 yaptýk normalde orta degr +1 ile bulunur
		System.out.println(Arrays.toString(takim));
		
		//eger arrayin eleman sayisi tek ise ortadaki elemani can yapalim
		
		if(takim.length%2==1) {
			int ortaIndex=(takim.length-1)/2;
			takim[ortaIndex]="can";
			System.out.println(Arrays.toString(takim));
			
		}
		
	}

}
