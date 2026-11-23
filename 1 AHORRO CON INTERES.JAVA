import java.util.Scanner;

public class AhorroConInteres {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double ahorro, tasa, tiempo, monto;

        System.out.println("=== AHORRO CON INTERES ===");

        System.out.print("Ingrese el ahorro inicial: ");
        ahorro = entrada.nextDouble();

        System.out.print("Ingrese la tasa de interes anual (%): ");
        tasa = entrada.nextDouble();

        System.out.print("Ingrese el tiempo en años: ");
        tiempo = entrada.nextDouble();

        monto = ahorro * Math.pow(1 + tasa / 100, tiempo);

        System.out.println("Ahorro inicial: $" + ahorro);
        System.out.println("Monto final: $" + monto);
        System.out.println("Interes ganado: $" + (monto - ahorro));

        entrada.close();
    }
}
