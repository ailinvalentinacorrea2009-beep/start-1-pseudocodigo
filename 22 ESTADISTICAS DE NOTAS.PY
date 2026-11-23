n = int(input("Ingrese la cantidad de calificaciones: "))

suma = 0
aprobados = 0
reprobados = 0
mayor = None
menor = None

if n <= 0:
    print("Ingrese una cantidad válida.")
else:
    for i in range(1, n + 1):
        nota = float(input("Ingrese la calificación: "))

        suma += nota

        if mayor is None or nota > mayor:
            mayor = nota

        if menor is None or nota < menor:
            menor = nota

        if nota >= 7:
            aprobados += 1
        else:
            reprobados += 1

    promedio = suma / n

    print("Promedio:", promedio)
    print("Nota mayor:", mayor)
    print("Nota menor:", menor)
    print("Aprobados:", aprobados)
    print("Reprobados:", reprobados)
    
