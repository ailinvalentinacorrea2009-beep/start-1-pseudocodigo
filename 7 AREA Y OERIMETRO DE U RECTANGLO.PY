# Solicitar largo y ancho
largo = float(input("Ingrese el largo del terreno: "))
ancho = float(input("Ingrese el ancho del terreno: "))

# Calcular el área
area = largo * ancho

# Calcular el perímetro
perimetro = 2 * (largo + ancho)

# Mostrar resultados
print("El área del rectángulo es:", area, "m2")
print("El perímetro del rectángulo es:", perimetro, "m")
