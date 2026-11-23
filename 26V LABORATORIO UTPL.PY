# Preguntar si es estudiante
estudiante = input("¿Es estudiante? (si/no): ").lower()

# Verificar si es estudiante
if estudiante == "si":

    # Solicitar información del carnet
    carnet = input("¿Tiene carnet válido? (si/no): ").lower()

    if carnet == "si":
        print("Acceso permitido")

    else:
        print("Acceso denegado: carnet no válido")

else:

    # Preguntar si tiene autorización del docente
    autorizacion = input(
        "¿Tiene autorización especial del docente? (si/no): "
    ).lower()

    if autorizacion == "si":
        print("Ingreso temporal autorizado")

    else:
        print("Acceso denegado")
        
