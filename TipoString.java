package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ol�, mundo!".charAt(4)); 
		/*
		 charAt � UMA FUNCIONALIDADE QUE PERTENCE A UMA STRING, PARA 
		 DESCOBRIR CARACTERES.
		 
		 TODA STRING � UM OBJETO IMUT�VEL, UMA VEZ DECLARADA, N�O � 
		 POSSIVEL MUDAR O SEU VALOR. 
		*/
		
		String s = "Ol�, mundo!";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Ol�"));
		System.out.println(s.toLowerCase().startsWith("ol�"));
		//VERDADEIRO OU FALSO
		System.out.println(s.length()); // QUANTOS CARACTERES TEM?
		System.out.println(s.equals("ola mundo")); 
				//COMPARA�AO DE IGUALDADE 
		
		
	}

}
