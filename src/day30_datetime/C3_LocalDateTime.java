package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println(ldt.toString());
		
		String time=ldt.toString(); // time diye string atayacak
				// bundan sonra string method larýmla da islem yapabilirm
				
	time.startsWith("2021"); // 2021 ile mi basliyor tarih // true verir
System.out.println(time.startsWith("2021"));
	}

}
