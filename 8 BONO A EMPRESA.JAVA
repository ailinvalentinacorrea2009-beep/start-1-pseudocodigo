import java.util.Scanner;

public class BonoEmpresa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double ventas, bono, total;

        System.out.println("=== BONO A EMPRESA ===");

        System.out.print("Ingrese el total de ventas: ");
        ventas = entrada.nextDouble();

        bono = ventas * 0.10;
        total = ventas + bono;

        System.out.println("Ventas: " + ventas);
        System.out.println("Bono: " + bono);
        System.out.println("Total con bono: " + total);

        entrada.close();
    }
}
