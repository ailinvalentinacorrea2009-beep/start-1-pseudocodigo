import java.util.Scanner;

public class MontoCompras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double monto, descuento, total;

        System.out.print("Ingrese el monto de compra: ");
        monto = sc.nextDouble();

        if (monto > 100) {
            descuento = monto * 0.10;
        } else {
            descuento = 0;
        }

        total = monto - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}
