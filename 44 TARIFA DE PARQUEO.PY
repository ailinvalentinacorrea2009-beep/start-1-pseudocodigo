# Solicitar datos
horas = float(input("Ingrese las horas de estacionamiento: "))
estudiante = input("¿Es estudiante de la UTPL? (si/no): ").lower()

# Establecer tarifa por hora
tarifa = 1

# Calcular el costo inicial
total = horas * tarifa

# Verificar si es estudiante
if estudiante == "si":

    # Aplicar descuento del 50%
    total = total * 0.50

    # Verificar si supera las 4 horas
    if horas > 4:
        total = total * 1.20

else:

    # Verificar si supera las 6 horas
    if horas > 6:
        total = total * 1.20

# Mostrar el total
print("Total a pagar: $", round(total, 2))
