# Solicitar información
salario = float(input("Ingrese el salario: $"))
anios = float(input("Ingrese los años de antigüedad: "))
evaluacion = input("¿Tiene evaluación excelente? (si/no): ").lower()

# Inicializar el bono
bono = 0

# Verificar los años de antigüedad
if anios > 2:

    bono = 10

    # Verificar la evaluación
    if evaluacion == "si":
        bono = bono + 5

elif anios < 2:

    if evaluacion == "si":
        bono = 5

else:
    print("Tiene exactamente 2 años de antigüedad.")

# Calcular el valor del bono
valor_bono = salario * bono / 100

# Calcular el salario final
salario_final = salario + valor_bono

# Mostrar resultados
print("Porcentaje del bono:", bono, "%")
print("Valor del bono: $", valor_bono)
print("Salario final: $", salario_final)
