import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double kilometros, total;

        System.out.print("Ingrese los kilometros recorridos: ");
        kilometros = sc.nextDouble();

        if (kilometros >= 0) {

            total = 1.50 + (kilometros * 0.50);

            System.out.println("Total a pagar: $" + total);

        } else {
            System.out.println("Distancia no valida");
        }

        sc.close();
    }
}
