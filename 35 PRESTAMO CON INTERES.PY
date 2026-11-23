# Solicitar los datos del préstamo
prestamo = float(input("Ingrese el monto del préstamo: $"))

tasa = float(input("Ingrese la tasa de interés trimestral en decimal: "))

trimestres = int(input("Ingrese el número de trimestres: "))

porcentaje_abono = float(input("Ingrese el porcentaje de abono extraordinario: "))

# Calcular el monto total con interés compuesto
monto_total = prestamo * (1 + tasa) ** trimestres

# Calcular el valor del abono extraordinario
abono = monto_total * porcentaje_abono / 100

# Restar el abono del monto total
monto_final = monto_total - abono

# Mostrar los resultados
print("Monto total antes del abono: $", round(monto_total, 2))

print("Valor del abono extraordinario: $", round(abono, 2))

print("Monto final a cancelar: $", round(monto_final, 2))

