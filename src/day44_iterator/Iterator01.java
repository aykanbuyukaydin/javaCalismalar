package day44_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list);
		
		//her elemana b harfini ekleyelim
		
		for (String each : list) {
			each+="b";
			System.out.print(each + " ");
		}
		System.out.println();
		System.out.println(list);
		
		//collections da her yapi indexi desteklemez ornegin set de index olmaz
		//index olmayacinca mecburen tum elemamnalra ulasmak icin for each loop kullanilir
		//for each loop ile de update veya delete yapamayiz
		//bunun icin java iterator interface ini olusturmustur
		
		Iterator it1=list.iterator();
		//next(), hasNext() ve remove() methodlarina sahiptir
		//listedeki tum elemanlari iterator kullanarak silelim
		
		
		while (it1.hasNext()) {
		
			it1.next();
			it1.remove();
		}
	System.out.println(list);
	System.out.println(list.size());
	}
	

}
