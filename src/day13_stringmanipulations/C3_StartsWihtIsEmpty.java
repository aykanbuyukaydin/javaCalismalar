package day13_stringmanipulations;

public class C3_StartsWihtIsEmpty {

	public static void main(String[] args) {
		// 
		String str = "her gun java olsa" ;
		System.out.println(str.startsWith("h"));
		System.out.println(str.startsWith("her g"));
		
		System.out.println(str.startsWith("g", 4));
		
		System.out.println(str.startsWith("s"));
		
		
		System.out.println(str.isEmpty()); // false
		String str2 = "" ;
		System.out.println(str2.isEmpty()); // true
		String str3 = null ;
		
		System.out.println(str3.isEmpty()); // RTE verir
				
		

	}

}
