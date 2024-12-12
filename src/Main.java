/*
* Autor: Leonardo Garbuio Cavalheiro
* Linguagem: Java
* Data: 10/12/2024
* Descrição: Le 4 valores e diz se voce pode ou nao ir a montanhaRussa
* Funcionalidades: ler 4 valores analisalos e exibir uma mensagem dependendo das suas respostas se voce pode ou nao andar na MontanhaRussa
* Versão: 1.0
*/

import java.util.Scanner;  // importa Scanner para ler os dados do usuario

public class Main {  // classe principal
    public static void main(String[] args) {  // metodo principal que é executado ao rodar o programa
        java.io.PrintStream out = System.out;  // cria uma referência ao fluxo de saída para facilitar a impressão de mensagens
        Scanner scanner = new Scanner(System.in);  // cria um objeto Scanner para ler dados do teclado

        float P = 0;  // declara a variável P como um numero de ponto flutuante
        float A = 0;  // declara a variável A como um numero de ponto flutuante
        int I = 0;  // declara a variável I como um inteiro
        String[] N = new String[2];  // declara um array de Strings N de tamanho 2 para armazenar o nome de duas pessoas

        for (int i = 0; i < 2; i++){  // inicia um loop que roda 2 vezes uma para cada pessoa
            out.println("Digite seu nome: ");  // entrada pede o nome do usuario
            N[i] = scanner.nextLine();  // le e armazena o nome do usuario

            out.println("Digite sua Idade: ");  // entrada pede a idade do usuario
            I = scanner.nextInt();  // le e armazena a idade do usuario dentro do I

            out.println("Digite sua Altura: ");  // entrada pede a altura do usuario
            A = scanner.nextFloat();  // le e armazena a altura do usuario dentro do A

            out.println("Digite seu Peso: ");  // entrada pede o peso do usuario
            P = scanner.nextFloat();  // le e armazena o peso do usuario dentro do  P

            scanner.nextLine();  // limpa o scanner para dar espaço entre as duas mensagens

            //condição verifica se voce pode ou nao ir a MontanhaRussa
            if (I >= 14 && A >= 1.60 && P <= 80) {  //se o usuario tiver menos de 14 anos se altura for maior ou igual a 1,60m e se o peso for menor ou igual a 80kg voce pode ir 
                System.out.print(N[i] + " pode andar na Montanha Russa.");  // se o usuario atender aos requisitos pode ir na MontanhaRussa
            } else {  // se o usuario tiver menos de 14 anos tiver menos de 1,60 ou se for mais pesada doq 80kg ela nao podera ir 
                System.out.print(N[i] + " não pode andar na Montanha Russa.");  // saiba exibi que a pessoa nao pode andar na MontanhaRussa
            }
        }

        scanner.close();  // Fecha o scanner 
    }
}
