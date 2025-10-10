// Aula POO - 09/10/25

// Superclasse/classe pai
class Carro {
    
    // Atributo da classe
    String nome;
    
    // Construtor da classe
    public Carro (String nome) {
        this.nome = nome;   // this = esta classe
    }
    
    // Metodo da classe
    public void acelerar() {
        System.out.println(nome + " acelera.");
    }
}

// Classe derivada - extends = herda de outra classe -- usado para propositos de organizacao
class Fiat extends Carro {
    
    // Construtor
    public Fiat (String nome) {
        // super -> chama o atributo/construtor da classe herdada (superclasse)
        super(nome);
    }
    
    // Sobrescrita do metodo -> usa as caracteristas da classe pai aqui
    @Override
    public void acelerar() {
        System.out.println(nome + " acelera devagar.");
    }
    
    // Metodo exclusivo desta classe
    public void quebrar() {
        System.out.println(nome + " quebrou...");
    }
}

// Mais algumas subclasses
class Ferrari extends Carro {
    // Construtor
    public Ferrari (String nome) {
        super(nome);
    }
    
    // Metodo exclusivo desta classe
    public void colocarGaragem() {
        System.out.println(nome + " esta sendo colocado na garagem.");
    }
}

class BYD extends Carro {
    
    // Construtor
    public BYD (String nome) {
        super(nome);
    }
    
    // Metodo exclusivo desta classe
    public void carregarBateria() {
        System.out.println(nome + " esta carregando sua bateria.");
    }
}

class Toyota extends Carro {
    // Construtor
    public Toyota (String nome) {
        super(nome);
    }
    
    // Metodo exclusivo desta classe
    public void manobrar() {
        System.out.println(nome + " esta sendo manobrado.");
    }
    
    // Metodo exclusivo desta classe
    public void bater() {
        System.out.println(nome + " bateu...");
    }
}

// Classe principal
public class Main {
    
    // Metodo principal/inicio
    public static void main (String[] args) {
        
        // Cria um objeto da subclasse Fiat chamado "meuCarro" -- Fiat
        Fiat meuFiat = new Fiat("Argo");
        // Imprime e usa os metodos de Fiat
        System.out.println("Nome do carro da marca Fiat: " + meuFiat.nome + ".");
        meuFiat.acelerar();
        meuFiat.quebrar();
        
        // Ferrari
        Ferrari meuFerrari = new Ferrari("Enzo");
        System.out.println("\nNome do carro da marca Ferrari: " + meuFerrari.nome + ".");
        meuFerrari.colocarGaragem();
        
        // BYD
        BYD meuBYD = new BYD("Tang");
        System.out.println("\nNome do carro da marca BYD: " + meuBYD.nome + ".");
        meuBYD.carregarBateria();
        
        // Toyota
        Toyota meuToyota = new Toyota("Corolla");
        System.out.println("\nNome do carro da marca Toyota: " + meuToyota.nome + ".");
        meuToyota.manobrar();
        meuToyota.bater();
    }
}