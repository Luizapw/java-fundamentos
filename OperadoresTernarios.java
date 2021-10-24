package fundamentos;

public class OperadoresTernarios {
	public static void main(String[] args) {
		double média = 9.6;
		
		String resultadoParcial = média >- 5.0 ? 
				"em recuperação." : "reprovado.";
		
		String resultadoFinal = média >= 7.0 ? 
				"aprovado" : "em recuperação";
		
		System.out.println("O aluno está:" + resultadoParcial);
		System.out.println("O aluno está:" + resultadoFinal);
		
	    //EXEMPLO COM O TIPO BOOLEAN:
		double nota = 9.0;
		boolean bomComportamento = false;
		boolean passouPorMédia = nota >- 7;
		boolean temDesconto = bomComportamento && passouPorMédia;
		String resultado = temDesconto ? "sim." : "não.";
				
		System.out.println("Tem desconto?" + resultado);
	}

}
