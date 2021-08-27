package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str1 ve str2 kardilastirir ve esit olup olmadiklarina bakr
		// sonuc olarak true veya false dondurur (sonuc)

		// bazi metotlarin yaptirdiklari islem ile dondurduklari sonuc farkli olablir
		// bir metota git ali ismindeki elementi sil deriz
		// o da gidip aliyi bulur ve siler
		
		
		String str1 = "Ali Can";
		String str2 = "Ali Can" ;
		
		// str1 ile str2 nin esit olup olmadigini yazdirin
		
		// true yada fals eyazdiracak
		System.out.println(str1.equals(str2)); 
		
		// ben esit yada esit degil yazdirmasini istiyorum
		
		System.out.println(str1.equals(str2) ? "esit" : "esit degil");
		
		// javada stringler case sensitivedir yani buyuk kucuk harf duyarlidir
		// bir harf bile degisse esit olmaz
		
	}

}
