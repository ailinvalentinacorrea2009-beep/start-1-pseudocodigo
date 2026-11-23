monto = float(input("Ingrese el monto del préstamo: "))
tasa = float(input("Ingrese la tasa mensual (%): "))
meses = int(input("Ingrese el número de meses: "))

interes_total = monto * (tasa / 100) * meses
cuota = (monto + interes_total) / meses

print("Interés total:", interes_total)
print("Cuota mensual:", cuota)
