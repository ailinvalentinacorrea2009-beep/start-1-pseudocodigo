import java.util.Scanner;

public class GastoTransporte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pasaje, viajes, dias, total;

        System.out.print("Ingrese el costo del pasaje: ");
        pasaje = sc.nextDouble();

        System.out.print("Ingrese los viajes diarios: ");
        viajes = sc.nextDouble();

        System.out.print("Ingrese los dias del mes: ");
        dias = sc.nextDouble();

        if (pasaje >= 0 && viajes >= 0 && dias >= 0) {

            total = pasaje * viajes * dias;

            System.out.println("Gasto mensual: $" + total);

        } else {
            System.out.println("Datos no validos");
        }

        sc.close();
    }
}
