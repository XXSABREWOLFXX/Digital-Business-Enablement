package br.com.fiap.loja.TerminalConsulta;

/*
1. Crie uma aplicação Java: “01-Loja-App”;
2. Crie uma classe: br.com.fiap.loja.TerminalConsulta;
O usuário deve informar um código de um produto e a aplicação deve retornar a
descrição do produto, de acordo com as regras:
– Código 401 – Camiseta branca;
– Código 402 – Camiseta azul;
– Código 403 – Camiseta rosa;
– Outro Código – Produto não encontrado;
A aplicação deve ter uma interface texto, que apresente o nome da Loja e a Data
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
		
		System.out.println("Bem-Vindo a Loja Pesadão " + hoje.format(formatador));
		
		System.out.println("Informe o código do Produto: ");
		int codigo = scanner.nextInt();
		
		if (codigo == 401) {
			System.out.println("Camiseta Branca");
		} else if (codigo == 402) {
			System.out.println("Camiseta Azul");
		} else if (codigo == 403) {
			System.out.println("Camiseta Rosa");
		} else if (codigo == 404) {
			System.out.println("Produto Não encontrado");
		} 
	}

}
