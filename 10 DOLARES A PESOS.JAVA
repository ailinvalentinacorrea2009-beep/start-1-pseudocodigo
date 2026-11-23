import java.util.Scanner;

public class DolaresPesos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dolares, tasa, pesos;

        System.out.print("Ingrese los dolares: ");
        dolares = sc.nextDouble();

        System.out.print("Ingrese la tasa de cambio: ");
        tasa = sc.nextDouble();

        pesos = dolares * tasa;

        System.out.println("Total en pesos: " + pesos);

        sc.close();
    }
}
