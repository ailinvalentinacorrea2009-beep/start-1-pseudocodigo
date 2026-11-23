# Solicitar un número
dia = int(input("Ingrese un número del 1 al 7: "))

# Evaluar el día
if dia == 1:
    nombre = "Lunes"
    tipo = "Día laborable"

elif dia == 2:
    nombre = "Martes"
    tipo = "Día laborable"

elif dia == 3:
    nombre = "Miércoles"
    tipo = "Día laborable"

elif dia == 4:
    nombre = "Jueves"
    tipo = "Día laborable"

elif dia == 5:
    nombre = "Viernes"
    tipo = "Día laborable"

elif dia == 6:
    nombre = "Sábado"
    tipo = "Fin de semana"

elif dia == 7:
    nombre = "Domingo"
    tipo = "Fin de semana"

else:
    nombre = "Inválido"
    tipo = ""

# Mostrar resultados
if dia >= 1 and dia <= 7:
    print("Día:", nombre)
    print("Clasificación:", tipo)
else:
    print("Número inválido. Ingrese un número del 1 al 7.")
    
