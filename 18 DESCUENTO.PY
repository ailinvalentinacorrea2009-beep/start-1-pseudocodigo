# Solicitar el valor de la compra
compra = float(input("Ingrese el valor de la compra: $"))

# Preguntar si es estudiante de la UTPL
estudiante = input("¿Es estudiante de la UTPL? (si/no): ").lower()

# Inicializar el descuento
descuento = 0

# Verificar si es estudiante
if estudiante == "si":
    descuento = 20

    # Verificar si la compra supera los $30
    if compra > 30:
        descuento = descuento + 5

else:
    # Verificar si la compra supera los $50
    if compra > 50:
        descuento = 10

# Calcular el valor del descuento
valor_descuento = compra * descuento / 100

# Calcular el total a pagar
total = compra - valor_descuento

# Mostrar resultados
print("Descuento aplicado:", descuento, "%")
print("Valor del descuento: $", valor_descuento)
print("Total a pagar: $", total)
