package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá, mundo!".charAt(4)); 
		/*
		 charAt É UMA FUNCIONALIDADE QUE PERTENCE A UMA STRING, PARA 
		 DESCOBRIR CARACTERES.
		 
		 TODA STRING É UM OBJETO IMUTÁVEL, UMA VEZ DECLARADA, NÃO É 
		 POSSIVEL MUDAR O SEU VALOR. 
		*/
		
		String s = "Olá, mundo!";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Olá"));
		System.out.println(s.toLowerCase().startsWith("olá"));
		//VERDADEIRO OU FALSO
		System.out.println(s.length()); // QUANTOS CARACTERES TEM?
		System.out.println(s.equals("ola mundo")); 
				//COMPARAÇAO DE IGUALDADE 
		
		
	}

}
