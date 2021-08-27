package day02;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("dairenin yaricapini girin");
		
		double yaricap = scan.nextDouble();
		
		System.out.println("dairein alaný=" + 3.14*yaricap*yaricap);

	}

}
