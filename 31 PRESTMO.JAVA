import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double monto, cuota;
        int meses;

        System.out.print("Ingrese el monto del prestamo: ");
        monto = sc.nextDouble();

        System.out.print("Ingrese el numero de meses: ");
        meses = sc.nextInt();

        if (monto > 0 && meses > 0) {
            cuota = monto / meses;

            System.out.println("Cuota mensual: " + cuota);
        } else {
            System.out.println("Datos no validos");
        }

        sc.close();
    }
}
