// Aula POO - 06/11/25
// Criar uma classe Cliente e dois objetos

public class Cliente {

    // Variaveis
    private String nome;
    private double saldo;
    private int codigo;
    private String agencia;

    // Construtor
    public Cliente(String nome, String agencia, double saldo, int codigo) {
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo;
        this.codigo = codigo;
    }

    // Getter
    public String getNome() { return nome; }
    public String getAgencia() { return agencia; }
    public double getSaldo() { return saldo; }
    public int getCodigo() { return codigo; }
}