import java.util.Scanner;

public class SueldoSemanal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double horas, pago, sueldo;

        System.out.print("Ingrese las horas trabajadas: ");
        horas = sc.nextDouble();

        System.out.print("Ingrese el pago por hora: ");
        pago = sc.nextDouble();

        if (horas <= 40) {
            sueldo = horas * pago;
        } else {
            sueldo = (40 * pago) +
                     ((horas - 40) * pago * 1.5);
        }

        System.out.println("Sueldo semanal: " + sueldo);

        sc.close();
    }
}
