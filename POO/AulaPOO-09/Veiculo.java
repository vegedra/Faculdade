// Classe Veiculo
public class Veiculo {
    private String placa;
    private double horaEntrada;

    // Getters e Setters
    public String getPlaca() { return placa; }
    public double getHora() { return horaEntrada; }
    public void setPlaca(String p) { this.placa = p; }
    public void setHora(double h) { this.horaEntrada = h; }

    public Veiculo(String placa, double horaEntrada) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
    }
}