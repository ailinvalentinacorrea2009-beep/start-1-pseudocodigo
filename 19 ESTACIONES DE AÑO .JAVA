import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int estacion;

        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otono");
        System.out.println("4. Invierno");

        System.out.print("Seleccione una estacion: ");
        estacion = sc.nextInt();

        switch (estacion) {
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verano");
                break;
            case 3:
                System.out.println("Otono");
                break;
            case 4:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Opcion no valida");
        }

        sc.close();
    }
}
