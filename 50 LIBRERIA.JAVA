import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        double precio, subtotal, descuento, total;

        System.out.print("Ingrese cantidad de libros: ");
        cantidad = sc.nextInt();

        System.out.print("Ingrese precio por libro: ");
        precio = sc.nextDouble();

        subtotal = cantidad * precio;

        if (subtotal > 50) {
            descuento = subtotal * 0.10;
        } else {
            descuento = 0;
        }

        total = subtotal - descuento;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total: $" + total);

        sc.close();
    }
}
