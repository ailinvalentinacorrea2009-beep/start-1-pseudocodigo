numero = int(input("Ingrese un número decimal: "))

if numero == 0:
    print("Binario: 0")
elif numero > 0:
    binario = ""

    while numero > 0:
        residuo = numero % 2
        binario = str(residuo) + binario
        numero = numero // 2

    print("Número binario:", binario)
else:
    print("Ingrese un número positivo.")
