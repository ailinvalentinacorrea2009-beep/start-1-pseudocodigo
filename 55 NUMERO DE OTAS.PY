print("NUMERO DE NOTAS")

cantidad = int(input("Cuantas notas desea ingresar: "))

suma = 0

for i in range(cantidad):
    nota = float(input("Ingrese una nota: "))
    suma = suma + nota

print("La suma de las notas es:", suma)
