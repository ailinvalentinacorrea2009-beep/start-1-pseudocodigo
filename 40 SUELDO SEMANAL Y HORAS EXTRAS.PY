# Solicitar datos
horas = float(input("Ingrese las horas trabajadas: "))
tarifa = float(input("Ingrese el pago por hora: $"))

# Calcular el sueldo
if horas <= 40:
    sueldo = horas * tarifa

else:
    sueldo = (40 * tarifa) + ((horas - 40) * tarifa * 2)

# Mostrar resultado
print("El sueldo semanal es: $", round(sueldo, 2))
