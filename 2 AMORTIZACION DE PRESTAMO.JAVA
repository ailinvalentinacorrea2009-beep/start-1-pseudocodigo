import java.util.Scanner;

public class AmortizacionPrestamo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double prestamo, tasa, cuota, interes;
        double capital, saldo;
        int meses;

        System.out.println("=== AMORTIZACION DE PRESTAMO ===");

        System.out.print("Ingrese el valor del prestamo: ");
        prestamo = entrada.nextDouble();

        System.out.print("Ingrese la tasa de interes mensual (%): ");
        tasa = entrada.nextDouble();

        System.out.print("Ingrese el numero de meses: ");
        meses = entrada.nextInt();

        if (prestamo > 0 && meses > 0 && tasa >= 0) {

            double i = tasa / 100;

            if (i == 0) {
                cuota = prestamo / meses;
            } else {
                cuota = prestamo * i /
                        (1 - Math.pow(1 + i, -meses));
            }

            saldo = prestamo;

            System.out.println("\nCUOTA MENSUAL: " + cuota);

            for (int mes = 1; mes <= meses; mes++) {

                interes = saldo * i;
                capital = cuota - interes;
                saldo = saldo - capital;

                if (mes == meses) {
                    saldo = 0;
                }

                System.out.println("Mes: " + mes);
                System.out.println("Interes: " + interes);
                System.out.println("Capital: " + capital);
                System.out.println("Saldo: " + saldo);
            }

        } else {
            System.out.println("Datos incorrectos");
        }

        entrada.close();
    }
}
