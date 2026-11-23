import java.util.Scanner;

public class PrecioFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio, iva, total;

        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextDouble();

        if (precio >= 0) {

            iva = precio * 0.15;
            total = precio + iva;

            System.out.println("IVA: " + iva);
            System.out.println("Precio final: " + total);

        } else {
            System.out.println("Precio no valido");
        }

        sc.close();
    }
}
