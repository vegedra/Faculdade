// Aula 03 de POO - 09/09/2025
// Pedro Ivo Rocha de Deus
// Exemplo de classe do curso C++
// Classe Ver. 0.1.0

#include <iostream> // Biblioteca padrao - equivalente em C++ do stdio.h de Credito

using std::cout;        // Obj. fluxo saida
using std::cin;         // Obj. fluxo entrada
using std::endl;        // Nova linha

#include <string>       // Classe de string padrão C++

using std::string;
using std::getline;     // Lê o texto com espaços em branco

// ---- Desenvolvimento da Classe ----
// Classes são programas paralelos que rodam no programa principal.

class SalesScore {
public:                                                         // Especificador de acesso
    void bootSystem(string storeTitle) {                        // Função membro
        cout << "Score de vendas!\n" << storeTitle << endl;     // Equivalente ao print em C
    }                                                           // << equivale ao . de outras linguagens
};

// ---- Código Cliente/Principal ----

int main() {
    string storeTitle;                          // String de caracteres para armazenar titulo da loja
    SalesScore mySales;                         // Objeto mySales da classe SalesScore

    cout << "Insira o nome da loja:" << endl;
    getline(cin, storeTitle);                   // Lê o nome da loja com espaços em branco que o usuário escreveu
    cout << endl;                               // Insere uma linha abaixo

    mySales.bootSystem(storeTitle);             // Chamada da função membro da classe - mostra o nome inserido

    while(1);                                   // Código é rodado indefinidamente
    return 0;
}
