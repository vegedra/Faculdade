// Aula Programacao Orientada a Objetos - 02/10/25
// Pedro Ivo Rocha
// Programa 1: Classe esporte e seus atributos
// Prototipo em Java

class Main {
	private String nome;
    private String modal;	// Individual ou grupo/duplas
	private String modalidade;
	private int atletas;
	
	// Construtor
	public Main(String nome, String modal, String modalidade, int atletas) {
        this.nome = nome;
        this.modal = modal;
        this.modalidade = modalidade;
		this.atletas = atletas;
    }
	
	public void mostrarEsporte() {
		System.out.println("Nome do esporte: " + nome +
			"\nModal: " + modal +
			"\nModalidade: " + modalidade +
			"\nNumero de atletas: " + atletas + "\n");
	}
	
	public static void main(String[] args) {
        Main futsal = new Main("Futsal", "Grupo", "Street", 11);
		futsal.mostrarEsporte();
		
		Main esgrima = new Main("Esgrima", "Individual", "Terrestre", 2);
		esgrima.mostrarEsporte();
		
		Main basquete = new Main("Basquete", "Grupo", "Terrestre", 10);
		basquete.mostrarEsporte();
		
		Main natacao = new Main("Natacao", "Individual", "Aquatico", 8);
		natacao.mostrarEsporte();
    }
}