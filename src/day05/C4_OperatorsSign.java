package day05;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		
		// = atama yada assigment(esaymýnt)
		
		int sayi1 = 5;
		int sayi2 = 4;
		
		boolean isGreat = sayi1>sayi2 ; // true/fause
	    System.out.println(isGreat);   // true
	    
	    boolean isSmall = sayi1<=sayi2 ;
	    System.out.println(isSmall);  // false cikar
	    
	    boolean isEqual = sayi1==sayi2 ;  // esit mi anlamýna gelir
	                                           // comparison adý
	    System.out.println(isEqual);
	    
	    
	    System.out.println(sayi1==5);  // true cikar
	    
	    System.out.println(sayi1*sayi2==20);
	    
	    System.out.println(sayi1 + sayi2 != 9);
	    
	    System.out.println(sayi1 - sayi2 != 0);
	    
		
	}

}
