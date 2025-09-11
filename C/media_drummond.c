// Coded by Ivo, 18/06/2024 -- Calculadora de Média Unidrummond

#include <stdio.h>

int main (void) {
	float media, notas[4];
	
	printf("Digite a nota da AC1.\n");
	scanf("%f", &notas[1]);
	
	printf("Digite a nota da AC2.\n");
	scanf("%f", &notas[2]);
	
	printf("Digite a nota do PEX.\n");
	scanf("%f", &notas[3]);
	
	printf("Digite a nota da AR.\n");
	scanf("%f", &notas[4]);
	
    media = (notas[1] * 0.10) + (notas[2] * 0.20) + (notas[3] * 0.20) + (notas[4] * 0.50);
    
    printf("\nSuas notas: AC1: %.2f, AC2: %.2f, PEX: %.2f, AR: %.2f\n", notas[1], notas[2], notas[3], notas[4]);
    
    if (media >= 7) {
        printf("Você passou, parabéns!");
    } else {
        printf("Você ficou de exame :(");
    }
    
}