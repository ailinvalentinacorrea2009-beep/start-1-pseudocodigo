# Solicitar la cantidad de estudiantes
n = int(input("Ingrese la cantidad de estudiantes: "))

# Inicializar contadores
aprobados = 0
reprobados = 0

# Recorrer las calificaciones
for i in range(1, n + 1):

    # Solicitar la nota
    nota = float(input("Ingrese la nota del estudiante: "))

    # Verificar si aprobó
    if nota >= 7:
        aprobados = aprobados + 1

    else:
        reprobados = reprobados + 1

# Mostrar resultados
print("Cantidad de aprobados:", aprobados)
print("Cantidad de reprobados:", reprobados)
