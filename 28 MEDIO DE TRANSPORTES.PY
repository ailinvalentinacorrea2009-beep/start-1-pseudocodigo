# Mostrar las opciones
print("===== MEDIOS DE TRANSPORTE =====")
print("1. Autobús")
print("2. Taxi")
print("3. Bicicleta")
print("4. Caminando")

# Solicitar una opción
opcion = int(input("Seleccione un medio de transporte: "))

# Evaluar la opción
if opcion == 1:

    tiempo = 25
    transporte = "Autobús"
    comentario = "Es económico, pero puede tener paradas."
 
elif opcion == 2:

    tiempo = 15
    transporte = "Taxi"
    comentario = "Es rápido y cómodo."

elif opcion == 3:

    tiempo = 20
    transporte = "Bicicleta"
    comentario = "Es saludable y ecológico."

elif opcion == 4:

    tiempo = 60
    transporte = "Caminando"
    comentario = "Es saludable, pero toma más tiempo."

else:

    tiempo = 0
    transporte = "Inválido"
    comentario = ""

# Mostrar resultados
if opcion >= 1 and opcion <= 4:

    print("Transporte:", transporte)
    print("Distancia: 5 kilómetros")
    print("Tiempo estimado:", tiempo, "minutos")
    print("Comentario:", comentario)

else:

    print("Opción inválida")
    
