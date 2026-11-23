print("LIBRERIA DWSC")

precio = float(input("Ingrese el precio del producto: "))
cantidad = int(input("Ingrese la cantidad de productos: "))

subtotal = precio * cantidad

if subtotal >= 100:
    descuento = subtotal * 0.10
else:
    descuento = 0

total = subtotal - descuento

print("Subtotal:", subtotal)
print("Descuento:", descuento)
print("Total a pagar:", total)
