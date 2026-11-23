import java.util.Scanner;

public class NumeroDel1Al7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero del 1 al 7: ");
        numero = sc.nextInt();

        if (numero >= 1 && numero <= 7) {
            System.out.println("Numero valido");
        } else {
            System.out.println("Numero fuera de rango");
        }

        sc.close();
    }
}
