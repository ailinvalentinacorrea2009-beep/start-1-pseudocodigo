import java.util.Scanner;

public class TarifaParking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horas;
        double total;

        System.out.print("Ingrese las horas de parqueo: ");
        horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("Horas no validas");
        } else if (horas == 1) {
            total = 1.00;
            System.out.println("Total: $" + total);
        } else {
            total = 1.00 + (horas - 1) * 0.50;
            System.out.println("Total: $" + total);
        }

        sc.close();
    }
}
