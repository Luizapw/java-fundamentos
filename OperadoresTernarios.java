package fundamentos;

public class OperadoresTernarios {
	public static void main(String[] args) {
		double m�dia = 9.6;
		
		String resultadoParcial = m�dia >- 5.0 ? 
				"em recupera��o." : "reprovado.";
		
		String resultadoFinal = m�dia >= 7.0 ? 
				"aprovado" : "em recupera��o";
		
		System.out.println("O aluno est�:" + resultadoParcial);
		System.out.println("O aluno est�:" + resultadoFinal);
		
	    //EXEMPLO COM O TIPO BOOLEAN:
		double nota = 9.0;
		boolean bomComportamento = false;
		boolean passouPorM�dia = nota >- 7;
		boolean temDesconto = bomComportamento && passouPorM�dia;
		String resultado = temDesconto ? "sim." : "n�o.";
				
		System.out.println("Tem desconto?" + resultado);
	}

}
