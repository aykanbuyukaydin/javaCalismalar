package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		System.out.println(dtf.format(ldt));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(ldt));
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm"); // HH: 24 saatlik dilime gore
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm"); // hh: pm/am sistemine gore
		System.out.println(dtf3.format(ldt));   
		System.out.println(dtf4.format(ldt));
		
		/* yy: yilin son iki rakamini
		   yyyy: yilin tamammini verir
		   M: ay sirasini verir mart icin 3
		   MM: ay sirasini verir mart icin 03
		   MMM:ay isminin ilk uc harfini verir
		   MMMM: ay isminin tamammini verir
		   
		 */
		
		LocalDate dogumTarihi = LocalDate.of(1995, 1, 12);
		LocalDate bugun =LocalDate.now();
		
		Period benimYasim = Period.between(dogumTarihi, bugun); 
		System.out.println(benimYasim); // periyot olarak bilmek icin
		
		int yas = Period.between(dogumTarihi, bugun).getYears();
		System.out.println(yas);  // sadece yasý istersek bunu yapabiliriz
		
		
		
	}

}
