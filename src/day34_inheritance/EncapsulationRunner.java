package day34_inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1=new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.isOkulAcikMi());
		
		obj1.setOkulIsmi("mehmet koleji");
		System.out.println(obj1.getOkulIsmi());
		
		Encapsulation obj2=new Encapsulation();
		System.out.println(obj2.getOkulIsmi());
		
	}

}
