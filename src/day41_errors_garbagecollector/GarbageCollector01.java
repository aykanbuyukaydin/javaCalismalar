package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
		
		
		String str="";
		for (int i = 0; i <1000 ; i++) {
			str+=i;
		}
	//bu kod calistiginda kac tane obje oludur ?
		//1001
		//ilk basta 1 tqne olusturduk
		//sonra her dongude str a concatination yapilacak
		//ana string class i immutable oldugu icin her yeni degeri koymak icin
		//yeni bir string objesi olusturulur ve eski objeden pointer silinir
		
		//dolayisiyla loop bittiginde str icin 1 tane pointerin isaret ettigi obje
		//1000 tane de hicbir pointerin isaret etmedigi obje heap memory de bulunur
		
		List<Integer> list = new ArrayList<>();
		//bu satýr javaya yeni bir obje olusturmasini soyluyor
		//java yeni obje icin yer var mi diye memory i kontrol eder ve memory
		//kritik seviyede ise 
		//garbage collector i devreye sokuyor....
		
		//garbage collector de finalize() methodunu calistirir
		//finalize() methodu silinecek objeleri isaretler ve 
		//sonra garbage collector finalized olan objeleri siler
	}

}
