# Mostrar el menú
print("===== MENÚ DE LA CAFETERÍA =====")
print("1. Café - $1.50")
print("2. Jugo - $1.20")
print("3. Sándwich - $2.50")
print("4. Salir")

# Solicitar una opción
opcion = int(input("Seleccione una opción: "))

# Evaluar la opción seleccionada
if opcion == 1:
    print("Usted seleccionó Café")
    print("Precio: $1.50")

elif opcion == 2:
    print("Usted seleccionó Jugo")
    print("Precio: $1.20")

elif opcion == 3:
    print("Usted seleccionó Sándwich")
    print("Precio: $2.50")

elif opcion == 4:
    print("Gracias por visitar la cafetería")

else:
    print("Opción no válida")
    
