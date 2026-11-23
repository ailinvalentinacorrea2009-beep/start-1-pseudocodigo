# Solicitar el precio original
precio = float(input("Ingrese el precio original: $"))

# Calcular el descuento del 20%
descuento = precio * 0.20

# Calcular el precio con descuento
precio_descuento = precio - descuento

# Calcular el IVA del 15%
iva = precio_descuento * 0.15

# Calcular el precio final
precio_final = precio_descuento + iva

# Mostrar resultados
print("Precio con descuento: $", round(precio_descuento, 2))
print("IVA del 15%: $", round(iva, 2))
print("Precio final: $", round(precio_final, 2))
