package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list);
		
		//her elemana b harfini ekleyelim
		
		ListIterator li1=list.listIterator();
		while(li1.hasNext()) { //benim listim icinde eleman var olugu surece ileri dogru gidecek
		
			String temp =(String) li1.next();
			li1.set(temp + "b");
			
		}
System.out.println(list);
	}

}
