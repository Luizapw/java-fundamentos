package fundamentos;

public class Operadores {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b; ATRIBUICAO SOMATIVA
		c -= a; // c = c - a; ATRIBUICAO DIMINUTIVA
		c *= b; // c = c * b; ATRIBUICAO MULTIPLICATIVA
		c /= a; // c = c / a; ATRIBUICAO DIVISIVA
		
		System.out.println(c);
		
		// SE VOCÊ QYER SABER SE O OPERADOR É PAR OU IMPAR:
		
		c %= 2; // c = c % 2; RESULTADO: 0 OU 1 // ATRIBUICAO DE MODULO 
		System.out.println(c);
		
		/* CASO VOCÊ DESEJE QUE O RESULTADO DA OPERAÇÃO SEJA UM 
		   VALOR QUEBRADO, É NECESSARIO FAZER UM CAST, OU SEJA, UMA 
		   CONVERSÃO.
		 * */
	}	
}
