package day30_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormatter {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/d");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("y$M$d");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("Y-MMMM-d");
		// 	M: month m: minute
		
		LocalDate tarih = LocalDate.now();
		System.out.println(dtf.format(tarih));
		System.out.println(dtf2.format(tarih));
		System.out.println(dtf3.format(tarih));
		System.out.println(dtf4.format(tarih));
	}

}
