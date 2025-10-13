public class Variables {
    public static void main(String[] args) {

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // int			string
        // double       array
        // char         object
        // boolean

		// Numeros Inteiros
        int age = 21;
        int year = 2025;
        int quantity = 1;

		// Numeros Decimais
        double price = 19.99;
        double temperature = -12.5;

		// Caractere
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

		// Verdadeiro ou falso
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

		// Texto
        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

		// Usando as variaveis com print
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }
}