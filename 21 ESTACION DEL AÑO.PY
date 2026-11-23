mes = int(input("Ingrese el mes (1-12): "))
dia = int(input("Ingrese el día: "))

dias_mes = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

if mes < 1 or mes > 12 or dia < 1 or dia > dias_mes[mes - 1]:
    print("Fecha no válida.")
elif mes in (12, 1, 2, 3):
    print("Verano.")
elif mes in (4, 5, 6):
    print("Otoño.")
elif mes in (7, 8, 9):
    print("Invierno.")
else:
    print("Primavera.")
    
