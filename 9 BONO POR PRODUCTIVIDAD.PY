sueldo = float(input("Ingrese el sueldo base: "))
productividad = float(input("Ingrese la productividad: "))

if productividad >= 90:
    porcentaje = 20
elif productividad >= 70:
    porcentaje = 10
elif productividad >= 50:
    porcentaje = 5
else:
    porcentaje = 0

bono = sueldo * porcentaje / 100
total = sueldo + bono

print("Porcentaje de bono:", porcentaje, "%")
print("Bono:", bono)
print("Total a pagar:", total)
