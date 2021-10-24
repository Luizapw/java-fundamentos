package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in); 
		
		 Byte b = 100;
		 Short s = 1000; 
		 Integer I = 10000; //INT
		 Long l = 100000L;
		  
		  
		 System.out.println(b.byteValue());
		 System.out.println(s.toString());
		 
		 entrada.close();
	}
}
