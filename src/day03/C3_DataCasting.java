package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		byte numByte=34;
		System.out.println("byte degisken degeri: " + numByte);
		
		short numShort= numByte;
		
	System.out.println("short degisken degeri: " + numShort);
	
int numInt = numShort ;

System.out.println("integer degisken degeri: " + numInt);

float numFloat = numShort;
System.out.println("Float degeri: " + numFloat);
	}

}
