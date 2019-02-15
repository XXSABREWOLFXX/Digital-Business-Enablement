package br.com.fiap.loja.TerminalConsulta;

/*
1. Crie uma aplica��o Java: �01-Loja-App�;
2. Crie uma classe: br.com.fiap.loja.TerminalConsulta;
O usu�rio deve informar um c�digo de um produto e a aplica��o deve retornar a
descri��o do produto, de acordo com as regras:
� C�digo 401 � Camiseta branca;
� C�digo 402 � Camiseta azul;
� C�digo 403 � Camiseta rosa;
� Outro C�digo � Produto n�o encontrado;
A aplica��o deve ter uma interface texto, que apresente o nome da Loja e a Data
Atual
*/ 


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TerminalConsulta {
	
	static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy");
		hoje.format(formatador);
		
		System.out.println("Bem-Vindo a Loja Pesad�o " + hoje.format(formatador));
		
		System.out.println("Informe o c�digo do Produto: ");
		int codigo = scanner.nextInt();
		
		if (codigo == 401) {
			System.out.println("Camiseta Branca");
		} else if (codigo == 402) {
			System.out.println("Camiseta Azul");
		} else if (codigo == 403) {
			System.out.println("Camiseta Rosa");
		} else if (codigo == 404) {
			System.out.println("Produto N�o encontrado");
		} 
	}

}
