import java.util.Scanner;

public class BonoProductividad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario, bono, total;
        int productividad;

        System.out.println("=== BONO POR PRODUCTIVIDAD ===");

        System.out.print("Ingrese el salario: ");
        salario = entrada.nextDouble();

        System.out.print("Ingrese las unidades producidas: ");
        productividad = entrada.nextInt();

        if (productividad >= 100) {
            bono = salario * 0.15;
        } else {
            bono = 0;
        }

        total = salario + bono;

        System.out.println("Salario: " + salario);
        System.out.println("Bono: " + bono);
        System.out.println("Salario total: " + total);

        entrada.close();
    }
}
