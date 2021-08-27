package day09_ternary;

public class C2_ternary2 {

	public static void main(String[] args) {
		int y = 1 ;
		int z = 1 ;
		int a = (y<10) ? y++ : z++ ;
		System.out.println(y + "," + z + "," + a);
		
		// 1<10 dogru y++ yer calisir
		// int a = y++ olur
		// once islem arttır
		
		// ++y ise once arttır sonra islem
		
		
		// y=2 su anda
		System.out.println(y++);
		System.out.println(++y);
		System.out.println(y);

	}

}
