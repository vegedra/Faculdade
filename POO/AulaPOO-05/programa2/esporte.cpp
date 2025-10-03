// Aula Programacao Orientada a Objetos - 02/10/25
// Pedro Ivo Rocha
// Programa 1: Classe esporte e seus atributos

#include <iostream>
#include <string>

using std::cout;

class Esporte {
    private:
        std::string nome;
        std::string modal;	// Individual ou grupo/duplas
	    std::string modalidade;
	    int atletas;
    
    public:
	    void setEsporte() {
	        // Recebe os valores
        	cout << "Insira o nome:" << std::endl;
            getline(std::cin, nome);
            cout << std::endl;
            
            cout << "Insira o modal:" << std::endl;
            getline(std::cin, modal);
            cout << std::endl;
            
            cout << "Insira a modalidade:" << std::endl;
            getline(std::cin, modalidade);
            cout << std::endl;
            
            cout << "Insira a qtde de atletas: " << std::endl;
            std::cin >> atletas;
	    }
        
        void mostrarEsporte() {
            cout << "\nNome do esporte: " << nome;
            cout << "\nModal: " << modal;
            cout << "\nModalidade: " << modalidade;
            cout << "\nNumero de atletas: " << atletas;
        }
};

int main() {
    Esporte esporte;
    
    esporte.setEsporte();
    esporte.mostrarEsporte();
    
    esporte.setEsporte();
    esporte.mostrarEsporte();
    
    esporte.setEsporte();
    esporte.mostrarEsporte();
    
    esporte.setEsporte();
    esporte.mostrarEsporte();
    
	// Encerra o programa
    return 0;
}