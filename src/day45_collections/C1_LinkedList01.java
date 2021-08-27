package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		// linked bagli demek
		//linked listte tum elemanlar tren gibi birbirine baglidir
		
		//Collections da obje olustururken olusturmak istedigimiz collectionun
		//class mi yoksa interface mi olduguna bakmalýyýz
		//eger olusturmak istedigimiz collection interface ise data turu olarak o 
		//interfaceyi constructor olarak ise uygun bir class secmeliyiz
		//simdiye kadar list(interface) olarak constractor olarak Arraylist() seciyorduk
		List<String> liste = new ArrayList<>();
		liste.add("x");
		liste.add("y");
		
		LinkedList<String> ll1=new LinkedList<>();
		
		ll1.add("a");
		ll1.add("b");
		System.out.println(ll1);
		ll1.add(1, "c");
		System.out.println(ll1);
		ll1.addAll(liste);
		System.out.println(ll1);
		ll1.addAll(2, liste);
		System.out.println(ll1);
		ll1.addLast("k");
		System.out.println(ll1);
		//LinkedList List ve Queue interface lerine implement ile child
		//oldugundan her iki interfacedeki tum methodlari override etmek
		//zorundadir
		//islev olarak ayni isi yapan addLast() queue dan ve add() ise List den
		//inherit edilmisitr
		
		//ben bir LinkedList olusturmak istiyorum ama sadece List ozelliklerini 
		//tasisin
		List<String> listList = new LinkedList<>();
		listList.add("sadece list ten gelen ozellikler var");
		
		//ben bir LinkedList olusturmak istiyorum ama sadece Queue den ozelliklerini 
		//tasisin
		Queue<String> queueList = new LinkedList<>();
		queueList.add("sadece queue den gelen ozellikler var");
		
		

	}

}
