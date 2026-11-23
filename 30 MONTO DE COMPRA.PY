# Solicitar el monto de compra
compra = float(input("Ingrese el monto de la compra: $"))

# Determinar el descuento
if compra >= 200:
    descuento = 0.15

elif compra >= 100:
    descuento = 0.10

else:
    descuento = 0.05

# Calcular el valor del descuento
valor_descuento = compra * descuento

# Calcular el monto final
total = compra - valor_descuento

# Mostrar resultados
print("Descuento aplicado:", descuento * 100, "%")
print("Valor del descuento: $", round(valor_descuento, 2))
print("Monto a pagar: $", round(total, 2))
