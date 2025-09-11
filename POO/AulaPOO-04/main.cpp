// Aula de POO - 11/09/2025
// Pedro Ivo Rocha de Deus
// Exemplo de classe do curso C++
// Classe Ver. 0.4.0

#include <iostream> // Biblioteca padrao - equivalente em C++ do stdio.h de Credito

using std::cout;        	// Obj. fluxo saida
using std::cin;         	// Obj. fluxo entrada
using std::endl;        	// Nova linha

#include <string>       	// Classe de string padr�o C++

using std::string;
using std::getline;     	// L� o texto com espa�os em branco

#include "SalesScores.hpp"	// Importa��o das classes

// ---- C�digo Cliente/Principal ----

int main() {
    // Cria dois objetos SalesScore
	SalesScore myStore1 ("Drummond Arena");
	SalesScore myStore2 ("Drummond Tatuape");
	
	cout << "Loja 1 criada com sucesso: " << myStore1.getStoreTitle()
	<< "\nLoja 2 criada com sucesso: " << myStore2.getStoreTitle() << endl;

    while(1);                                   							// C�digo � rodado indefinidamente
    return 0;
}