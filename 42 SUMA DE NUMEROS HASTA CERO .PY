# Inicializar la suma
suma = 0

# Solicitar el primer número
numero = int(input("Ingrese un número (0 para terminar): "))

# Repetir mientras el número sea diferente de 0
while numero != 0:

    # Acumular el número
    suma = suma + numero

    # Solicitar otro número
    numero = int(input("Ingrese otro número (0 para terminar): "))

# Mostrar la suma final
print("La suma total es:", suma)
