import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	// Cria o objeto scanner para receber input
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("Are you a student? (true/false): ");
    boolean isStudent = scanner.nextBoolean();

    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old");

    if(isStudent){
		System.out.println("You are enrolled in classes");
    }
    else{
		System.out.println("You are NOT enrolled in classes");
    }

	// Fecha o scanner no final - boa pratica
    scanner.close(); 
    }
}