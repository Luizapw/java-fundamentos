package fundamentos;

public class ConversaoNumeroString {

	
	public static void main(String[] args) {
		//NUMERO PRA STRING
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
	
		int num2 = 100000;
		System.out.println(Integer.toBinaryString(num2).length());
		
	}
}
