package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder("rumeysa");
		System.out.println(sb1); // rumeysa
		
		sb1.append(" ").append("cetinturk"); // rumeysa cetinturk //  verilen string builderin sonuna istedigimiz string degerlerini ekler
		System.out.println(sb1);

		
		String cumle="javayi cok sever";
		sb1.append(cumle, 6, 10);
		System.out.println(sb1);  // append ekleme oldugu icin 6 index dahil 10 index haric ekliyor
		System.out.println(sb1.length());  // 21 // string builderin uzunlugunun bilglisini verir  
		System.out.println(sb1.capacity());  // 23 (7+16) // string builderin capasite bilgisini verir
		
		System.out.println(sb1.charAt(1)); // u
		sb1.charAt(5); // bize bilgi getiren methodlar sb yi degistirmez // string builderin istedigimiz index de olan karrakter bilgisini verir
		System.out.println(sb1); //rumeysa cetinturk cok
		
		sb1.delete(17, 21);// sb nin istediðimiz indexleri arasýndaki kismini siler
		System.out.println(sb1);
		
		sb1.deleteCharAt(16); // sb nin istedigimiz indexdeki karakterini siler
		System.out.println(sb1);
		
		String isim= "rumeysa cetintur";
		System.out.println(sb1.equals(isim)); // false data turleri farkli oldugu icin icerigin kiyaslanmasi mümkün degildir

		StringBuilder sb2= new StringBuilder("rumeysa cetintur");
		System.out.println(sb1==sb2); //false verir zaten new ile basladigi icin yeni objelerin referenslari farkli oldugu icin 
		
		System.out.println(sb1.equals(sb2)); // normalde true olmasi gerekir ama
		// string builder da equals methodu stringden farkli calisir
		//ancak ayni obje ile kiyaslandiginda true verir
		//stringdeki  == gibi calisir
		System.out.println(sb1.equals(sb1)); // true
		
		System.out.println(sb1.indexOf("cetin")); // cetin indexi kacdan basliyor // 8

		
		System.out.println(sb1.indexOf("e", 6)); // e harfi 6 dan sonraki hangi indexde var // 9
	    System.out.println(sb1.indexOf("kazim")); // -1 // aradigimiz stringi sb de bulamzsa -1 döndürüür
	    
	    sb1.insert(7, " "); // 7 indexe bir boþluk ekle // degistirir cunku ekle diyor
	    System.out.println(sb1);
	
	    cumle="merhaba dunya";
	    sb1.insert(0, cumle, 0, 8); // sb1 in 0 indexde basla cumledeki 0 ile 8 index arasini ekle
	    System.out.println(sb1);
	    
	    sb1.insert(25, cumle, 8, 13);
	    
	    System.out.println(sb1.lastIndexOf("t")); // t nin en son kullanildigi index ne
	    
	   System.out.println(sb1.lastIndexOf("a", 22)); // 22 indexden geriye dogru a kacincý indexde
	   
	   sb1.replace(8, 15, "seher"); // 8 ile 15 index arasini seher ile degistir
	   System.out.println(sb1);
	   
	   sb1.reverse(); // ters cevirir
	   System.out.println(sb1);
	   
	   sb1.reverse();
	    
	   sb1.setCharAt(10, 'k'); // 10 index k oldu
	   System.out.println(sb1);
	   
	   System.out.println(sb1.subSequence(8, 13) ); //8 ile 13 arasindaki indexler icindeki bilgiyi verir
	   
	   System.out.println(sb1.substring(8)); // 8 indexsinden sonrasini verir
	   
	   StringBuilder sb3=new StringBuilder("java cok guzel");
	   StringBuilder sb4=new StringBuilder("java cok guzel");
	   System.out.println(sb3.equals(sb4)); // bize false verecek
	   // iceriklerinin esit olup olmadigina bakmak icin string deki equals methodunu kullanalim
	   
	   System.out.println(sb3.toString().equals(sb4.toString())); // true vermis oldu
	   
	   sb3.toString().concat(" insanin sevdikce sevesi geliyor"); // kaici degil
	   System.out.println(sb3); // java cok guzel cikiyor gene
	   System.out.println(sb3.toString().concat(" insanin sevdikce sevesi geliyor")); // yapmak gerekir
	   // string ya methodlarda ýmmutuble gorevi goruyor
	   //tostring methodu sitginde donusturmus olur dolayisiyla tum string nmethodlari kullanabilirz
	   
	   System.out.println(sb1.length()); // 28
	   System.out.println(sb1.capacity()); // 48
	   sb1.trimToSize(); // string builder icin hazýrlanan kapasitedeki fazlalýklari siler
	                     //lenght ile kapasiteyi esit duruma getirir
	   
	   System.out.println(sb1.length()); // 28
	   System.out.println(sb1.capacity()); // 28 oldu
	   
	   System.out.println(sb3.compareTo(sb4)); // tum karakterleri siradan kontrolederek gidiyor
	   // o indexleri karsilastirdi sonra 1 indexleri bakaraj gider
	   //ilk farkli olan harflerin asci farkini verir
	   StringBuilder sb5=new StringBuilder("hasan");
	   StringBuilder sb6=new StringBuilder("hakan");
	   System.out.println(sb5.compareTo(sb6));  // s-k 8  olmus oldu
	   
	   
	   
	   
	}

}
