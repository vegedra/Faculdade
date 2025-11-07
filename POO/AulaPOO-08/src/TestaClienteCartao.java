// Aula POO - 06/11/25
// Cartao Credito + cliente + agencia

import java.time.LocalDate;

public class TestaClienteCartao {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("Inter", "12");
        Cliente cliente = new Cliente("Pedro", agencia.getNome(), 20, 12345);
        CartaoDeCredito cartao = new CartaoDeCredito(cliente.getNome(), "12345678901", LocalDate.of(2026, 5, 23));

        System.out.println("Seja bem-vindo(a), " + cartao.getNome() + ".");
        System.out.println("Numero do cartao: " + cartao.getNumero());
        System.out.println("Data de validade: " + cartao.getValidade());
        System.out.println("Agencia: " + cliente.getAgencia());
    }
}