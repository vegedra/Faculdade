// Aula POO - 06/11/25

public class Agencia {

    // Variaveis
    private String nome;
    private String numero;

    // Construtor
    public Agencia(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Getters
    public String getNome() { return nome; }
    public String getNumero() { return numero; }

    // Setter
    public void setNome(String nome) { this.nome = nome; }
    public void setNumero(String numero) { this.numero = numero; }
}