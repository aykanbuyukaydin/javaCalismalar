package day13_stringmanipulations;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		// 
		String str = "Java ogren, mutlu ol, Java candir 12345" ;
		
				System.out.println(str.replace("Java", "hava"));
     
				System.out.println(str.replaceAll("\\w", "*")); // tum harf ve rakamlar yerine * yazcak
				System.out.println(str.replaceAll("\\W", "*")); // harf ve rakam disinda kalan herseyi * cevirdi
	System.out.println(str.replaceAll("\\d", ".")); // sayilari nokta yapar
	System.out.println(str.replaceAll("\\D", "."));  // sayi olmayanlari
	System.out.println(str.replaceAll("\\s", "&")); // bosluklari & yapar
	System.out.println(str.replaceAll("\\D", "&")); // bosluk olmayanlari & yapar
	
	System.out.println(str.replaceAll("\\d", ""));
	
	
	
	
	}

}
