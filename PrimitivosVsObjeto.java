package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {
		
		String s =  new String ("texto");
		s.toLowerCase();
		
		//WRAPPERS -  VERSÃO OBJETO DE TIPOS PRIMITIVOS
		int a = 123;
		System.out.println(a);
		
		/* EM JAVA TEMOS 8 TIPOS PRIMITIVOS SENDO 6 NUMERICOS
		 
		 BYTE (1), SHORT(2), INT(4) E LONG(8), CADA UM COM UMA
		 CAPACIDADE DE ARMAZENAMENTO DIFERENTE.
		 
		 FLOUT (4) E DOUBLE (8), SÃO TIPOS NUMÉRICOS INTEIROS COM 
		 PONTOS FLUTUANTES.
		 
		 BOOLEAN PARA VERDADEIRO OU FALSO.
		 CHAR PARA STATUS
		
		 STRING - CLASSE
		 
		 TUDO EM JAVA É OBJETO, EXCETO DOS TIPOS PRIMITIVOS.
		  */
	}
}
