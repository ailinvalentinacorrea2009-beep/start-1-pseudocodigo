import java.util.Scanner;

public class EnergiaElectrica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double consumo, tarifa, total;

        System.out.println("=== CALCULO DE ENERGIA ELECTRICA ===");

        System.out.print("Ingrese el consumo en kWh: ");
        consumo = entrada.nextDouble();

        tarifa = 0.10;

        total = consumo * tarifa;

        System.out.println("Consumo electrico: " + consumo + " kWh");
        System.out.println("Tarifa por kWh: $" + tarifa);
        System.out.println("Total a pagar: $" + total);

        entrada.close();
    }
}
