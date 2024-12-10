
/*
* Autor: Leonardo Garbuio Cavalheiro
* Linguagem: Java
* Data: 10/12/2024
* Descrição: Le 4 valores e diz se voce pode ou nao ir a montanhaRussa
* Funcionalidades: ler 4 valores analisalos e exibir uma mensagem dependendo das suas respostas se voce pode ou nao andar na MontanhaRussa
* Versão: 1.0
*/
import java.util.Scanner;  // Importa a classe Scanner para leitura de dados do usuário

public class Main {  // Define a classe principal do programa
    public static void main(String[] args) {  // Método principal que é executado ao rodar o programa
        java.io.PrintStream out = System.out;  // Cria uma referência ao fluxo de saída para facilitar a impressão de mensagens
        Scanner scanner = new Scanner(System.in);  // Cria um objeto Scanner para ler dados do teclado

        float P = 0;  // Declara a variável P (peso) como um número de ponto flutuante e inicializa com 0
        float A = 0;  // Declara a variável A (altura) como um número de ponto flutuante e inicializa com 0
        int I = 0;  // Declara a variável I (idade) como um inteiro e inicializa com 0
        String[] N = new String[2];  // Declara um array de Strings N de tamanho 2 para armazenar os nomes de duas pessoas

        for (int i = 0; i < 2; i++){  // Inicia um loop que irá rodar duas vezes, uma para cada pessoa
            out.println("Digite seu nome: ");  // Exibe a mensagem pedindo o nome do usuário
            N[i] = scanner.nextLine();  // Lê o nome do usuário e armazena no array N na posição i

            out.println("Digite sua Idade: ");  // Exibe a mensagem pedindo a idade do usuário
            I = scanner.nextInt();  // Lê a idade do usuário e armazena em I

            out.println("Digite sua Altura: ");  // Exibe a mensagem pedindo a altura do usuário
            A = scanner.nextFloat();  // Lê a altura do usuário e armazena em A

            out.println("Digite seu Peso: ");  // Exibe a mensagem pedindo o peso do usuário
            P = scanner.nextFloat();  // Lê o peso do usuário e armazena em P

            scanner.nextLine();  // Limpa o buffer do scanner (importante após ler um número para garantir que a próxima leitura funcione corretamente)

            // Condicional que verifica se a pessoa pode ou não ir à montanha-russa
            if (I >= 14 && A >= 1.60 && P <= 80) {  // Se a idade for maior ou igual a 14, a altura for maior ou igual a 1,60m e o peso for menor ou igual a 80kg
                System.out.print(N[i] + " pode andar na Montanha Russa.");  // Se a pessoa atender aos requisitos, exibe que ela pode andar na montanha-russa
            } else {  // Caso contrário
                System.out.print(N[i] + " não pode andar na Montanha Russa.");  // Exibe que a pessoa não pode andar na montanha-russa
            }
        }

        scanner.close();  // Fecha o scanner para liberar o recurso de leitura após o uso
    }
}

