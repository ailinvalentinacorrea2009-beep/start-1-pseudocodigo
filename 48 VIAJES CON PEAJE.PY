distancia = float(input("Ingrese la distancia en km: "))
consumo = float(input("Ingrese el rendimiento en km/l: "))
precio = float(input("Ingrese el precio por litro: "))
cantidad = int(input("Ingrese la cantidad de peajes: "))

costo_peajes = 0

for i in range(cantidad):
    peaje = float(input("Ingrese el costo del peaje: "))
    costo_peajes += peaje

litros = distancia / consumo
costo_combustible = litros * precio
total = costo_combustible + costo_peajes

print("Litros necesarios:", litros)
print("Costo de combustible:", costo_combustible)
print("Costo de peajes:", costo_peajes)
print("Costo total:", total)

