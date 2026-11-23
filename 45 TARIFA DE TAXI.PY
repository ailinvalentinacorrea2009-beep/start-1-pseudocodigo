km = float(input("Ingrese los kilómetros recorridos: "))
noche = input("¿Es de noche? (S/N): ").upper()

if km < 0 or noche not in ("S", "N"):
    print("Datos incorrectos.")
else:
    tarifa = 2 + 1.50 * km

    if km > 10:
        tarifa = tarifa * 1.20

    if noche == "S":
        tarifa = tarifa * 1.30

    print("Total a pagar: $", tarifa)
    
