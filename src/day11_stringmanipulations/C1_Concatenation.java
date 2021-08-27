package day11_stringmanipulations;

public class C1_Concatenation {

	public static void main(String[] args) {
		// 
		
		System.out.println(15 + 20 + "merhaba");
		
		System.out.println("merhaba" + 15 + 20);
		
		System.out.println("merhaba" + (15 + 20));
		
		System.out.println("merhaba" + 15*20);
		
		String str = "Hello" ;
	    String str2 = "World" ;
	    
	    // Hello World yazdirmak icin
	    System.out.println(str + " " + str2);
	    
	    
	    // metot ile yazdiralim
	    System.out.println(str.concat(str2)); // HelloWorld
	    System.out.println(str.concat(" ").concat(str2)); // Hello World
        // su sekilde de olabilir
	    System.out.println(str.concat(" " + str2)); // Hello World
	
	    
	}

}
