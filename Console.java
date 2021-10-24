package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.println(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n",
				3, 12, 23, 44, 11, 36);
		System.out.println("Salario: %1f\n, 1234.5679");
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		entrada.close();
		
		
		/*
		 %S NOME 
		 PRINTF - FORMATAR
		 SYSTEM.OUT - SAÍDA
		 SYSTEM.IN - ENTRADA
		 \N- QUEBRA DE LINHA 
		 INT- NUMERO INTEIRO
		 
		 SCANNER- ENTRADA DE INFORMAÇOES, QUE TODA VEZ USADA, É NECESSARIO
		 QUE SEJA FECHADA AO FINAL DO PROGRAMA, PARA NAO FICAR USANDO DADOS
		 DA MAQUINA.
		 * */
	}

}
