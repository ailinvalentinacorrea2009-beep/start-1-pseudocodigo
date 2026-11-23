import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double metros, centimetros;

        System.out.print("Ingrese los metros: ");
        metros = sc.nextDouble();

        centimetros = metros * 100;

        System.out.println("Centimetros: " + centimetros);

        sc.close();
    }
}
