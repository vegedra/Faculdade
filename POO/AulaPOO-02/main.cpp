// Aula de POO - 11/09/2025
// Pedro Ivo Rocha de Deus
// Exemplo de classe do curso C++
// Classe Ver. 0.2.0

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
		void setStoreTitle (string title) {							// Função membro que configura o nome da loja
			storeTitle = title;
		}
		
		string getStoreTitle() {									// Função membro que obtém o nome da loja (leitura do storeTitle)
			return storeTitle;										// Retorno do conteudo do storeTitle será a string contendo o nome da loja
		}
		
		void bootSystem(string storeTitle) {                        // Função membro
			cout << "Score de vendas!\n" << storeTitle << endl;     // Equivalente ao print em C
		}                                                           // << equivale ao . de outras linguagens
	
	private:														// Especificador de acesso onde o usuario final não pode utilizar os dados
		string storeTitle;											// Declaração para um membro de dados
};

// ---- Código Cliente/Principal ----

int main() {
    string storeTitle;                         								// String de caracteres para armazenar titulo da loja
    SalesScore mySales;                         							// Objeto mySales da classe SalesScore

	cout << "Titulo inicial da loja" << mySales.getStoreTitle() << endl;	// De inicio estará vazio pois não foi preenchido
    cout << "Insira o nome da loja:" << endl;
    getline(cin, storeTitle);                   							// Lê o nome da loja com espaços em branco que o usuário escreveu
    cout << endl;                               							// Insere uma linha abaixo

    mySales.bootSystem(storeTitle);             							// Chamada da função membro da classe - mostra o nome inserido

    while(1);                                   							// Código é rodado indefinidamente
    return 0;
}