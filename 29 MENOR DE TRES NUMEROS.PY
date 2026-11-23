# Solicitar tres números
num1 = float(input("Ingrese el primer número: "))
num2 = float(input("Ingrese el segundo número: "))
num3 = float(input("Ingrese el tercer número: "))

# Determinar el menor
if num1 <= num2 and num1 <= num3:
    menor = num1

elif num2 <= num1 and num2 <= num3:
    menor = num2

else:
    menor = num3

# Mostrar resultado
print("El número menor es:", menor)
