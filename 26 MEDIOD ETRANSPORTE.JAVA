import java.util.Scanner;

public class MedioTransporte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("1. Terrestre");
        System.out.println("2. Aereo");
        System.out.println("3. Acuatico");

        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Automovil, bus o bicicleta");
                break;
            case 2:
                System.out.println("Avion o helicoptero");
                break;
            case 3:
                System.out.println("Barco o lancha");
                break;
            default:
                System.out.println("Opcion no valida");
        }

        sc.close();
    }
}
