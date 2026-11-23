dia = int(input("Ingrese el día: "))
mes = int(input("Ingrese el mes: "))
anio = int(input("Ingrese el año: "))

if anio <= 0 or mes < 1 or mes > 12:
    valida = False
else:
    bisiesto = (anio % 400 == 0) or (anio % 4 == 0 and anio % 100 != 0)

    if mes == 2:
        max_dias = 29 if bisiesto else 28
    elif mes in (4, 6, 9, 11):
        max_dias = 30
    else:
        max_dias = 31

    valida = 1 <= dia <= max_dias

if valida:
    print("Fecha válida.")
else:
    print("Fecha no válida.")
    
