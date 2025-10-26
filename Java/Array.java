import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args){

        // Array = variavel que guarda mais de um valor do mesmo tipo
        
        // Criando uma array
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        
        // Pegar o tamanho da array
        int numOfFruits = fruits.length;
        
        // Tipo de forLoop para mostrar os valores
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        
        
        
        // Separador
        System.out.println("-------------");
        
        // Usando o index para alterar
        fruits[0] = "pineapple";
        
        // Usando a classe Array para organizar
        Arrays.sort(fruits);
        
        // ForLoop clássico
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        
        
        
        // Separador - input
        System.out.println("-------------\n");
        
        Scanner scanner = new Scanner(System.in);
        
        // Criando uma array vazia de tamanho 3 -> pode usar uma variavel para definir o tamanho depois
        String[] nomes = new String[3];
        
        // Input do usuaio na Array
        for(int i = 0; i < nomes.length; i++) {
            System.out.print("Escreva um nome " + i + "/2: ");
            nomes[i] = scanner.nextLine();
        }
        
        // Mostrando os valores - valor : array
        for(String nome : nomes){
            System.out.println(nome);
        }
        
        scanner.close();
    }
}
