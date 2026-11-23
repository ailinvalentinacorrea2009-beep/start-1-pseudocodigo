import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        boolean primo = true;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero < 2) {
            primo = false;
        } else {

            for (int i = 2; i < numero; i++) {

                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        sc.close();
    }
}
