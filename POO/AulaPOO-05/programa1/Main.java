// Aula Programacao Orientada a Objetos - 02/10/25
// Pedro Ivo Rocha
// Programa 1: Ler nome e idade do usuario e mostrar na tela - Java

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// Cria o scanner
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		// Cria as variaveis
		String nome;
		int idade;
		
		// Recebe input
		System.out.println("Qual seu nome?");
		nome = scanner.nextLine();
		
		System.out.println("\nQual sua idade?");
		idade = scanner.nextInt();
		
		// Mostra
		System.out.println("\nNome: " + nome + "\nIdade: " + idade);
	}
}