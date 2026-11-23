import java.util.Scanner;

public class LaboratorioUTPL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double horas, costo, total;

        System.out.print("Ingrese las horas utilizadas: ");
        horas = sc.nextDouble();

        System.out.print("Ingrese el costo por hora: ");
        costo = sc.nextDouble();

        total = horas * costo;

        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}
