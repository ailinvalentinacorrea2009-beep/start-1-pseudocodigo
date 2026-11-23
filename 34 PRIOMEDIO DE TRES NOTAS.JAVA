import java.util.Scanner;

public class PromedioTresNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la primera nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = sc.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio es: " + promedio);

        if (promedio >= 7) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }

        sc.close();
    }
}
