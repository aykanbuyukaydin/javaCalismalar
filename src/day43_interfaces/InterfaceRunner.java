package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		//static olarak tanimlanmis veya method baska classdan 
		//classismi. methodisimi. þeklinde cagirilabilir
		
		Interface02.deneme2();
		
		//default keywordu ile olusturdugumuz method ise obje uzerinden cagirilabilir
		
		InterfaceRunner obj1 = new InterfaceRunner();
		obj1.deneme();
	}

	
}
