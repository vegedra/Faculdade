public class NestedLoop {
    public static void main(String[] args){

        // Nested loop = Loop dentro de outro loop
        // Exemplo de matriz

        int linhas = 3;
        int colunas = 3;
        char simbolo = '#';

        // Primeiro loop para as linhas
        for(int i = 0; i < linhas; i++){
            // Segundo loop para as colunas - se usa outra variavel (i & j)
            for(int j = 0; j < colunas; j++){
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
}
