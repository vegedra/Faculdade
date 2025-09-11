// Aula de POO - 11/09/2025
// Pedro Ivo Rocha de Deus
// Exemplo de classe do curso C++
// Classe Ver. 0.4.0

#include <iostream> // Biblioteca padrao - equivalente em C++ do stdio.h de Credito

using std::cout;        	// Obj. fluxo saida
using std::cin;         	// Obj. fluxo entrada
using std::endl;        	// Nova linha

#include <string>       	// Classe de string padrão C++

using std::string;
using std::getline;     	// Lê o texto com espaços em branco

#include "SalesScores.hpp"	// Importação das classes

// ---- Código Cliente/Principal ----

int main() {
    // Cria dois objetos SalesScore
	SalesScore myStore1 ("Drummond Arena");
	SalesScore myStore2 ("Drummond Tatuape");
	
	cout << "Loja 1 criada com sucesso: " << myStore1.getStoreTitle()
	<< "\nLoja 2 criada com sucesso: " << myStore2.getStoreTitle() << endl;

    while(1);                                   							// Código é rodado indefinidamente
    return 0;
}