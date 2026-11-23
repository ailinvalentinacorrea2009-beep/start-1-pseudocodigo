a1 = float(input("Ingrese el primer ángulo: "))
a2 = float(input("Ingrese el segundo ángulo: "))
a3 = float(input("Ingrese el tercer ángulo: "))

if a1 <= 0 or a2 <= 0 or a3 <= 0 or a1 + a2 + a3 != 180:
    print("Los ángulos no forman un triángulo.")
elif a1 < 90 and a2 < 90 and a3 < 90:
    print("Triángulo acutángulo.")
elif a1 == 90 or a2 == 90 or a3 == 90:
    print("Triángulo rectángulo.")
else:
    print("Triángulo obtusángulo.")
    
