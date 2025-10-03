// Aula Programacao Orientada a Objetos - 02/10/25
// Pedro Ivo Rocha
// Programa 1: Ler nome e idade do usuario e mostrar na tela - C++ sem classes

#include <iostream>
#include <string>

using std::cout;
using std::cin;
using std::endl;

int main() {
    // Cria as variaveis
	std::string nome;
	int idade;
	
	// Recebe os valores
	cout << "Insira seu nome:" << endl;
    getline(cin, nome);
    cout << endl;
    
    cout << "Insira sua idade:" << endl;
    cin >> idade;
    
    // Mostra os valores
    cout << "\nSeu nome: " << nome;
    cout << "\nSua idade: " << idade;
	
	// Encerra o programa
    return 0;
}