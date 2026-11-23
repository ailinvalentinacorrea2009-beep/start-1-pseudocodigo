a = int(input("Ingrese el primer número: "))
b = int(input("Ingrese el segundo número: "))

if a <= 0 or b <= 0:
    print("Ingrese números positivos.")
else:
    while b != 0:
        residuo = a % b
        a = b
        b = residuo

    print("MCD:", a)
    
