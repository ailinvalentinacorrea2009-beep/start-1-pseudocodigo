# Inicializar las variables
total_ventas = 0
contador_dias = 0
dias_mayores_500 = 0

venta_maxima = 0
dia_mayor_venta = 0

# Solicitar la primera venta
venta = float(input("Ingrese la venta del día (-1 para terminar): $"))

# Repetir mientras la venta sea diferente de -1
while venta != -1:

    # Aumentar el contador de días
    contador_dias = contador_dias + 1

    # Acumular las ventas
    total_ventas = total_ventas + venta

    # Contar los días con ventas superiores a $500
    if venta > 500:
        dias_mayores_500 = dias_mayores_500 + 1

    # Identificar la venta máxima
    if contador_dias == 1 or venta > venta_maxima:

        venta_maxima = venta
        dia_mayor_venta = contador_dias

    # Solicitar la siguiente venta
    venta = float(input("Ingrese la venta del siguiente día (-1 para terminar): $"))

# Verificar si existen ventas registradas
if contador_dias > 0:

    # Calcular el promedio
    promedio = total_ventas / contador_dias

    # Mostrar los resultados
    print("\n===== RESULTADOS DE VENTAS =====")

    print("Total de ventas: $", round(total_ventas, 2))

    print("Promedio de ventas: $", round(promedio, 2))

    print("Días con ventas superiores a $500:", dias_mayores_500)

    print("Venta máxima: $", round(venta_maxima, 2))

    print("Día de la mayor venta:", dia_mayor_venta)

else:

    print("No se ingresaron ventas.")
