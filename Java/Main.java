// Básico do básico - 19/09/25

import java.util.Scanner;   // Importa o Scanner (input)

public class Main {

    // Public = pode ser acessado de qualquer lugar
    // Static = pertence à classe
    // Void = não retorna valor
    // String[] args = parâmetro que representa um array de Strings. 
    // Ele recebe os argumentos passados pela linha de comando quando 
    // o programa é executado.
    public static void main(String[] args) {
        // Input - Class Scanner + nome
        Scanner myScanner;
        // "myScanner is a new scanner with a 'System.in' that can read input"
        myScanner = new Scanner(System.in);

        // Variaveis String
        String playerName;
        String playerWeapon;
        String playerClothing;

        // Imprime texto na tela
        System.out.println("Qual seu nome?");

        // "String = Scanner receive text and put in the String"
        playerName = myScanner.nextLine();

        playerWeapon = "Canivete";
        playerClothing = "Terno";

        // Variaveis Int
        int playerHP = 10;

        // Texto com variavel
        System.out.println("Olá, " + playerName + "!\n");
        System.out.println("Em suas mãos: " + playerWeapon + ".");
        System.out.println("Você está vestindo: " + playerClothing + ".");
        System.out.println("Seu HP atual: " + playerHP + ".");

        System.out.println("\nUma bala perdida te atinge!");
        playerHP = playerHP - 3;
        System.out.println("-3 de HP!");
        System.out.println("Seu HP atual: " + playerHP + ".");

        System.out.println("\nAlguém pede desculpa.");
        System.out.println("Quanto você quer receber em troca?");

        int playerMoney;
        // Para receber valores inteiros
        playerMoney = myScanner.nextInt();

        System.out.println("\nVocê recebeu $" + playerMoney + "!");
    }

}
