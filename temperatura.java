package fundamentos;

public class temperatura {

	public static void main(String[] args) {
		
		// (°F - 32) x 5/9= °C
		
		final double FATOR = 5.0 / 9.0; // CONSTANTE
		final double AJUSTE = 32; // cONSTANTE 
		
		double fahrenheit = 86; // VARIÁVEL 
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celcius + "°C.");
		
		fahrenheit = 150;
		celcius = (fahrenheit =  AJUSTE) * FATOR;
		System.out.println("O resultado é " + celcius + "°C." );
			
	}
}


// MÉTODO main É O PONTO DE ENTRADA EM UM PROGRAMA JAVA; 

//JAVA SEMPRE FARÁ DIVISÃO COM NUMEROS INTEIROS. O RESULTADO SEMPRE SERÁ 
//NÚMEROS INTEIROS;
// CASO A DIVISÃO SEJA FEITA COM NUMEROS FLUTUANTES (COM CASAS DECIMAIS) 
//O RESULTADO SERA COM CASAS DECIMAIS;
