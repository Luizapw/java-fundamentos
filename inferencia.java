package fundamentos;

public class inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto"; // VARI�VEL TIPO STRING 
		c = "OUTRO TEXTO";
		System.out.println(c);
		
		double d; // VARI�VEL DECLARADA
		d=123.65;// VARI�VEL FOI INICIALIZADA
		System.out.println(d); // VARI�VEL FOI USADA
	}

}
// UMA VEZ A VARI�VEL DECLARADA, N�O PODE SER MAIS ALTERADA.
// INFERENCIA SURGIU NO JAVA 10 
// VARI�VEIS SEMPRE SER�O DE UM DETERMINADO TIPO, E ISSO N�O MUDA NO JAVA
/*
 VARI�VEIS CRIADAS COM VALORES INTEIROS, N�O RECEBEM VALORES COM 
 CASAS DECIMAIS.
*/