package fundamentos;

public class Convers�oTipoPrimitivoNum�rico {

	public static void main(String[] args) {
		double a = 1; // CONVERS�O IMPLICITA
		//DOUBLE � MAIOR QUE INT 
		System.out.println(a);
		
		float b = (float)1.1234588888; //CONVERS�O EXPLICITA (CAST)
		System.out.println(b);
		
		// QUANDO � FEITO UMA CONVERS�O EXPLICITA, DE UMA MAIOR, PARA 
		//UM MENOR, � NORMAL QUE OCORRA PERCA DE DADOS, 
		
		int c = 340;
		byte d= (byte)c; //CONvERS�O EXPLICITA (CAST)
		System.out.println(d);
	}
	
	
}
 