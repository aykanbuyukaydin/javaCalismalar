package day12_stringmanipulations;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		
		String str1 = "Ali Can" ;
		String str2 = str1 + "" ; // yazdirsak Ali Can goruruz
		
		System.out.println(str1==str2); ;
		System.out.println(str1.equals(str2));
	
		String str3 = "Ali Can" ;
				
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
	}

}
