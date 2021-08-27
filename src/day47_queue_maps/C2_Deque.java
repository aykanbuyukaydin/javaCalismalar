package day47_queue_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque {

	public static void main(String[] args) {
		// De: double Ended (cift taraflý)
		
		Deque<String> dk1 = new LinkedList<>();
		
		dk1.addFirst("c");
		dk1.add("m");
		dk1.add("a");
		System.out.println(dk1);
		dk1.addLast("l");
		System.out.println(dk1);
		
		System.out.println(dk1.getFirst()); // silem yada ekleme yapmadan ilk bastakini bana getircek // c
		System.out.println(dk1.getLast()); // l yi getirecek
		
	    System.out.println(	dk1.pop()); // c yi silecek
	    System.out.println(dk1);
	    
	    dk1.push("y");
	    System.out.println(dk1); // enbasa ekler
	    
	}

}
