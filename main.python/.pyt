"""
Autor: Leonardo Garbuio Cavalheiro
Linguagem: Java
Data: 10/12/2024
Descrição: Le 4 valores e diz se voce pode ou nao ir a montanhaRussa
Funcionalidades: ler 4 valores analisalos e exibir uma mensagem dependendo das suas respostas se voce pode ou nao andar na MontanhaRussa
Versão: 1.0
"""

# Declara a variável P como um número de ponto flutuante e inicializa com 0
P = 0.0

# Declara a variável A como um número de ponto flutuante e inicializa com 0
A = 0.0

# Declara a variável I como um inteiro e inicializa com 0
I = 0

# Declara um array de Strings N de tamanho 2 para armazenar os nomes de duas pessoas
N = ["", ""]

# Inicia um loop que ira rodar duas vezes uma para cada pessoa
for i in range(2):
    # Entrada pede o nome do usuário
    print("Digite seu nome:")
    N[i] = input()  # Le e armazena o nome do usuário

    # Entrada pede a idade do usuário
    print("Digite sua Idade:")
    I = int(input())  # Le e armazena a idade do usuário dentro de I

    # Entrada pede a altura do usuário
    print("Digite sua Altura:")
    A = float(input())  # Le e armazena a altura do usuário dentro de A

    # Entrada pede o peso do usuário
    print("Digite seu Peso:")
    P = float(input())  # Le e armazena o peso do usuário dentro de P

    # Condição verifica se você pode ou não ir à MontanhaRussa
    if I >= 14 and A >= 1.60 and P <= 80:  # Se o usuário atender aos requisitos pode ir na MontanhaRussa
        print(N[i] + " pode andar na Montanha Russa.")
    else:  # Se o usuário não atender aos requisitos nao pode ir na MontanhaRussa
        print(N[i] + " não pode andar na Montanha Russa.")

