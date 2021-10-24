package fundamentos;

public class Logicos {

	public static void main(String[] args) {
		boolean condicao1 = true; //VALOR LITERAL 
		boolean condicao2 = 3 > 7; //OPERADOR RELACIONAL
		
		System.out.println(condicao1 && condicao2); // FALSO 
		System.out.println(condicao1 || condicao2); //OU
		System.out.println(condicao1 ^ condicao2); //OU EXCLUSIVO
		System.out.println(!condicao1);//NEGAÇÃO LOGICA
		System.out.println(!condicao2);//NEGACÃO LÓGICA 
	
		
		System.out.println("\nTABELA VERDADE E (AND)");
		System.out.println(true && true); //TRUE
		System.out.println(true && false);//FALSE
//		System.out.println(false && true);//FALSE
//		System.out.println(false && false);//FALSE
	
		System.out.println("\nTABELA VERDADE OU (OR)");
//		System.out.println(true || true); //TRUE
//		System.out.println(true || false);//TRUE
		System.out.println(false || true);//TRUE
		System.out.println(false || false);//FALSE
		
		System.out.println("\nTABELA VERDADE OU EXCLUSIVO (XOR)");
		System.out.println(true  ^ true); //FALSO
		System.out.println(true ^ false);//TRUE
		System.out.println(false ^ true);//TRUE
		System.out.println(false ^ false);//FALSE
		
		System.out.println("\nTABELA VERDADE NOT");
		System.out.println(!true); //FALSO
		System.out.println(!false);//TRUE
	}
}
