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
		
		// SE VOC� QYER SABER SE O OPERADOR � PAR OU IMPAR:
		
		c %= 2; // c = c % 2; RESULTADO: 0 OU 1 // ATRIBUICAO DE MODULO 
		System.out.println(c);
		
		/* CASO VOC� DESEJE QUE O RESULTADO DA OPERA��O SEJA UM 
		   VALOR QUEBRADO, � NECESSARIO FAZER UM CAST, OU SEJA, UMA 
		   CONVERS�O.
		 * */
	}	
}
