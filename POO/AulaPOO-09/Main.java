// Aula Poo - 13/11/25
// Pedro Ivo Rocha

import java.util.Scanner;

public class Main {
    private static String placa;
    private static double horaE;
    private static final int VALOR = 10;

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo(placa, horaE);
        Estacionamento estacionamento = new Estacionamento(placa, VALOR);
        Scanner scanner = new Scanner(System.in);
        String ch;
        double h;

        System.out.println("-- Estacionamento: R$ 10 a hora! --");
        System.out.print("Insira a placa do veiculo: ");
        ch = scanner.nextLine();

        veiculo.setPlaca(ch);

        System.out.print("Insira a hora de entrada: ");
        h = scanner.nextDouble();

        veiculo.setHora(h);

        System.out.print("Insira a hora de saida: ");
        h = scanner.nextDouble();

        double horas = h - veiculo.getHora();
        double total = horas * VALOR;

        System.out.println("\nDados do veiculo: " +
                "\n" + "Placa: " + veiculo.getPlaca() + "\n" +
                "Hora de entrada: " + veiculo.getHora() + "\n" +
                "Hora de saida: " + h);
        System.out.printf("\nTotal a pagar: R$ %.2f", total);
    }
}