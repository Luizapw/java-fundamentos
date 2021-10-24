package fundamentos;

public class inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto"; // VARIÁVEL TIPO STRING 
		c = "OUTRO TEXTO";
		System.out.println(c);
		
		double d; // VARIÁVEL DECLARADA
		d=123.65;// VARIÁVEL FOI INICIALIZADA
		System.out.println(d); // VARIÁVEL FOI USADA
	}

}
// UMA VEZ A VARIÁVEL DECLARADA, NÃO PODE SER MAIS ALTERADA.
// INFERENCIA SURGIU NO JAVA 10 
// VARIÁVEIS SEMPRE SERÃO DE UM DETERMINADO TIPO, E ISSO NÃO MUDA NO JAVA
/*
 VARIÁVEIS CRIADAS COM VALORES INTEIROS, NÃO RECEBEM VALORES COM 
 CASAS DECIMAIS.
*/