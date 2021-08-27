package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder(); // bos bir sb olusturur
		System.out.println("sb1 : " + sb1);
		
		
		StringBuilder sb2=new StringBuilder("mehmet"); // bicinde mehmet degeri olan
		                                        // bir sb uretir
		System.out.println("sb2 : " + sb2);
		
		
		StringBuilder sb3=new StringBuilder(10); //  10 kararkter kapatisesi olan
                                                // bir sb uretir
        System.out.println("sb3 : " + sb3);
 
        sb1.append(" hoca");
        System.out.println("sb1 append : " + sb1); // hoca buraya eklenmis oldu normalde olmazdi
        
        sb2.append(" hoca");
        System.out.println("sb2 append : " + sb2);
        
        sb3.append(" hoca");
        System.out.println("sb3 append : " + sb3);

        System.out.println("sb1.uzunluk" + sb1.length()); // 5 " hoca"
        System.out.println("sb1.kapasite" + sb1.capacity()); // 16 bir deger yazmadigimiz default 
        
        System.out.println("sb2.uzunluk" + sb2.length());
        System.out.println("sb2.kapasite" + sb2.capacity());
        
        System.out.println("sb3.uzunluk" + sb3.length());
        System.out.println("sb3.kapasite" + sb3.capacity());
	
	// capacity hafiza yonetimi icin cok onemli
    // kod yazilirken sabit uzunluk yada sabit uzunluk belli ise 3 methodu ile olusturarak
        //hafýza kullanimini optimize edebiliriz
	}

}
