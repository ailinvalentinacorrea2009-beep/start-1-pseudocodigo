import java.util.Scanner;

public class RegistroAnalisisVentas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadProductos;
        double precio, cantidad, venta;
        double total = 0, promedio;

        System.out.print("Ingrese cantidad de productos: ");
        cantidadProductos = sc.nextInt();

        if (cantidadProductos > 0) {

            for (int i = 1; i <= cantidadProductos; i++) {

                System.out.println("PRODUCTO " + i);

                System.out.print("Ingrese el precio: ");
                precio = sc.nextDouble();

                System.out.print("Ingrese la cantidad vendida: ");
                cantidad = sc.nextDouble();

                venta = precio * cantidad;

                total = total + venta;

                System.out.println("Venta: " + venta);
            }

            promedio = total / cantidadProductos;

            System.out.println("TOTAL DE VENTAS: " + total);
            System.out.println("PROMEDIO DE VENTAS: " + promedio);

        } else {
            System.out.println("Cantidad no valida");
        }

        sc.close();
    }
}
