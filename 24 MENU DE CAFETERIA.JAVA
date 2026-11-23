import java.util.Scanner;

public class MenuCafeteria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion, cantidad;
        double precio = 0, total;

        System.out.println("MENU DE CAFETERIA");
        System.out.println("1. Cafe - $1.50");
        System.out.println("2. Sanduche - $2.50");
        System.out.println("3. Jugo - $1.25");
        System.out.println("4. Pastel - $2.00");

        System.out.print("Seleccione un producto: ");
        opcion = sc.nextInt();

        System.out.print("Ingrese la cantidad: ");
        cantidad = sc.nextInt();

        switch (opcion) {
            case 1:
                precio = 1.50;
                break;
            case 2:
                precio = 2.50;
                break;
            case 3:
                precio = 1.25;
                break;
            case 4:
                precio = 2.00;
                break;
            default:
                System.out.println("Opcion no valida");
        }

        if (opcion >= 1 && opcion <= 4 && cantidad > 0) {
            total = precio * cantidad;
            System.out.println("Total a pagar: " + total);
        } else {
            System.out.println("Datos no validos");
        }

        sc.close();
    }
}
