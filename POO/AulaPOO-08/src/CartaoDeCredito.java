// Aula POO - 06/11/25
// Cartao Credito

import java.time.LocalDate;

public class CartaoDeCredito {

    // Variaveis
    private String nome;
    private String numero;
    private LocalDate validade;

    // Chama instancia cliente
    Cliente cliente;

    // Construtor
    public CartaoDeCredito(String nome, String numero, LocalDate validade) {
        this.nome = nome;
        this.numero = numero;
        this.validade = validade;
    }

    // Getters
    public String getNome() { return nome; }
    public String getNumero() { return numero; }
    public LocalDate getValidade() { return validade; }

    // Setter
    public void setNome(String nome) { this.nome = nome; }
}