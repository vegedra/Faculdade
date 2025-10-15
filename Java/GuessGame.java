// While loop & Random

import java.util.Random;
import java.util.Scanner;

// Jogo de adivinhação de número
public class GuessGame {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        // Cria um inteiro de valor aleatorio (1-100)
        int randomNumber = random.nextInt(min, max + 1);

        System.out.printf("Adivinhe um número entre %d-%d\n", min, max);

        // Loop do-while (mostra primeiro e verifica depois) 
        do {
            System.out.print("> ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Muito baixo! Tente novamente.");
            }
            else if(guess > randomNumber){
                System.out.println("Muito alto! Tente novamente.");
            }
            else{
                System.out.println("Acertou! O número era: " + randomNumber);
                System.out.println("Tentativas: " + attempts);
            }

        } while (guess != randomNumber);
        scanner.close();
    }
}
