package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1 INCREMENTO
		a--; //a = a - 1 DECREMENTO
		
		++b; //b = b + 1 OPERA��O PRE FIXADA
		--b; //b = b - 1 OPERA��O POS FIXADA
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		//MISTURANDO OPERADORES PRE E POS FIXADO E COMPARA��O:
		System.out.println(++a == b--); 
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
