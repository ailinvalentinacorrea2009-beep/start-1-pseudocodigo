# Solicitar la temperatura
temperatura = float(input("Ingrese la temperatura de Loja: "))

# Clasificar la temperatura
if temperatura < 15:
    print("Clima frío")

elif temperatura <= 25:
    print("Clima templado")

else:
    print("Clima cálido")

# Verificar si existe alerta de calor extremo
if temperatura > 30:
    print("ALERTA: Temperatura extrema")
    
