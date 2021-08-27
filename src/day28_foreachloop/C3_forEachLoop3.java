package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_forEachLoop3 {

	public static void main(String[] args) {
		// verilen bir array dekitum elemanlari bir list e aktaran bir
		//method yaziniz
		
		String arr[]= {"ali", "veli", "ayse", "fatma" };
		
		List<String> list = listeyeCevir(arr);
		
		list.add(0, "bu is bu kadar");
		System.out.println(list);

	}

	public static List<String> listeyeCevir(String[] arr) {
		
		List<String> geciciList = new ArrayList<>();
		
		for (String each : arr) {
			
			geciciList.add(each);
		}
		
		
		return geciciList;
	}

}
