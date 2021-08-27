package day41_errors_garbagecollector;

public class Errors {

	public static void main(String[] args) {
		
		//System.out.println(20/0); // rte degil runtimeexception
		
		//String str ="asd; // CTE dir....cunku cift tirnagi tamamlamadikca calismaz
        //bu tur yazimdan kaynaklanan hatalar kolayca duzeltilebilir
		
		//javada error dendiginde onune gecilemiyen, kod ile cozulemeyen
		//sistemden kaynakli buyuk hatalar kastedilir
		
		//errorlar unchecked dir ve java bunlari ongoremez
		//ancak gerceklestiginden kodun calismasi durdurulur
		
		String str="";
		for (int i = 0; i <10000000 ; i++) {
			str+=i;
		}
	
	
	
	}

}
