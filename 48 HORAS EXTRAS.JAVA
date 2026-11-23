import java.util.Scanner;

public class HorasExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double horas, pago, sueldo;

        System.out.print("Ingrese horas trabajadas: ");
        horas = sc.nextDouble();

        System.out.print("Ingrese pago por hora: ");
        pago = sc.nextDouble();

        if (horas <= 40 && horas >= 0 && pago >= 0) {
            sueldo = horas * pago;
        } else if (horas > 40 && pago >= 0) {
            sueldo = (40 * pago) +
                     ((horas - 40) * pago * 1.5);
        } else {
            System.out.println("Datos no validos");
            sc.close();
            return;
        }

        System.out.println("Sueldo semanal: $" + sueldo);

        sc.close();
    }
}
