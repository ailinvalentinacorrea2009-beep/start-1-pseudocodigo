# Solicitar los datos del estudiante
promedio = float(input("Ingrese el promedio del estudiante: "))

reprobadas = int(input("Ingrese el número de materias reprobadas: "))

primer_ciclo = input("¿Es estudiante de primer ciclo? (S/N): ").upper()

# Inicializar el porcentaje de beca
beca = 0

# Evaluar las condiciones para asignar la beca
if promedio >= 9.0 and reprobadas == 0 and primer_ciclo == "S":

    beca = 100

elif promedio >= 8.0 and reprobadas <= 1:

    beca = 70

elif promedio >= 7.0 and reprobadas <= 2:

    beca = 40

else:

    beca = 0

# Mostrar el resultado
print("Porcentaje de beca asignado:", beca, "%")

# Mostrar si la solicitud fue aprobada o rechazada
if beca > 0:
    print("SOLICITUD DE BECA APROBADA")

else:
    print("SOLICITUD DE BECA RECHAZADA")
    
