import java.time.LocalDate;

public class TestaCartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito cartao1 = new CartaoDeCredito("Pedro", "12345678901", LocalDate.of(2026, 5, 23));
        System.out.println("Ola, " + cartao1.getNome() + ".");
        System.out.println("Numero do cartao: " + cartao1.getNumero());
        System.out.println("Data de validade: " + cartao1.getValidade());

        System.out.println("\n-------------------\n");

        CartaoDeCredito cartao2 = new CartaoDeCredito("Michael", "23726173812", LocalDate.of(2027, 5, 13));
        System.out.println("Seja bem-vindo(a), " + cartao2.getNome() + ".");
        System.out.println("Numero do cartao: " + cartao2.getNumero());
        System.out.println("Data de validade: " + cartao2.getValidade());

        cartao2.setNome("Carlos");
        System.out.println("\nNome alterado!");
        System.out.println("Seja bem-vindo(a), " + cartao2.getNome() + ".");

    }
}