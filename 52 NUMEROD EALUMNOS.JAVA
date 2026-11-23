import java.util.Scanner;

public class NumeroAlumnos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alumnos;
        double nota, suma = 0, promedio;

        System.out.print("Ingrese numero de alumnos: ");
        alumnos = sc.nextInt();

        if (alumnos > 0) {

            for (int i = 1; i <= alumnos; i++) {

                System.out.print("Nota del alumno " + i + ": ");
                nota = sc.nextDouble();

                suma = suma + nota;
            }

            promedio = suma / alumnos;

            System.out.println("Promedio de la clase: " + promedio);

        } else {
            System.out.println("Cantidad no valida");
        }

        sc.close();
    }
}
