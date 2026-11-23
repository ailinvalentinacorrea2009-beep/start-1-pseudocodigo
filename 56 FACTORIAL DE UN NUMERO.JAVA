import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero >= 0 && numero <= 20) {

            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial: " + factorial);

        } else {
            System.out.println("Numero no valido");
        }

        sc.close();
    }
}
