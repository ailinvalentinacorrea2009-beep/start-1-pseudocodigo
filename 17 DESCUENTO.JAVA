import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio, porcentaje, descuento, total;

        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();

        System.out.print("Ingrese el descuento (%): ");
        porcentaje = sc.nextDouble();

        descuento = precio * porcentaje / 100;
        total = precio - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}
