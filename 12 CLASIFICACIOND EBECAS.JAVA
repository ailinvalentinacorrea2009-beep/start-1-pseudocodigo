import java.util.Scanner;

public class ClasificacionBecas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double promedio;

        System.out.print("Ingrese el promedio: ");
        promedio = sc.nextDouble();

        if (promedio >= 9 && promedio <= 10) {
            System.out.println("Beca completa");
        } else if (promedio >= 8) {
            System.out.println("Media beca");
        } else if (promedio >= 7) {
            System.out.println("Beca parcial");
        } else if (promedio >= 0) {
            System.out.println("Sin beca");
        } else {
            System.out.println("Promedio no valido");
        }

        sc.close();
    }
}
