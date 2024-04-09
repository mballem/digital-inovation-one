while True:
    # Opção de saída
    opcao = input("Digite 's' para sair ou pressione Enter para continuar: ")

    # Verificando se o usuário deseja sair
    if opcao.lower() == "s":
        print("Programa encerrado.")
        break

    # Recebendo os números e a operação do usuário via teclado
    num1 = float(input("Digite o primeiro número: "))
    num2 = float(input("Digite o segundo número: "))
    operacao = input("Digite o tipo de operação matemática (+, -, /, *, mod): ")

    # Realizando a operação escolhida
    if operacao == "+":
        resultado = num1 + num2
    elif operacao == "-":
        resultado = num1 - num2
    elif operacao == "/":
        if num2 != 0:
            resultado = num1 / num2
        else:
            print("Erro: divisão por zero.")
            continue
    elif operacao == "*":
        resultado = num1 * num2
    elif operacao == "mod":
        resultado = num1 % num2
    else:
        print("Operação inválida.")
        continue

    # Imprimindo o resultado no console
    print("Resultado:", resultado)
