import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        double nota, suma = 0, promedio;

        System.out.print("Cuantas notas ingresara: ");
        cantidad = sc.nextInt();

        if (cantidad > 0) {

            for (int i = 1; i <= cantidad; i++) {

                System.out.print("Ingrese la nota " + i + ": ");
                nota = sc.nextDouble();

                suma = suma + nota;
            }

            promedio = suma / cantidad;

            System.out.println("El promedio es: " + promedio);

        } else {
            System.out.println("Cantidad no valida");
        }

        sc.close();
    }
}
