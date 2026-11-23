# Solicitar la cantidad de dólares
dolares = float(input("Ingrese la cantidad de dólares: $"))

# Solicitar el tipo de cambio
cambio = float(input("Ingrese el tipo de cambio actual: "))

# Calcular los pesos mexicanos
pesos = dolares * cambio

# Mostrar resultado
print("La cantidad equivalente en pesos mexicanos es:", round(pesos, 2))
