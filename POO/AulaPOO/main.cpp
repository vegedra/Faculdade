// Aula 03 de POO - 09/09/2025
// Pedro Ivo Rocha de Deus
// Exemplo de classe do curso C++
// Classe Ver. 0.1.0

#include <iostream> // Biblioteca padrao - equivalente em C++ do stdio.h de Credito

using std::cout;        // Obj. fluxo saida
using std::cin;         // Obj. fluxo entrada
using std::endl;        // Nova linha

#include <string>       // Classe de string padr�o C++

using std::string;
using std::getline;     // L� o texto com espa�os em branco

// ---- Desenvolvimento da Classe ----
// Classes s�o programas paralelos que rodam no programa principal.

class SalesScore {
public:                                                         // Especificador de acesso
    void bootSystem(string storeTitle) {                        // Fun��o membro
        cout << "Score de vendas!\n" << storeTitle << endl;     // Equivalente ao print em C
    }                                                           // << equivale ao . de outras linguagens
};

// ---- C�digo Cliente/Principal ----

int main() {
    string storeTitle;                          // String de caracteres para armazenar titulo da loja
    SalesScore mySales;                         // Objeto mySales da classe SalesScore

    cout << "Insira o nome da loja:" << endl;
    getline(cin, storeTitle);                   // L� o nome da loja com espa�os em branco que o usu�rio escreveu
    cout << endl;                               // Insere uma linha abaixo

    mySales.bootSystem(storeTitle);             // Chamada da fun��o membro da classe - mostra o nome inserido

    while(1);                                   // C�digo � rodado indefinidamente
    return 0;
}
