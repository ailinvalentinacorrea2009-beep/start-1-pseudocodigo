capital = float(input("Ingrese el capital inicial: "))
deposito = float(input("Ingrese el depósito mensual: "))
n = int(input("Ingrese el número de meses: "))
tasa = float(input("Ingrese la tasa mensual (%): "))

saldo = capital

for mes in range(1, n + 1):
    saldo = (saldo + deposito) * (1 + tasa / 100)
    print("Mes", mes, "- Saldo:", round(saldo, 2))
    
