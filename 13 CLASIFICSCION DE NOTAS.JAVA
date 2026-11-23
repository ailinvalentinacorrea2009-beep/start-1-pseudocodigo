import java.util.Scanner;

public class ClasificacionNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese la nota: ");
        nota = sc.nextDouble();

        if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bueno");
        } else if (nota >= 5) {
            System.out.println("Regular");
        } else if (nota >= 0) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Nota no valida");
        }

        sc.close();
    }
}
