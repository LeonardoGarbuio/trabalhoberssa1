/*
Autor: Leonardo Garbuio Cavalheiro
Linguagem: Java
Data: 10/12/2024
Descrição: Le 4 valores e diz se voce pode ou nao ir a montanhaRussa
Funcionalidades: ler 4 valores analisalos e exibir uma mensagem dependendo das suas respostas se voce pode ou nao andar na MontanhaRussa
Versão: 1.0
*/

#include <stdio.h>

int main() {
    // Declara a variável P como um número de ponto flutuante e inicializa com 0
    float P = 0.0;

    // Declara a variável A como um número de ponto flutuante e inicializa com 0
    float A = 0.0;

    // Declara a variável I como um inteiro e inicializa com 0
    int I = 0;

    // Declara um array de Strings N de tamanho 2 para armazenar os nomes de duas pessoas
    // cada nome pode ter no máximo 20 caracteres
    char N[2][21];

    // Inicia um loop que irá rodar duas vezes uma para cada pessoa
    for (int i = 0; i < 2; i++) {
        // Entrada pede o nome do usuário
        printf("Digite seu nome:\n");
        scanf("%19s", N[i]);  // Le e armazena o nome do usuário limitando a 19 caracteres

        // Entrada pede a idade do usuário
        printf("Digite sua Idade:\n");
        scanf("%d", &I);  // Le e armazena a idade do usuário dentro de I

        // Entrada pede a altura do usuário
        printf("Digite sua Altura:\n");
        scanf("%f", &A);  // Le e armazena a altura do usuário dentro de A

        // Entrada pede o peso do usuário
        printf("Digite seu Peso:\n");
        scanf("%f", &P);  // Le e armazena o peso do usuário dentro de P

        // Condição verifica se você pode ou não ir à MontanhaRussa
        if (I >= 14 && A >= 1.60 && P <= 80) {  // Se o usuário atender aos requisitos pode ir na MontanhaRussa
            printf("%s pode andar na Montanha Russa.\n", N[i]);
        } else {  // Se o usuário não atender aos requisitos nao pode ir na MontanhaRussa
            printf("%s não pode andar na Montanha Russa.\n", N[i]);
        }
    }

    return 0;
}
