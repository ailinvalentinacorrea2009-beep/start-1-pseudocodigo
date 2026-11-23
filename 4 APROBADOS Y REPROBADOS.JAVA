import java.util.Scanner;

public class AprobadosReprobados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alumnos, aprobados = 0, reprobados = 0;
        double nota;

        System.out.println("=== APROBADOS Y REPROBADOS ===");

        System.out.print("Ingrese el numero de alumnos: ");
        alumnos = entrada.nextInt();

        for (int i = 1; i <= alumnos; i++) {

            System.out.print("Ingrese la nota del alumno " + i + ": ");
            nota = entrada.nextDouble();

            if (nota >= 7 && nota <= 10) {
                aprobados++;
            } else if (nota >= 0 && nota < 7) {
                reprobados++;
            } else {
                System.out.println("Nota invalida");
                i--;
            }
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
        System.out.println("Total de alumnos: " + alumnos);

        entrada.close();
    }
}
