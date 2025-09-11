// Aula de POO - 11/09/2025
// Pedro Ivo Rocha de Deus
// Exemplo de classe do curso C++
// Classe Ver. 0.3.0

#include <iostream> // Biblioteca padrao - equivalente em C++ do stdio.h de Credito

using std::cout;        // Obj. fluxo saida
using std::cin;         // Obj. fluxo entrada
using std::endl;        // Nova linha

#include <string>       // Classe de string padr�o C++

using std::string;
using std::getline;     // L� o texto com espa�os em branco

// ---- Desenvolvimento da Classe ----
// Classes s�o programas paralelos que rodam no programa principal.
// O construtor vai inicializar o titulo da loja ou numero de lojas que essa classe conter�
// Construtor = fun��o especial da classe, com o mesmo nome dela, que roda automaticamente 
// quando o objeto � criado e serve para inicializar seus atributos.

class SalesScore {
	public:                                                         // Especificador de acesso
		SalesScore (string title) {									// Construtor
		setStoreTitle (title);
		}
		
		void setStoreTitle (string title) {							// Fun��o membro que configura o nome da loja
			storeTitle = title;
		}
		
		string getStoreTitle() {									// Fun��o membro que obt�m o nome da loja (leitura do storeTitle)
			return storeTitle;										// Retorno do conteudo do storeTitle ser� a string contendo o nome da loja
		}
		
		void bootSystem(string storeTitle) {                        // Fun��o membro
			cout << "Score de vendas!\n" << storeTitle << endl;     // Equivalente ao print em C
		}                                                           // << equivale ao . de outras linguagens
	
	private:														// Especificador de acesso onde o usuario final n�o pode utilizar os dados
		string storeTitle;											// Declara��o para um membro de dados
};

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