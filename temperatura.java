package fundamentos;

public class temperatura {

	public static void main(String[] args) {
		
		// (�F - 32) x 5/9= �C
		
		final double FATOR = 5.0 / 9.0; // CONSTANTE
		final double AJUSTE = 32; // cONSTANTE 
		
		double fahrenheit = 86; // VARI�VEL 
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado � " + celcius + "�C.");
		
		fahrenheit = 150;
		celcius = (fahrenheit =  AJUSTE) * FATOR;
		System.out.println("O resultado � " + celcius + "�C." );
			
	}
}


// M�TODO main � O PONTO DE ENTRADA EM UM PROGRAMA JAVA; 

//JAVA SEMPRE FAR� DIVIS�O COM NUMEROS INTEIROS. O RESULTADO SEMPRE SER� 
//N�MEROS INTEIROS;
// CASO A DIVIS�O SEJA FEITA COM NUMEROS FLUTUANTES (COM CASAS DECIMAIS) 
//O RESULTADO SERA COM CASAS DECIMAIS;
