package fundamentos;

public class ConversãoTipoPrimitivoNumérico {

	public static void main(String[] args) {
		double a = 1; // CONVERSÃO IMPLICITA
		//DOUBLE É MAIOR QUE INT 
		System.out.println(a);
		
		float b = (float)1.1234588888; //CONVERSÃO EXPLICITA (CAST)
		System.out.println(b);
		
		// QUANDO É FEITO UMA CONVERSÃO EXPLICITA, DE UMA MAIOR, PARA 
		//UM MENOR, É NORMAL QUE OCORRA PERCA DE DADOS, 
		
		int c = 340;
		byte d= (byte)c; //CONvERSÃO EXPLICITA (CAST)
		System.out.println(d);
	}
	
	
}
 