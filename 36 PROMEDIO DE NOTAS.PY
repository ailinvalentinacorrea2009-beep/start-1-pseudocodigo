# Solicitar la cantidad de notas
n = int(input("Ingrese la cantidad de notas: "))

# Inicializar la suma
suma = 0

# Verificar que N sea válido
if n > 0:

    # Leer las notas
    for i in range(1, n + 1):

        nota = float(input("Ingrese la nota: "))

        # Acumular las notas
        suma = suma + nota

    # Calcular el promedio
    promedio = suma / n

    # Mostrar resultado
    print("El promedio es:", round(promedio, 2))

else:
    print("La cantidad de notas debe ser mayor que cero")


     
