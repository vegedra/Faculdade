// Contagem regressiva usando For Loop e Thread.sleep

import java.util.Scanner;

public class ContagemRegressiva {
	// Precisa do throws para usar o Thread
	public static void main(String[] args) throws InterruptedException {
		// for loop - o código é executado uma certa quantidade de vezes
		// Contagem regressiva
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos segundos para a contagem regressiva?: ");
		int start = scanner.nextInt();
		
		for (int i = start; i > 0; i--) {
			System.out.println(i + " segundo(s)...");
			// Usa a classe Thread para usar sleep/delay em milisegundos
			Thread.sleep(1000);
		}
		// Toca um beep ao finalizar a contagem
		System.out.println("\nFeito!\007");
	}
}
