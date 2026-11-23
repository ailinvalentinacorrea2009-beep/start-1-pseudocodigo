n = int(input("Ingrese un número: "))

suma = 0

if n > 0:
    for i in range(1, n):
        if n % i == 0:
            suma += i

    if suma == n:
        print("Es un número perfecto.")
    else:
        print("No es un número perfecto.")
else:
    print("Ingrese un número positivo.")
    
