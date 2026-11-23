print("PRECIO FINAL")

precio = float(input("Ingrese el precio del producto: "))
iva = precio * 0.15

total = precio + iva

print("Precio sin IVA:", precio)
print("IVA:", iva)
print("Precio final:", total)
