public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", "12345678901", 20, 12345);
        Cliente cliente2 = new Cliente("Michael", "12345678901", 30, 01357);
        // ----
        System.out.println("Ola, " + cliente1.getNome() + ".");
        System.out.println("Seja bem-vindo(a), " + cliente2.getNome() + ".");
    }
}