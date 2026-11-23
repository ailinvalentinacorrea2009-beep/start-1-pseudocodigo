# Solicitar la nota
nota = float(input("Ingrese la nota del estudiante: "))

# Verificar que la nota sea válida
if nota < 0 or nota > 10:

    print("Nota inválida")

elif nota >= 9:

    print("Calificación: A")

elif nota >= 8:

    print("Calificación: B")

elif nota >= 7:

    print("Calificación: C")

elif nota >= 6:

    print("Calificación: D")

else:

    print("Calificación: F")
    
